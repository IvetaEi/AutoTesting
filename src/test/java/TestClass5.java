import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestClass5 {
//    @BeforeTest
//    public void SetupWebDriver() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        _globalDriver = new ChromeDriver(options);
//        _globalDriver.get("https://vynoteka.lt/");
//        _globalDriver.manage().window().maximize();
//    }
    public static boolean assertEquals(String actual, String expected) {
        return actual.equals(expected);
    }
    public static String generateRandomNr() {
        String[] characters = {"0123456789"};

        Random random = new Random();

        StringBuilder nr = new StringBuilder();

        int usernameLength = 7 ;
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(1)];
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            nr.append(randomChar);
        }
        return nr.toString();
    }
    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        // Adding '@' symbol
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }

    @Test
    public void Vynoteka1() {
        String subText = "PRENUMERUOTI";
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://vynoteka.lt/");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        WebElement ageButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"));
        ageButton.click();

        try {
            TimeUnit.SECONDS.sleep(23);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement titleText = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div/button"));
        Assert.assertEquals(titleText.getText(), subText);
    }

    @Test
    public void Vynoteka2() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://vynoteka.lt/");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        WebElement ageButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"));
        ageButton.click();

        try {
            TimeUnit.SECONDS.sleep(23);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void Vynoteka3() {
        String marsText = "Mars Šokoladiniai batonėliai 2 x 35 g";
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://vynoteka.lt/");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        WebElement ageButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"));
        ageButton.click();

        try {
            TimeUnit.SECONDS.sleep(23);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div/input")).sendKeys(generateRandomEmail());
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[1]/form/div[4]/div[2]/div/label/div[1]")).click();
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div")).click();
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button/div")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement adButton = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button/span"));
        adButton.click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[3]/div/div/div[1]/div/div[1]/div/nav/div[5]/div/button/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[3]/div/div/div[1]/div/div[1]/div/nav/div[5]/div/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/nav/div[5]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[3]/div/div/div[1]/div/div[1]/div/nav/div[5]/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/nav/div[1]")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]")).click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement marsButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]"));
        marsButton.click();
        WebElement titleText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[1]/h3"));
        Assert.assertEquals(titleText.getText(), marsText);

    }

    @Test
    public void Vynoteka4() {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://vynoteka.lt/");

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
            cookieButton.click();
            WebElement ageButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"));
            ageButton.click();

            try {
                TimeUnit.SECONDS.sleep(23);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();

            try {
                TimeUnit.SECONDS.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement adButton = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button/span"));
            adButton.click();
            driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button")).click();

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement regButton = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/button"));
            regButton.click();
            driver.findElement(By.id("firstname")).sendKeys("Vyno");
            driver.findElement(By.id("lastname")).sendKeys("Teka");
            driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[1]")).click();

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement yearButton = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[8]"));
            yearButton.click();
            driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[1]")).click();

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement monthButton = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[2]"));
            monthButton.click();
            driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[1]")).click();

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            WebElement dayButton = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[1]"));
            dayButton.click();
            driver.findElement(By.id("email")).sendKeys(generateRandomEmail());
            driver.findElement(By.id("phone")).sendKeys("6"+generateRandomNr());

            driver.findElement(By.id("password")).sendKeys("Asdfg123456");
            driver.findElement(By.id("password_repeat")).sendKeys("Asdfg123456");

            WebElement rulesButton = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label/span"));
            rulesButton.click();
            WebElement reg2Button = driver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]"));
            reg2Button.click();
    }

    @Test
    public void Vynoteka5() {
        String marsText = "Mars Šokoladiniai batonėliai 2 x 35 g";
        String price1Text = "1.09 €";
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://vynoteka.lt/");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        WebElement ageButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"));
        ageButton.click();

        try {
            TimeUnit.SECONDS.sleep(23);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement adButton = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button/span"));
        adButton.click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[3]/div/div/div[1]/div/div[1]/div/nav/div[5]/div/button/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[3]/div/div/div[1]/div/div[1]/div/nav/div[5]/div/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/nav/div[5]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[3]/div/div/div[1]/div/div[1]/div/nav/div[5]/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div/div/nav/div[1]")).click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement marsButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]"));
        marsButton.click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement regButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div[1]/div/button"));
        regButton.click();
        driver.findElement(By.id("firstname")).sendKeys("Vyno");
        driver.findElement(By.id("lastname")).sendKeys("Teka");
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div")).click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement chooseYearButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[5]"));
        chooseYearButton.click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement monthButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div"));
        monthButton.click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[2]")).click();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement dayButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div"));
        dayButton.click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[2]")).click();
        driver.findElement(By.id("email")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("phone")).sendKeys("6"+generateRandomNr());

        driver.findElement(By.id("password")).sendKeys("Asdfg123456");
        driver.findElement(By.id("password_repeat")).sendKeys("Asdfg123456");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement rulesButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label"));
        rulesButton.click();
        WebElement reg2Button = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button"));
        reg2Button.click();

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[1]/div[1]/button")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[1]/div/div/input")).sendKeys("Ateities g. 4A, Vilnius");
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div[1]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[2]/div/form/div[1]/div/button")).click();
        WebElement iframe = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/hr"));
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[2]/div/form/div/button")).click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div[2]")).click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement reserveTimeButton = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[2]/button"));
        reserveTimeButton.click();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div/div/div[2]/div[3]/div[1]")).click();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement mars1Text = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/a"));
        Assert.assertEquals(mars1Text.getText(),marsText);
        WebElement priceText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[3]/span"));
        Assert.assertEquals(priceText.getText(),price1Text);




//        WebElement titleText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[1]/h3"));
//        Assert.assertEquals(titleText.getText(), marsText);

    }

//    5. Prekės įsidėjimas į krepšelį, visų duomenų pristatymui suvedimas. Vėliau -> peržiūrėti krepšelį,
//    įsitikinti, kad jame yra būtent ta prekė, už būtent tą kainą, kurią pridėjome.

//    ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//    WebDriver driver = new ChromeDriver(options);

//        WebElement titleText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/h1/a"));
//        Assert.assertEquals(titleText.getText(),myTitle);
//        WebElement numberText = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/a"));
//        Assert.assertEquals(numberText.getText(),myNumber);
//        WebElement theText = driver.findElement(By.id("unit-details-content-text"));
//        Assert.assertEquals(theText.getText(),myText);
}

