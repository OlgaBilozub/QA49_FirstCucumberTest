package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CarWorkPage extends BasePage {

    public CarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='pickUpPlace']")
    WebElement addressField;

    @FindBy(xpath = "//input[@id='make']")
    WebElement manufactureField;

    @FindBy(xpath = "//input[@id='model']")
    WebElement modelField;

    @FindBy(xpath = "//input[@id='year']")
    WebElement yearField;

    @FindBy(xpath = "//select[@id='fuel']")
    WebElement fuelField;

    @FindBy(xpath = "//input[@id='seats']")
    WebElement seatsField;

    @FindBy(xpath = "//input[@id='class']")
    WebElement classCarField;


    @FindBy(xpath = "//input[@id='serialNumber']")
    WebElement numberField;

    @FindBy(xpath = "//input[@id='price']")
    WebElement priceField;

    public CarWorkPage enter_car_details(String address, String manufacture, String model, String year,
                                         String fuel, String seats, String classCar, String number, String price) {
        type(addressField, address);
        type(manufactureField, manufacture);
        type(modelField, model);
        type(yearField, year);
        new Select(fuelField).selectByVisibleText(fuel);
        type(seatsField, seats);
        type(classCarField, classCar);
        type(numberField, number);
        type(priceField, price);

        return this;
    }
@FindBy(xpath = "//input[@id='photos']")
WebElement addPhoto;

    public CarWorkPage click_add_photo(String filePath) {
        addPhoto.sendKeys(filePath);
        return this;
    }
@FindBy(xpath = "//button[contains(text(),'Submit')]")
WebElement submitButton;

    public CarWorkPage click_submit_button() {
        click(submitButton);
        return this;
    }
@FindBy(xpath = "//h1[contains(text(),'Car added')]")
WebElement carAdded;
    public CarWorkPage successfully_car_added(String message) {
        assert carAdded.getText().contains(message);
        return this;
    }
}
