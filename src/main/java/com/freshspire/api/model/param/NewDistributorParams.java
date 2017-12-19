package com.freshspire.api.model.param;

/**
 * Parameters for creating a new store.
 */
public class NewDistributorParams {

    private int chainId;

    private String displayName;

    private String street;

    private String city;

    private String state;

    private String zipCode;

    private double latitude;

    private double longitude;
    
    private String POCfirstName;
    
    private String POClastName;
    
    private String phoneNumber;
    
    private String email;
    
    private String[] foodsTheySell;

    public NewDistributorParams() {}

    public NewDistributorParams(int chainId, String displayName, String street, String city, String state, String zipCode, 
    		float latitude, float longitude, String POCfirstName, String POClastName, String phoneNumber, String email,
    		String[] foodsTheySell) {
        this.chainId = chainId;
        this.displayName = displayName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.POCfirstName = POCfirstName;
        this.POClastName = POClastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.foodsTheySell = foodsTheySell;
    }

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public String getPOCfirstName() {
        return POCfirstName;
    }

    public void setPOCfirstName(String POCfirstName) {
        this.POCfirstName = POCfirstName;
    }
    
    public String getPOClastName() {
        return POClastName;
    }

    public void setPOClastName(String POClastName) {
        this.POClastName = POClastName;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String[] getFoodsTheySell() {
        return foodsTheySell;
    }

    public void setFoodsTheySell(String[] foodsTheySell) {
        this.foodsTheySell = foodsTheySell;
    }
}
