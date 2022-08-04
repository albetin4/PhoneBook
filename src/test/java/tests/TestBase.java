package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    // WebDriver wd;
    public static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp(){
//        wd = new ChromeDriver();
//        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        app.init();
    }

    @AfterSuite
    public void tearDown(){
        // wd.quit();
        app.stop();
    }

//    public void logout() {
//        click(By.xpath("(//*[text()='Sign Out'])"));
//    }
//
//    public boolean isLogged() {
//        return isElementPresent(By.xpath("(//*[text()='Sign Out'])"));
//    }
//
//    public void submitRegistration() {
//        click(By.xpath("//button[2]"));
//    }
//
//    public void submitLogin() {
//        click(By.xpath("//button[1]"));
//    }
//
//    public void pause(int millis){
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }

//    public void fillLoginRegistrationForm(String email, String password) {
//        type(By.xpath("//input[1]"), email);
//        type(By.xpath("//input[2]"), password);
//    }
//
//    public void openLoginRegistrationForm() {
//        //  wd.findElement(By.xpath("//*[text()='LOGIN']")).click();
//        click(By.xpath("//*[text()='LOGIN']"));
//    }

//    public void click(By locator){
//        wd.findElement(locator).click();
//    }
//
//    public void type(By locator, String text){
//        if(text == null) return;
//        WebElement element = wd.findElement(locator);
//        element.click();
//        element.clear();
//        element.sendKeys(text);
//    }

//    public boolean isElementPresent(By locator){
//        return wd.findElements(locator).size() > 0;
//    }

}