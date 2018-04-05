package test1.selenium.yamail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class yamailtestPageSource {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("https://yandex.ru/");
        driver.findElement(By.linkText("Войти в почту")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("boxmail2017");
        driver.findElement(By.name("passwd")).clear();
        driver.findElement(By.name("passwd")).sendKeys("fkmafvfqr");
        driver.findElement(By.className("passport-Button")).click();
        sleep(2000);
        System.out.println(driver.getPageSource());
/*        if (driver.getPageSource().contains("599080")) {
            System.out.println("code");
        }*/
            //System.out.println("-123".matches("-?\\d+"));


//html[@id='nb-1']/body/div[2]/div[3]/div/div[3]/div[3]/div[2]/div[5]/div/div/div/div[2]/div/div/div/div/div/a/div/span[2]/span[2]/span/span/span
//        driver.findElement(By.linkText("Realtimeboard Team")).click();
/*        driver.findElement(By.xpath("//html[@id='nb-1']/body/div[2]/div[3]/div/div[3]/div[3]/div[2]/div[5]/div/div/div/div[2]/div/div/div/div/div/a/div/span/span[2]")).click();
        driver.findElement(By.xpath("//html[@id='nb-1']/body/div[2]/div[3]/div/div[3]/div[3]/div[2]/div[5]/div/div/div[3]/div/div/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table[4]/tbody/tr[2]/td[2]/table/tbody/tr/td")).click();
        String code = driver.findElement(By.xpath("//html[@id='nb-1']/body/div[2]/div[3]/div/div[3]/div[3]/div[2]/div[5]/div/div/div[3]/div/div/table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr/td/table[4]/tbody/tr[2]/td[2]/table/tbody/tr/td")).getText();
   */ }
}

//        System.out.println("Ссылка найдена на странице: " + page.getText());
        //driver.findElement(By.id("text")).sendKeys("selenium webdriver");

        //driver.findElement(By.xpath("//button[@type='submit']")).click();
/*        List<WebElement> elements = driver.findElements(By.className("link link_theme_normal organic__url link_cropped_no i-bem link_js_inited"));
        System.out.println(elements);*/
       // ("Selenium Webdriver Tutorial - Step by Step Lessons")
        //int pageNumber=1;
        /*link link_outer_yes link_theme_outer path__item i-bem link_js_inited*/
        //WebElement page = driver.findElement(By.className("pager__item pager__item_current_yes pager__item_kind_page)"));
/*        for(char pageNumber='1';;pageNumber++){
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
}}*/

//class="link link_theme_normal organic__url link_cropped_no i-bem link_js_inited"
//class=favicon favicon_page_3
