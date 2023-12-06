package com.skillstorm;

public final class TextFormatter {
	
	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String divider() {
		return "--------------------";
	}
	
	public String appendText(String input1, String input2) {
		return input1 + input2;
	}

	public String replaceWord(String input, String oldWord, String newWord) {
		if(input.contains(oldWord)) {
			text = input.replace(oldWord, newWord);
			return text;
		}else {
			System.out.println("Word not found");
			return input;
		}
	}
	
	public void printText() {
		System.out.println(this.getText());
	}

}
