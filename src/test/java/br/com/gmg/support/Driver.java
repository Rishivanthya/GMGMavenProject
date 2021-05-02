package br.com.gmg.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;


public class Driver {
	
	public static WebDriver driver;
	public static String OS = System.getProperty("os.name").toLowerCase();
	private static final OptionChrome optionChrome = new OptionChrome();


	public static WebDriver getDriver(){
		if(driver == null){
			try {
				if(Browser.CHROME.equals(Property.BROWSER_NAME)){
					System.setProperty("webdriver.chrome.driver", getFileDriverPathChrome().getAbsolutePath());
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}

				if(Browser.REMOTECHROME.equals(Property.BROWSER_NAME)){
					System.setProperty("webdriver.chrome.driver", getFileDriverPathChrome().getAbsolutePath());
					driver = new RemoteWebDriver(new URL(Property.GRIDURL), optionChrome.getChromeOptions());
				}

			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
		return driver;
	}

	//detectando Sistema Operacional
	public static boolean isWindows(){
		return (OS.indexOf("win") >= 0);
	}


	public static boolean isMac(){
		return (OS.indexOf("mac") >= 0);
	}

	//Buscar arquivo do driver
	public static File getFileDriverPathChrome() throws Exception{
		File file = null;
		if(isWindows()){
			file = new File(Property.CHROME_DRIVE_PATH);
		}
		else if(isMac()){
			file = new File(Property.CHROME_DRIVE_MAC_PATH);
		}else
			throw new Exception("Sistema operacional nao compativel");
		return file;
	}

}
