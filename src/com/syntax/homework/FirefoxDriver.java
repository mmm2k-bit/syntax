package com.syntax.homework;

public class FirefoxDriver implements IWebDriver{
    @Override
    public void openBrowser() {

        System.out.println("open firefox");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize");

    }

    @Override
    public void findElement() {
        System.out.println("minimize");

    }
}
