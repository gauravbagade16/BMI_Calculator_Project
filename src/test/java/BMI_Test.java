import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BMI_Test {

    WebDriver driver;

    @BeforeTest
    // Method for start web browser using WebDriverManager
    public  void Set_Driver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.calculator.net/bmi-calculator.html?ctype=metric");
        driver.manage().window().maximize();

    }

    @AfterTest
    //Method for close web browser
    public  void close_driver(){

        driver.close();

    }


    // First Testcase where age=20, gender=male,height=180cm, weight=60kg
    @Test(priority = 0)
    public void calculate() throws InterruptedException {

        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]")).click();Thread.sleep(1000);
       WebElement e1= driver.findElement(By.id("cage"));
       Thread.sleep(1000);
       e1.sendKeys("20");
       WebElement radio1=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/label[1]"));
       radio1.click();
       WebElement h1= driver.findElement(By.id("cheightmeter"));
       h1.sendKeys("180");
       WebElement kg1= driver.findElement(By.id("ckg"));
       kg1.sendKeys("60");
       Thread.sleep(1000);
       WebElement res=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[2]"));
       res.click();
       WebElement actual= driver.findElement(By.tagName("b"));
       String s1= actual.getText();
       Assert.assertEquals("BMI = 18.5 kg/m2",s1);


    }

    // Second Testcase where age=35, gender=female,height=160cm, weight=55kg
    @Test(priority = 1)
    public void calculate1() throws InterruptedException {

        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]")).click();Thread.sleep(1000);
        WebElement e1= driver.findElement(By.id("cage"));
        Thread.sleep(1000);
        e1.sendKeys("35");
        WebElement radio1=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/label[2]"));
        radio1.click();
        WebElement h1= driver.findElement(By.id("cheightmeter"));
        h1.sendKeys("160");
        WebElement kg1= driver.findElement(By.id("ckg"));
        kg1.sendKeys("55");
        Thread.sleep(1000);
        WebElement res=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[2]"));
        res.click();
        WebElement actual= driver.findElement(By.tagName("b"));
        String s1= actual.getText();
        Assert.assertEquals("BMI = 21.5 kg/m2",s1);


    }

    // Third Testcase where age=50, gender=male,height=175cm, weight=65kg
    @Test(priority = 2)
    public void calculate3() throws InterruptedException {

        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]")).click();Thread.sleep(1000);
        WebElement e1= driver.findElement(By.id("cage"));
        Thread.sleep(1000);
        e1.sendKeys("50");
        WebElement radio1=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/label[1]"));
        radio1.click();
        WebElement h1= driver.findElement(By.id("cheightmeter"));
        h1.sendKeys("175");
        WebElement kg1= driver.findElement(By.id("ckg"));
        kg1.sendKeys("65");
        Thread.sleep(1000);
        WebElement res=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[2]"));
        res.click();
        WebElement actual= driver.findElement(By.tagName("b"));
        String s1= actual.getText();
        Assert.assertEquals("BMI = 21.2 kg/m2",s1);

    }

    // Fourth Testcase where age=45, gender=female,height=150cm, weight=52kg
    @Test(priority = 3)
    public void calculate4() throws InterruptedException {

        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]")).click();Thread.sleep(1000);
        WebElement e1= driver.findElement(By.id("cage"));
        Thread.sleep(1000);
        e1.sendKeys("45");
        WebElement radio1=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/label[2]"));
        radio1.click();
        WebElement h1= driver.findElement(By.id("cheightmeter"));
        h1.sendKeys("150");
        WebElement kg1= driver.findElement(By.id("ckg"));
        kg1.sendKeys("52");
        Thread.sleep(1000);
        WebElement res=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[2]"));
        res.click();
        WebElement actual= driver.findElement(By.tagName("b"));
        String s1= actual.getText();
        Assert.assertEquals("BMI = 23.1 kg/m2",s1);


    }
}
