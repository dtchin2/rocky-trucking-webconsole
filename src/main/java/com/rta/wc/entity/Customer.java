package com.rta.wc.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "cust_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long custId;

    @Column(name = "cust_fname")
    private String custFirstName;

    @Column(name = "cust_lname")
    private String custLastName;

    @Column(name = "cust_email")
    private String customerEmail;

    @Column(name = "cust_phonenum")
    private String customerPhoneNum;

    @ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "cust_locationid")
    private Location location;

    @OneToMany(fetch = FetchType.EAGER ,mappedBy="customer", cascade= CascadeType.ALL)
    private List<Invoice> invoices;

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
