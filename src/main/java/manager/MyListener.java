package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyListener extends AbstractWebDriverEventListener {

    Logger logger = LoggerFactory.getLogger(MyListener.class);

    public MyListener() {
        super();
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        super.beforeFindBy(by, element, driver);
        logger.info("Start searching element by ---> " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        super.afterFindBy(by, element, driver);
        logger.info("The element by ---> " + by + " is found");
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        super.onException(throwable, driver);
        logger.info("SOMETHING WENT WRONG!!!");
        logger.info(throwable.getMessage());
        logger.info(String.valueOf(throwable.fillInStackTrace()));
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        String link = "src/test/screenshots/screenshot-" + i + ".png";
        HelperBase helperBase = new HelperBase(driver);
        helperBase.takeScreenShot(link);
        logger.info("This is a link for screenshot with error ---> " + link);

    }
}