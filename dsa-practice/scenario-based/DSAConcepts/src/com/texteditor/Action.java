package com.texteditor;

class Action {

	String type; // insert or delete
	String text; // text involved in action

	// Constructor
	Action(String type, String text) {
		this.type = type;
		this.text = text;
	}
}
