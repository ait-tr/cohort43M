package code;

import java.util.*;

public class ContactManager {
    private Set<Contact> contacts;

    public ContactManager() {
        this.contacts = new HashSet<>();
    }

    public boolean addContact(Contact contact){
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public void getAllContacts(){
        TreeSet<Contact> contactsSorted = new TreeSet<>(new ContactComparator());
        contactsSorted.addAll(contacts);
        System.out.println(contactsSorted);
    }

    public List<Contact> getContactByName(String name){
        List<Contact> foundedContactsByName = new ArrayList<>();
        for (Contact contact : contacts){
            if (contact.getName().equals(name)){
                foundedContactsByName.add(contact);
            }
        }

        return foundedContactsByName;
    }

    public List<Contact> getContactByPhoneNumber(String phoneNumber){
        List<Contact> foundedContactsByPhoneNumber = new ArrayList<>();
        for (Contact contact : contacts){
            if (contact.getPhoneNumber().equals(phoneNumber)){
                foundedContactsByPhoneNumber.add(contact);
            }
        }

        return foundedContactsByPhoneNumber;
    }
}
