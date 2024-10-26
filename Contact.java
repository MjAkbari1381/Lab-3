class Contact {
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    PhoneNumber phoneNumber = new PhoneNumber();
    Address address = new Address();

    public Contact(String firstName, String lastName, String email, String group, String countryCode, String phoneNumber, String zipCode, String country, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.group = group;
        this.phoneNumber.setCountryCode(countryCode);
        this.phoneNumber.setNumber(phoneNumber);
        this.address.setZipCode(zipCode);
        this.address.setCountry(country);
        this.address.setCity(city);
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Contact{" + "\n" +
                "    group: " + group + "\n" +
                "    email: " + email + "\n" +
                "    firstName: " + firstName + "\n" +
                "    lastName: " + lastName + "\n" +
                phoneNumber +
                address + "\n" +
                '}';
    }
}