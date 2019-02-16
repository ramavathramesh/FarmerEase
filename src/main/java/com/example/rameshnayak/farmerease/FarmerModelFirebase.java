package com.example.rameshnayak.farmerease;

/**
 * Created by Ramesh Nayak on 21-Oct-18.
 */

public class FarmerModelFirebase {
    String farmerid;
    String name;
    String phone;

    String quantity;

    String vegitem;

    public FarmerModelFirebase(){

    }

    public FarmerModelFirebase(String farmerid, String name, String phone, String quantity,String vegitem) {
        this.farmerid = farmerid;
        this.name = name;
        this.phone = phone;
        this.quantity = quantity;
        this.vegitem=vegitem;
    }



    public String getFarmerid() {
        return farmerid;
    }

    public void setFarmerid(String farmerid) {
        this.farmerid = farmerid;
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
