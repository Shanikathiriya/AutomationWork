package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuildComputer
{
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[@href='/computers']")).click();
        driver.findElement(By.xpath("//div/a[@title='Show products in category Desktops']")).click();
        driver.findElement(By.xpath("//a[@title='Show details for Build your own computer']")).click();
        String data=driver.findElement(By.xpath("//div[@class='product-name']/h1")).getText();
        System.out.println(data);




    }
}
