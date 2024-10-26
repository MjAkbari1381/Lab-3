class PhoneNumber {
    private String countryCode;
    private String number;

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "    PhoneNumber: " + countryCode + "-" + number + "\n";
    }
}
