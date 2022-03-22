package com.syntax.homework;

public class ChromeDriver implements IWebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close chrome");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("minimize window");

    }

    @Override
    public void findElement() {
        System.out.println("found it");

    }
}
