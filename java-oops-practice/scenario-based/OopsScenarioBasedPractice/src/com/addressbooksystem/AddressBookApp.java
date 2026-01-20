package com.addressbooksystem;

public class AddressBookApp {

	public static void main(String[] args) {

		AddressBook book = new AddressBook();

		Contact c1 = new Contact("Anuj", "Dwivedi", "9876543210", "anuj@gmail.com",
				new Address("Bhopal", "MP", "462001"));

		Contact c2 = new Contact("Ravi", "Sharma", "9123456789", "ravi@gmail.com",
				new Address("Indore", "MP", "452001"));

		book.addContact(c1);
		book.addContact(c2);

		System.out.println("\nAll Contacts:");
		book.displayAllContacts();

		System.out.println("\nSearch by City:");
		book.searchByCityOrState("Bhopal");

		System.out.println("\nEdit Contact:");
		book.editContact("Anuj Dwivedi", "9999999999", "anuj_new@gmail.com");

		System.out.println("\nDelete Contact:");
		book.deleteContact("Ravi Sharma");

		System.out.println("\nFinal Contact List:");
		book.displayAllContacts();
	}
}
