package com.selenium_base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class selenium_base_class implements selenium_base_interface{
 
  private WebDriver driver;

  @Override
  public void setDriverLocation(String webBrowser, String path){
    if (webBrowser == "firefox")
      System.setProperty("webdriver.gecko.driver", path);
    else
      System.setProperty("webdriver.chrome.driver", path);
  }
  @Override 
  public WebDriver setDriver(){
    return new FirefoxDriver();  
  } 
  @Override
  public WebDriver setDriver(FirefoxOptions options){
    return new FirefoxDriver(options);
  }
  @Override
  public FirefoxOptions setOptions(){
    return new FirefoxOptions(); 
  }
  @Override
  public FirefoxOptions setOptions(String[] args){
    
    FirefoxOptions options = new FirefoxOptions();
    if (args != null){
      for (String option: args){
        if (option.charAt(0) == '-')
          options.addArguments(option);
       else
          options.addArguments("-" + option);
      }
    }
    return options;
  }
  @Override
  public WebDriver setUp(String webBrowser,String driver_path, String[] option_args){
    setDriverLocation(webBrowser, driver_path);
    FirefoxOptions options = setOptions(option_args);
    
    if (webBrowser == "firefox"){
      WebDriver driver = new FirefoxDriver(options);
    }
    else{ 
      //add later for chrome support 
      //THIS WILL NEVER BE NEEDED 
      //WebDriver driver = ChromiumDriver();
    }
    
    return driver;
  }
  @Override
  public WebDriver setUp(String webBrowser,String driver_path, String[] option_args, String url){
    
    setDriverLocation(webBrowser, driver_path);
    FirefoxOptions options = setOptions(option_args);
    
    if (webBrowser == "firefox"){
      WebDriver driver = new FirefoxDriver(options);
    }
    else{
      //add later for chrome support 
      //THIS WILL NEVER BE NEEDED 
      //WebDriver driver = ChromiumDriver();
    }
    
    driver.get(url);
    
    return driver;
  }  
}
