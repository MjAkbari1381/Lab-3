import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    boolean addContact(Contact contact) {
        if (contacts.contains(contact)) {
            return false;
        } else {
            contacts.add(contact);
            return true;
        }
    }

    boolean deleteContact(String firstName, String lastName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }

    Contact findContact(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }

    Contact findContact(String group) {
        for (Contact contact : contacts) {
            if (contact.getGroup().equals(group)) {
                return contact;
            }
        }
        return null;
    }

    void printContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }
}