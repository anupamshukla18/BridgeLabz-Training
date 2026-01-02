package com.ewalletapp;

//Abstraction: transfer behavior
interface Transferrable {
	void transferTo(User receiver, double amount);
}
