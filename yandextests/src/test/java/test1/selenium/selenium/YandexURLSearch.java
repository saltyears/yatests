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
        String serachTerm = "Selenium Webdriver Tutorial - Step by Step Lessons";
        String matchInUrl = "Selenium Webdriver Tutorial - Step by Step Lessons";


        driver.findElement(By.id("text")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        List<WebElement> resultsEntries = (List<WebElement>) driver.findElements(By.className("organic__url-text"));
        System.out.println(resultsEntries);
//      Страница результатов поиска
            int pageNumber=0;
            boolean foundMatch=false;
            String foundMatchingUrl="";
/*            while (!foundMatch){

                pageNumber++;
                String nextpagebuttonlinktext = "дальше";

            }*/
            //        Цикл поиска на странице
            for (WebElement element : resultsEntries) {
            String href = element.getAttribute("href");
            String title = element.getText();

            System.out.println(href);
            System.out.println(title);

            if (href.contains(matchInUrl)) {
                System.out.println("Ссылка найдена на странице: " + pageNumber);
                foundMatchingUrl = href;
                foundMatch = true;
            } else {
                driver.findElement(By.linkText("дальше")).click();
            }
        }}}