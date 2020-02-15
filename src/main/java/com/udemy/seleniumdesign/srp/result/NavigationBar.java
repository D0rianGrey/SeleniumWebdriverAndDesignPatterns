package com.udemy.seleniumdesign.srp.result;

import com.udemy.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent {

    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(xpath = "//a[@class='q qs' and contains(text(),'Зображення')]")
    private WebElement images;

    @FindBy(xpath = "//a[@class='q qs' and contains(text(),'Новини')]")
    private WebElement news;

    @FindBy(xpath = "//a[@class='q qs' and contains(text(),'Videos')]")
    private WebElement video;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void goToImages(){
        this.images.click();
    }

    public void goToNews(){
        this.news.click();
    }

    public void goToVideo(){
        this.video.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((driver -> this.bar.isDisplayed()));
    }
}
