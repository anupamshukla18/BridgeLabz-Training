package com.linkedlist.doubly.undoredo;

class TextNode {
	String text;
	TextNode prev;
	TextNode next;

	public TextNode(String text) {
		this.text = text;
		this.prev = null;
		this.next = null;
	}
}
