package com.skillstorm;

public class TextPrinter {
	
	TextFormatter textFormatter;
	
	public TextPrinter() {
		this.textFormatter = new TextFormatter();
	}
	
	public void printText(String text) {
		this.textFormatter.setText(text);
		System.out.println(textFormatter.getText());
	}
	
	public void printEachWord(String text) {
		this.textFormatter.setText(text);
		String[] sentence = textFormatter.getText().split(" ");
		for(String word : sentence) {
			System.out.println(word);
			System.out.println(this.textFormatter.divider());
		}
	}
}