package com.linkedlist.singly.socialmediafriends;

public class SocialMediaList {
	private UserNode head;

	// add new user
	public void addUser(int id, String name, int age) {
		UserNode newUser = new UserNode(id, name, age);
		newUser.next = head;
		head = newUser;
		System.out.println("User added successfully");
	}

	// find user by id
	public UserNode findUserById(int id) {
		UserNode temp = head;

		while (temp != null) {
			if (temp.userId == id) {
				return temp;
			}
			temp = temp.next;
		}
		return null;

	}

	// add friend connection both sides
	public void addFriendConnection(int id1, int id2) {
		UserNode user1 = findUserById(id1);
		UserNode user2 = findUserById(id2);

		if (user1 == null || user2 == null) {
			System.out.println("One or Both user not find");
			return;
		}

		addFriend(user1, id2);
		addFriend(user2, id1);

		System.out.println("Friend Connection added");
	}

	private void addFriend(UserNode user, int friendId) {
		FriendNode newFriend = new FriendNode(friendId);
		newFriend.next = user.friends;
		user.friends = newFriend;
	}

	// remove friend connection
	public void removeFriendConnection(int id1, int id2) {
		UserNode user1 = findUserById(id1);
		UserNode user2 = findUserById(id2);

		if (user1 == null || user2 == null) {
			System.out.println("friend not find");
			return;
		}

		removeFriend(user1, id2);
		removeFriend(user2, id1);

		System.out.println("Friend Connection removed");
	}

	private void removeFriend(UserNode user, int friendId) {
		FriendNode curr = user.friends, prev = null;

		while (curr != null) {
			if (curr.friendId == friendId) {
				if (prev == null)
					user.friends = curr.next;
				else
					prev.next = curr.next;

				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}

	// display friends for a user

	public void displayFriends(int userId) {
		UserNode user = findUserById(userId);

		if (user == null) {
			System.out.println("User not find");
			return;
		}

		System.out.println("Friends of " + user.name + ":");
		FriendNode temp = user.friends;

		if (temp == null) {
			System.out.println("No Friends");
			return;
		}

		while (temp != null) {
			System.out.println("Friend ID: " + temp.friendId);
			temp = temp.next;
		}

	}

	// Search by User ID
	public void searchById(int id) {
		UserNode user = findUserById(id);
		if (user != null)
			displayUser(user);
		else
			System.out.println("User not found.");
	}

	// search by name
	public void searchByName(String name) {
		UserNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {
				displayUser(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("User not found");
		}
	}

	// count friend for each user
	public void countFriends() {
		UserNode temp = head;

		while (temp != null) {
			int count = 0;
			FriendNode f = temp.friends;

			while (f != null) {
				count++;
				f = f.next;
			}

			System.out.println(temp.name + " has " + count + " friends.");
			temp = temp.next;
		}
	}

	// display user

	private void displayUser(UserNode u) {
		System.out.println("User ID: " + u.userId + ", Name: " + u.name + ", Age: " + u.age);
	}

}
