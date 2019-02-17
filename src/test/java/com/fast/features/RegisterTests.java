package com.fast.features;

import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    RegisterSteps registerSteps;

    @Before
    public void maximizePage() {
        driver.manage().window().maximize();
    }

    @Test
    public void validRegister() {
        registerSteps.validRegister();
    }

    @Test
    public void invalidRegister() {
        registerSteps.invalidRegister();
    }
}
