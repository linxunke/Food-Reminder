package com.isc.remind.entity;

public class Food {

    Integer id;

    String icon;

    String name;

    Integer quantity;

    String expiredate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getExpiredatedate() {
        return expiredate;
    }

    public void setExpiredatedate(String date) {
        this.expiredate = date;
    }

    // TODO: Don't know yet
    public boolean isNew() {
        return (this.id == null);
    }

}
