package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.CarWorkPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class CarWorkSteps {


    @And("User enters LetTheCarWork")
    public void open_Car_Work_Page() {
        new HomePage(driver).click_on_let_the_car_work();

    }

    @And("User enters car details:")
    public void enter_car_details() {
        new CarWorkPage(driver).enter_car_details("Haifa","Kia","Rio",
                "2010","Diesel","4","C","AA7777AA","200");

    }

    @And("User adding photo")
    public void click_on_adding_photo_bottom() {
        new CarWorkPage(driver).click_add_photo("C:/Users/alona/OneDrive/Изображения/Screenshots/2021-Kia-Rio-Hatch-2.jpg");

    }

    @And("User clicks Submit button")
    public void click_on_Submit_bottom() {
        new CarWorkPage(driver).click_submit_button();
    }

    @Then("User successfully added new car")
    public void verifyCarAdded() {
        new CarWorkPage(driver).successfully_car_added("Car added");
    }
}

