package test1.selenium.YandexMarket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class YandexMarketTest {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\noshchepkov\\Desktop\\1\\ExLib\\chromedriver.exe");
        WebDriver driver=new FirefoxDriver();
        WebElement element;
        driver.get("https://market.yandex.ru");

        try{driver.findElement(By.className("navigation-horizontal-category__link_type_all-category")).click();}
        catch(org.openqa.selenium.WebDriverException Exc){}

        try{driver.findElement(By.xpath("/categories")).click();}
        catch(org.openqa.selenium.WebDriverException Exc){}

        try{driver.findElement(By.name("Все категории")).click();}
        catch(org.openqa.selenium.WebDriverException Exc){}

        driver.findElement(By.linkText("Детские товары")).click();
        //driver.findElement(By.linkText("Все категории")).click();

        driver.findElement(By.linkText("Конструкторы")).click();
        driver.findElement(By.name("glf-pricefrom-var")).sendKeys("1500");
        driver.findElement(By.name("glf-priceto-var")).sendKeys("2500");

        for(char ch='2';;ch++){
            if((driver.getPageSource().contains("LEGO Star Wars"))){
                driver.findElement(By.partialLinkText("LEGO Star Wars")).click();
                System.out.println("Конструктор Star Wars найден в списке товаров с ценой, лежащей заданном диапазоне");
                System.out.println("Название товара - "+driver.findElement(By.className("title")).getText()+"\nЦена товара - "+driver.findElement(By.className("price")).getText()+"\b\b рублей");
                break;
            }
            else {
                System.out.println("Не нашёл конструктор LEGO Star Wars на \""+driver.getTitle()+"\"");
                driver.get("https://market.yandex.ru/catalog/59749/list?hid=10470548&local-offers-first=0&deliveryincluded=0&onstock=1&pricefrom=1500&priceto=2500&page="+ch);
            }
        }
        driver.get("https://market.yandex.ru/catalog/59749/list?hid=10470548&track=pieces&local-offers-first=0");
        //driver.navigate().back();
        element = driver.findElement(By.className("input__control"));
        //element.clear();
        element.sendKeys("конструктор Знаток");
        element.submit();
        List<WebElement> elementsZnatok=driver.findElements(By.partialLinkText("Знаток"));
        System.out.println("Количество конструкторов Знаток на яндекс маркете = "+elementsZnatok.size());

        driver.get("https://market.yandex.ru/catalog/59749/list?hid=10470548&track=pieces&local-offers-first=0");
        element = driver.findElement(By.className("input__control"));
        element.sendKeys("радиоуправляемый конструктор ENGINO");
        element.submit();
        List<WebElement> elementsENGINO=driver.findElements(By.partialLinkText("ENGINO"));
        System.out.println("Количество радиоуправляемых конструкторов ENGINO на яндекс маркете = "+elementsENGINO.size());

//if ( !driver.findElement(By.id("glf-7893318-10516740")).isSelected() )
//{
        //driver.findElement(By.id("glf-7893318-10516740")).click();
//}


        if(elementsENGINO.size()!=elementsZnatok.size()) System.out.println("Количество найденных товаров на шаге 7 и 9 различно");
        else System.out.println("Количество найденных товаров на шаге 7 и 9 одинаково");
        driver.quit();
    }
}
//try{driver.findElement(By.cssSelector("input.checkbox__control")).click();}
//catch(org.openqa.selenium.WebDriverException Exc){System.out.println("n-filter-block__list.n-filter-block__list_type_more.more-list__top.i-bem не проканало");}

//try{driver.findElement(By.cssSelector("input.checkbox__control")).click();}
//catch(org.openqa.selenium.WebDriverException Exc){System.out.println("n-filter-block__list.n-filter-block__list_type_more.more-list__top.i-bem не проканало");}

//try{driver.findElement(By.id("#glf-7893318-10485192")).click();}
//catch(org.openqa.selenium.WebDriverException Exc){System.out.println("glf-7893318-10485192 не проканало");}
//driver.findElement(By.id("glf-10484483-1")).click();
//List<WebElement> elementsENGINO=driver.findElements(By.partialLinkText("ENGINO"));
// System.out.println("Количество радиоуправляемых конструкторов ENGINO на яндекс маркете = "+elementsENGINO.size());



