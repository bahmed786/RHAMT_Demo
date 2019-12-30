package com.rhamt.rules.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

	@Autowired
	private ApplicationProperties appprops;
	
	@Autowired
	private TestClassWithURL testJavaClasswithURLs;

	@Autowired
	private TestClassWithSocket  testJavaClassWithSocket;
	
	
	public void runService() {
		
		//Print Web URLS from property file
		System.out.println("\n ------- Web URLS from property file ------- \n" + appprops.getAppProperties());

		//Print Web URLS from Java file
		System.out.println("\n ------- Web URLS from Java class file -------");
		testJavaClasswithURLs.printURLS();

		
	}
	
	
}
