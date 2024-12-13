package model;

public class Address {
    private String streetName;
    private String completeAddress;
    private String pincode;

    public Address(String streetName, String completeAddress, String pincode) {
        this.streetName = streetName;
        this.completeAddress = completeAddress;
        this.pincode = pincode;
    }

    public Address() {

    }

    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }
    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public String getPincode()
    {
        return pincode;
    }
    public void setPincode(String pincode) {

        this.pincode = pincode;
    }

    @Override
    public String toString() {

        return "Address [streetName=" + streetName + ", completeAddress=" + completeAddress + ", pincode=" + pincode + "]";
    }
}

