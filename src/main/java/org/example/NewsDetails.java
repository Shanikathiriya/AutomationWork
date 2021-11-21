package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsDetails
{
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//div[@class='buttons']/a[@href='/nopcommerce-new-release']")).click();
        driver.findElement(By.xpath("//input[@class='enter-comment-title']")).sendKeys("Krishna");
        driver.findElement(By.xpath("//div[@class='form-fields']/div[2]/textarea")).sendKeys("NiceProduct");
        driver.findElement(By.xpath("//div[@class='buttons']/button")).click();
        String data=driver.findElement(By.xpath("//div[@class='notifications']/div")).getText();
        System.out.println(data);

    }
}
