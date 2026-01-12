package com.texteditor;

import java.util.Stack;

class TextEditor {

	private String content = ""; // current text in editor

	// Stack to store undo actions
	private Stack<Action> undoStack = new Stack<>();

	// Stack to store redo actions
	private Stack<Action> redoStack = new Stack<>();

	// Insert text into editor
	public void insert(String text) {
		content += text;
		undoStack.push(new Action("insert", text));
		redoStack.clear(); // clear redo after new action
	}

	// Delete last n characters
	public void delete(int n) {

		if (n > content.length()) {
			System.out.println("Cannot delete more characters than present.");
			return;
		}

		String deletedText = content.substring(content.length() - n);
		content = content.substring(0, content.length() - n);

		undoStack.push(new Action("delete", deletedText));
		redoStack.clear();
	}

	// Undo last action
	public void undo() {

		if (undoStack.isEmpty()) {
			System.out.println("Nothing to undo.");
			return;
		}

		Action action = undoStack.pop();

		if (action.type.equals("insert")) {
			content = content.substring(0, content.length() - action.text.length());
		} else if (action.type.equals("delete")) {
			content += action.text;
		}

		redoStack.push(action);
	}

	// Redo last undone action
	public void redo() {

		if (redoStack.isEmpty()) {
			System.out.println("Nothing to redo.");
			return;
		}

		Action action = redoStack.pop();

		if (action.type.equals("insert")) {
			content += action.text;
		} else if (action.type.equals("delete")) {
			content = content.substring(0, content.length() - action.text.length());
		}

		undoStack.push(action);
	}

	// Display current editor text
	public void display() {
		System.out.println("Current Text: \"" + content + "\"");
	}
}
