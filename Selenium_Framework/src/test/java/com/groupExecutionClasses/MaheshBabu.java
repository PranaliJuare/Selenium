package com.groupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MaheshBabu {
	@Test(groups = "TFI")
	public void executionScript() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/urstrulymahesh/?hl=en");
		driver.quit();
		
	}


}
