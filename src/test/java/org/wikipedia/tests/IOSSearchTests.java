package org.wikipedia.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.id;

public class IOSSearchTests extends TestBase {

    @Test
    @Tag("ios")
    @DisplayName("Проверка функции поиска (ios)")
    void checkOutputTextTest() {
        step("Click Text Button", () -> {
            $(id("Text Button")).click();
        });

        step(format("Set value %s in the input field and press enter", "Selenium"), () -> {
            $(id("Text Input")).click();
            $(id("Text Input")).sendKeys("Selenium");
            $(id("Text Input")).pressEnter();
        });

        step("Check Output text", () -> {
            assertEquals("Selenium", $(id("Text Output")).getText());
        });
    }
}