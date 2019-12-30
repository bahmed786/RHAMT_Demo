package com.capgemini.rhamt.rules.test;

import org.springframework.stereotype.Component;

@Component
public class TestClassWithURL {

	public void printURLS() {
		
		String[] strURLs = new String[5];
		strURLs[0] = "www.azure.com";
		strURLs[1] = "www.google.com";
		strURLs[2] = "https://myConnect.capgemini.com";
		strURLs[3]= "bahmed@yahoo.com";
		strURLs[4]= "192.0.0.168";
		
				
		for (int a=0; a<strURLs.length; a++) {
			System.out.println(strURLs[a]);	
		}

	}

}
