package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration
{
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
        String data=driver.findElement(By.xpath("//form/div[1]/div[@class=\"title\"]/strong")).getText();
        System.out.println(data);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Krishna");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Sanghani");
        driver.findElement(By.id("Email")).sendKeys("krishna.sanghani0@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Krishna@");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Krishna@");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        String result= driver.findElement(By.xpath("//div[@class='page registration-result-page']/div/div[1]")).getText();

        System.out.println(result);
    }
}
