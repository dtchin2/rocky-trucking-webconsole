package com.rta.wc.entity;

public class Customer {

    private Long custId;
    private String custFirstName;
    private String custLastName;
    private String customerEmail;
    private String customerPhoneNum;
    private Location location;

    public Customer(){}

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custFirstName='" + custFirstName + '\'' +
                ", custLastName='" + custLastName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhoneNum='" + customerPhoneNum + '\'' +
                ", location=" + location +
                '}';
    }
}
