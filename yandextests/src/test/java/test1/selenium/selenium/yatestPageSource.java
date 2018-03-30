package test1.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class yatestPageSource {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://yandex.ru/");
        driver.findElement(By.id("text")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
/*        List<WebElement> elements = driver.findElements(By.className("link link_theme_normal organic__url link_cropped_no i-bem link_js_inited"));
        System.out.println(elements);*/
       // ("Selenium Webdriver Tutorial - Step by Step Lessons")
        //int pageNumber=1;
        /*link link_outer_yes link_theme_outer path__item i-bem link_js_inited*/
        //WebElement page = driver.findElement(By.className("pager__item pager__item_current_yes pager__item_kind_page)"));
        for(char pageNumber='1';;pageNumber++){
        {
            if (driver.getPageSource().contains("toolsqa.com")) {
                driver.findElement(By.partialLinkText("WebDriver Existence in package org.openqa.selenium")).click();
                //System.out.println("Ссылка найдена на странице: " + page.getText());
                System.out.println("Ссылка найдена на странице: " + pageNumber);
                //sleep(1000);
                break;

            } else {
                driver.findElement(By.linkText("дальше")).click();
                sleep(1000);
            }
        }

    }
}}

//class="link link_theme_normal organic__url link_cropped_no i-bem link_js_inited"
//class=favicon favicon_page_3