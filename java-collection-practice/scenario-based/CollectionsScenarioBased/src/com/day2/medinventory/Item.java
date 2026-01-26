package com.day2.medinventory;

import java.util.Objects;

public class Item<T> {
	private String itemId;
	private T itemName;
	private int quantity;
	private String expiryDate;

	public Item(String itemId, T itemName, int quantity, String expiryDate) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.expiryDate = expiryDate;
	}

	public String getItemId() {
		return itemId;
	}

	public T getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Item)) {
			return false;
		}
		Item<?> other = (Item<?>) obj;
		return Objects.equals(itemId, other.itemId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemId);
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", expiryDate="
				+ expiryDate + "]";
	}

}