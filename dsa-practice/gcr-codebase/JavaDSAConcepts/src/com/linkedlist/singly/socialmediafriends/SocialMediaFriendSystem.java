package com.linkedlist.singly.socialmediafriends;

import java.util.Scanner;

public class SocialMediaFriendSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SocialMediaList list = new SocialMediaList();
		int choice;
		
		
		do {
			 System.out.println("\n=== Social Media Friend System ===");
	            System.out.println("1. Add User");
	            System.out.println("2. Add Friend Connection");
	            System.out.println("3. Remove Friend Connection");
	            System.out.println("4. Display Friends of User");
	            System.out.println("5. Search User by ID");
	            System.out.println("6. Search User by Name");
	            System.out.println("7. Count Friends of Each User");
	            System.out.println("8. Exit");
	            System.out.print("Enter choice: ");
	            
	            
	            choice = sc.nextInt();
	            sc.nextLine();

	            int id1, id2, age;
	            String name;
	            
	            switch(choice) {
	            case 1:
                    System.out.print("User ID: ");
                    id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Age: ");
                    age = sc.nextInt();
                    list.addUser(id1, name, age);
                    break;
                    
	            case 2:
                    System.out.print("User ID 1: ");
                    id1 = sc.nextInt();
                    System.out.print("User ID 2: ");
                    id2 = sc.nextInt();
                    list.addFriendConnection(id1, id2);
                    break;
               
	            case 3:
                    System.out.print("User ID 1: ");
                    id1 = sc.nextInt();
                    System.out.print("User ID 2: ");
                    id2 = sc.nextInt();
                    list.removeFriendConnection(id1, id2);
                    break;
                    
	            case 4:
                    System.out.print("User ID: ");
                    list.displayFriends(sc.nextInt());
                    break;
               
	            case 5:
                    System.out.print("User ID: ");
                    list.searchById(sc.nextInt());
                    break;

	            case 6:
                    System.out.print("Name: ");
                    list.searchByName(sc.nextLine());
                    break;

                case 7:
                    list.countFriends();
                    break;   
                    
                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    
	            }
	            
		}while(choice != 8);
	}
}
