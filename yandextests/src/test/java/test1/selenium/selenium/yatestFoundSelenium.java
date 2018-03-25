package test1.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class yatestFoundSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://yandex.ru/");
        driver.findElement(By.id("text")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement element = driver.findElement(By.className("organic__url-text"));
        for (char i='1'; i<'5'; i++)
        {
            if (element.findElements(By.tagName("dev")).get(i).getText().equals("Selenium Webdriver Tutorial - Step by Step Lessons")) {
                element.findElements(By.tagName("dev")).get(i).click();
                System.out.println("Ссылка найдена на странице: "+i);
                break;
            }
            else {
                System.out.println("Ссылка не найдена на странице: "+i);
                driver.findElement(By.linkText("дальше")).click();
                sleep(1000);

            }
        }

    }
}



