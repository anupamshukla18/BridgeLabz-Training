package com.linkedlist.singly.socialmediafriends;

public class UserNode {
	int userId;
	String name;
	int age;
	FriendNode friends;
	UserNode next;

	// constructor for user node
	public UserNode(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.friends = null;
		this.next = null;
	}
	
	

}
