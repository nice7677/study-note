package kr.springboot.pattern.abstractfactory;

public class App {

    public static void main(String[] args) {

        Browser androidBrowser = new Browser(new AndroidButton(), new AndroidBackPress());
        Browser iosBrowser = new Browser(new IosButton(), new IosBackPress());

        androidBrowser.clickBackPress();
        androidBrowser.clickButton();

        iosBrowser.clickBackPress();
        iosBrowser.clickButton();

    }

}
