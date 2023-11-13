package quanpnph29471.example.quanpnph29471_quanlydonhang.Model;

import java.io.Serializable;

public class VoidProduct implements Serializable {
    int id_void,id_customer,id_staff;
    String date_buy,status;

    public VoidProduct(int id_customer, int id_staff, String date_buy, String status) {
        this.id_customer = id_customer;
        this.id_staff = id_staff;
        this.date_buy = date_buy;
        this.status = status;
    }

    public VoidProduct() {
    }

    public int getId_void() {
        return id_void;
    }

    public void setId_void(int id_void) {
        this.id_void = id_void;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_staff() {
        return id_staff;
    }

    public void setId_staff(int id_staff) {
        this.id_staff = id_staff;
    }

    public String getDate_buy() {
        return date_buy;
    }

    public void setDate_buy(String date_buy) {
        this.date_buy = date_buy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VoidProduct(int id_void, int id_customer, int id_staff, String date_buy, String status) {
        this.id_void = id_void;
        this.id_customer = id_customer;
        this.id_staff = id_staff;
        this.date_buy = date_buy;
        this.status = status;
    }
}
