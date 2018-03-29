package test1.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class yatestListWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://yandex.ru/");
        driver.findElement(By.id("text")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        List<WebElement> elements = driver.findElements(By.className("link link_theme_normal organic__url link_cropped_no i-bem link_js_inited"));
        System.out.println(elements);
       // ("Selenium Webdriver Tutorial - Step by Step Lessons")
        int pageNumber=1;

        for (WebElement element : elements)
        {
            if (elements.contains("Selenium Webdriver Tutorial - Step by Step Lessons")) {
                System.out.println("Ссылка найдена на странице: " + pageNumber);

            } else {
                driver.findElement(By.linkText("дальше")).click();
                pageNumber++;
            }
        }

    }
}
