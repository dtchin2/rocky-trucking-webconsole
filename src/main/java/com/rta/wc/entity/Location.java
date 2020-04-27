package com.rta.wc.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cust_loc")
public class Location {

    @Id
    @Column(name = "cust_locationid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long locationId;

    @Column(name = "cust_locationname")
    private String locationName;

    @Column(name = "cust_locationaddress1")
    private String locationAddress1;

    @Column(name = "cust_locationaddress2")
    private String locationAddress2;

    @Column(name = "cust_locationcity")
    private String locationCity;

    @Column(name = "cust_locationstateabbr")
    private String locationStateAbbr;

    @Column(name = "cust_locationzip")
    private String locationZipCode;

    @OneToMany
    @JoinColumn(name = "cust_id")
    private List<Customer> customers;

    public Location(){}

    public Location(String locationName, String locationAddress1, String locationAddress2, String locationCity, String locationStateAbbr, String locationZipCode) {
        this.locationName = locationName;
        this.locationAddress1 = locationAddress1;
        this.locationAddress2 = locationAddress2;
        this.locationCity = locationCity;
        this.locationStateAbbr = locationStateAbbr;
        this.locationZipCode = locationZipCode;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddress1() {
        return locationAddress1;
    }

    public void setLocationAddress1(String locationAddress1) {
        this.locationAddress1 = locationAddress1;
    }

    public String getLocationAddress2() {
        return locationAddress2;
    }

    public void setLocationAddress2(String locationAddress2) {
        this.locationAddress2 = locationAddress2;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationStateAbbr() {
        return locationStateAbbr;
    }

    public void setLocationStateAbbr(String locationStateAbbr) {
        this.locationStateAbbr = locationStateAbbr;
    }

    public String getLocationZipCode() {
        return locationZipCode;
    }

    public void setLocationZipCode(String locationZipCode) {
        this.locationZipCode = locationZipCode;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", locationAddress1='" + locationAddress1 + '\'' +
                ", locationAddress2='" + locationAddress2 + '\'' +
                ", locationCity='" + locationCity + '\'' +
                ", locationStateAbbr='" + locationStateAbbr + '\'' +
                ", locationZipCode='" + locationZipCode + '\'' +
                ", customers=" + customers +
                '}';
    }
}
