class Address {
    private String zipCode;
    private String country;
    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "    Address: " + zipCode + "-" + country + "-" + city;
    }
}