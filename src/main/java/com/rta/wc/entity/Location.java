package com.rta.wc.entity;

public class Location {

    private Long locationId;
    private String locationName;
    private String locationAddress1;
    private String locationAddress2;
    private String locationCity;
    private String locationStateAbbr;
    private String locationZipCode;

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

    @Override
    public String toString() {
        return "Location{" +
                "locationName='" + locationName + '\'' +
                ", locationAddress1='" + locationAddress1 + '\'' +
                ", locationAddress2='" + locationAddress2 + '\'' +
                ", locationCity='" + locationCity + '\'' +
                ", locationStateAbbr='" + locationStateAbbr + '\'' +
                ", locationZipCode='" + locationZipCode + '\'' +
                '}';
    }
}
