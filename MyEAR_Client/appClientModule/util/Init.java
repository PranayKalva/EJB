package util;

import java.util.Properties;

import javax.naming.InitialContext;

public class Init {
	public static InitialContext getInit(){
		try{
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
		props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
		props.setProperty("java.naming.factory.state", "com.sun.cobra.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
		return new InitialContext(props);
	
}catch(Exception e){
	return null;
}}
}