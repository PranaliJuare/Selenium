package com.sample.testScripts;

import org.testng.annotations.Test;

public class Monster_Test {
    @Test
    public void executeScript() {
    	System.out.println("Hii");
    	String browserName= System.getProperty("bname");
    	System.out.println(browserName);
    	
    	String userName = System.getProperty("user");
    	System.out.println(userName);
    }
}
