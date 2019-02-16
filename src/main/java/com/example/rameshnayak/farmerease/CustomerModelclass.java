package com.example.rameshnayak.farmerease;

/**
 * Created by Ramesh Nayak on 22-Oct-18.
 */

public class CustomerModelclass {
    String buyerid;
    String name;
    String phone;

    String quantity;

    String vegitem;

    public CustomerModelclass(){


    }


    public CustomerModelclass(String buyerid, String name, String phone, String quantity, String vegitem) {
        this.buyerid = buyerid;
        this.name = name;
        this.phone = phone;
        this.quantity = quantity;
        this.vegitem = vegitem;
    }

    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getVegitem() {
        return vegitem;
    }

    public void setVegitem(String vegitem) {
        this.vegitem = vegitem;
    }
}
