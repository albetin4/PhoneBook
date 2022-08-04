package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    manager.HelperUser user;

    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        user = new manager.HelperUser(wd);
    }

    public void stop(){
        wd.quit();
    }

    public HelperUser getUser() {
        return user;
    }
}