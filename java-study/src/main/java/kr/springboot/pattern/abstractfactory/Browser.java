package kr.springboot.pattern.abstractfactory;

public class Browser implements BrowserFactory {

    private final Button button;
    private final BackPress backPress;

    public Browser(Button button, BackPress backPress) {
        this.button = button;
        this.backPress = backPress;
    }

    @Override
    public void clickButton() {
        button.click();
    }

    @Override
    public void clickBackPress() {
        backPress.back();
    }

}
