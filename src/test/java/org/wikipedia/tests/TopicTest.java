package org.wikipedia.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.id;

public class TopicTest extends TestBase {

    @Test
    @DisplayName("Проверка элементов навигационного меню")
    void checkNavBarMenuButtons() {

        String buttonFirst = "Log in to Wikipedia",
                buttonSecond = "Settings",
                buttonThird = "Support Wikipedia";

        step("Click on the NavBar Menu button", () -> {
            $(id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        });
        step("Check button: " + buttonFirst, () -> {
            $(id("org.wikipedia.alpha:id/explore_overflow_account_name")).shouldHave(text(buttonFirst));
        });
        step("Check button: " + buttonSecond, () -> {
            $(id("org.wikipedia.alpha:id/explore_overflow_settings")).shouldHave(text(buttonSecond));
        });
        step("Check button: " + buttonThird, () -> {
            $(id("org.wikipedia.alpha:id/explore_overflow_donate")).shouldHave(text(buttonThird));
        });
    }

//    @Test
//    @DisplayName("Тест из примера под iOS")
//    void sampleIOSTest() {
//        step("Click Text Button", () -> {
//            $(id("Text Button")).click();
//        });
//
//        step("Check initial state Output text", () -> {
//            assertEquals("Waiting for text input.", $(id("Text Output")).getText());
//        });
//
//        step(format("Set value %s in the input field and press enter", "hello@browserstack.com"), () -> {
//            $(id("Text Input")).click();
//            $(id("Text Input")).sendKeys("hello@browserstack.com");
//            $(id("Text Input")).pressEnter();
//        });
//
//        step("Check Output text", () -> {
//            assertEquals("hello@browserstack.com", $(id("Text Output")).getText());
//        });
//    }
}