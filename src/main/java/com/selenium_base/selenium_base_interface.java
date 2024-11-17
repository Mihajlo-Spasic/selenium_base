package com.selenium_base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public interface selenium_base_interface{
  
  public void setDriverLocation(String webBrowser, String path);
  
  public FirefoxOptions setOptions();
  public FirefoxOptions setOptions(String[] args);
  
  public WebDriver setDriver();
  public WebDriver setDriver(FirefoxOptions options);
 
  //void auth_by_redirect(); 
  //void auth_by_redirect(WebDriver driver,String redirect_url); 
 
  //static void auth_by_main() {};
  //static void auth_by_main(WebDriver driver) {};
  
  public WebDriver setUp(String webBrowser, String driver_path, String[] option_args);
  public WebDriver setUp(String webBrowser, String driver_path, String[] option_args, String url);

} 
