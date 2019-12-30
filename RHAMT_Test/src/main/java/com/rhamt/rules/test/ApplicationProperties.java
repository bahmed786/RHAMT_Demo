package com.rhamt.rules.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Configuration
//@PropertySource("classpath:application.properties")
@Component
public class ApplicationProperties {

	    @Value("${appserver}")
	    private String app_server;
	
	    @Value("${appmailserver}")
	    private String app_mailserver;
	    
        @Override
        public String toString() {
            return "App Server : " + app_server + "\n" 
            + "App Mail Server : " + app_mailserver;
        }

        public String getAppProperties() {
            return "App Server : " + app_server + "\n" 
            + "App Mail Server : " + app_mailserver;
        }
        
        
}
