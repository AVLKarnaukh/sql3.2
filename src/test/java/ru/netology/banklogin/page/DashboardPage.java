package ru.netology.banklogin.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private final SelenideElement heading = $("[data-test-id=dashboard]");

    // метод для проверки того что вы попали на страницу Dashboard
    public DashboardPage() {
        heading.shouldHave(text("Личный кабинет")).shouldBe(visible);
    }
}
