public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        Contact contact1 = new Contact("John", "Doe", "john.doe@example.com", "Friends", "+1", "1234567890", "12345", "USA", "New York");
        Contact contact2 = new Contact("Jane", "Smith", "jane.smith@example.com", "Family", "+44", "9876543210", "67890", "UK", "London");

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);

        System.out.println("All Contacts:");
        phoneBook.printContacts();

        System.out.println("\nFinding Contact by Name:");
        Contact foundContact = phoneBook.findContact("John", "Doe");
        if (foundContact != null) {
            System.out.println(foundContact.toString());
        } else {
            System.out.println("Contact not found.");
        }

        System.out.println("\nFinding Contact by Group:");
        Contact foundGroupContact = phoneBook.findContact("Family");
        if (foundGroupContact != null) {
            System.out.println(foundGroupContact.toString());
        } else {
            System.out.println("Group not found.");
        }

        System.out.println("\nDeleting Contact:");
        phoneBook.deleteContact("Jane", "Smith");
        phoneBook.printContacts();
    }
}