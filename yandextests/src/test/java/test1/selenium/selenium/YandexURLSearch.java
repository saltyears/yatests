package test1.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class YandexURLSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://yandex.ru/");
        driver.findElement(By.id("text")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("driver.findElements(By.className("organic__url-text"))");

        //        Цикл поиска на странице
//        for (int i='0'; i<='9'; i++)
//        {
//            if (driver.findElement(By.className("organic__url-text")).getText().equals("Selenium Webdriver Tutorial - Step by Step Lessons")) {
//                System.out.println("Ссылка найдена на странице: "+i);
//                break;
//            }
//            else {
//                System.out.println("Ссылка не найдена на странице: "+i);
//            }
//            if (i == '9')
//                driver.findElement(By.linkText("дальше")).click();
//                sleep(1000);
//
//            }
            }

        }




