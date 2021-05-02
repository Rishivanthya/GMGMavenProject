package br.com.gmg.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class LoggerUtil {

	private LoggerUtil(){ }
	
	    public static Logger getLogger(){
	        return LoggerFactory.getLogger(LoggerUtil.class);
	    }
}