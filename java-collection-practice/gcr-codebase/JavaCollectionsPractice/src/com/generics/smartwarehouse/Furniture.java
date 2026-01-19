package com.generics.smartwarehouse;
class Furniture extends WarehouseItem {

    public Furniture(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}
