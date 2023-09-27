package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Alina S");
        WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.sendKeys("alinas@gmail.com");
        WebElement CurrentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        CurrentAddress.sendKeys("Chicago,IL");
        WebElement PermanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        PermanentAddress.sendKeys("USA");
        WebElement SubmitButton= driver.findElement(By.xpath("//button[@id='submit']"));
        SubmitButton.click();
        Thread.sleep(2000);
        driver.close();
    }
}
