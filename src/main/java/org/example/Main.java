package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);
//        open Url nopcommerce.com
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("admin");

        driver.findElement(By.name("password")).sendKeys("admin123");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);

        driver.findElement(By.className("oxd-main-menu-item-wrapper")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
        Thread.sleep(2000);

        WebElement dropdown = driver.findElement(By.cssSelector("div.oxd-select-text-input"));

        // النقر لفتح القائمة
        dropdown.click();

        // العثور على الخيار المطلوب باستخدام النص الظاهر
        WebElement option = driver.findElement(By.xpath("//span[text()='ESS']")); // استبدل 'Option 1' بالنص المطلوب

        Thread.sleep(2000);
        // النقر على الخيار لتحديده
        option.click();
//        driver.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text-input")).click();


        Thread.sleep(3000);

        WebElement inputField = driver.findElement(By.xpath("//div[contains(@class, 'oxd-autocomplete-text-input')]//input"));

        // إدخال النص "Ahmed" في الحقل
        inputField.sendKeys("Ahmed");
        Thread.sleep(3000);

        


        driver.quit();

        }
    }
