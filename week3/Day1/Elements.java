package week3.Day1;

public class Elements extends Button{

	public static void main(String[] args) {
		Elements ele = new Elements();
		RadioButton radio = new RadioButton();
		CheckBoxButton checkBox = new CheckBoxButton();
		WebElement element = new WebElement();
		TextField text = new TextField();
		Button button = new Button();
		element.click();
		element.setText("UserName");
		radio.selectRadioButton();
		checkBox.clickCheckButton();
		text.getText();
		button.submit();
		
	}

}
