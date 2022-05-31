package com.planetpope.seleniumtests.firefox;

import com.planetpope.seleniumtests.abstracts.AbstractJenkinsHomepage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import import org.openqa.selenium.remote.DesiredCapabilities;


public class JenkinsHomepageTest extends AbstractJenkinsHomepage {
  @BeforeAll
  static void setupClass() {
    WebDriverManager.firefoxdriver().setup();
  }

  @BeforeEach
  void setupTest() {
    /*FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--headless");
    driver = new FirefoxDriver(options);*/
   DesiredCapabilities capabilities = DesiredCapabilities.firefox();
   capabilities.setCapability("marionette", true);
   WebDriver driver = new FirefoxDriver(capabilities);
  }
}
