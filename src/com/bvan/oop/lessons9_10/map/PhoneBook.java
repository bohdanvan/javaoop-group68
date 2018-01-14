package com.bvan.oop.lessons9_10.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class PhoneBook {

    public static void main(String[] args) {
        Map<String, Phone> phoneBook = new HashMap<>();
        // TreeMap -> sorted order [O(log N)]
        // LinkedHashMap -> original order [O(1) + memory]
        // HashMap -> random order [O(1)]

        phoneBook.put("Boris", new Phone("+380951111111"));
        phoneBook.put("Anna", new Phone("+380952222222"));
        phoneBook.put("Vlad", new Phone("+380953333333"));

        phoneBook.put("Vlad", new Phone("+3809544444444"));

        Phone vladPhone = phoneBook.get("Vlad");
        System.out.println(vladPhone);
        System.out.println();

        Set<String> names = phoneBook.keySet();
        Collection<Phone> phones = phoneBook.values();

        Set<Map.Entry<String, Phone>> nameToPhoneSet =
                phoneBook.entrySet();
        for (Map.Entry<String, Phone> nameToPhone : nameToPhoneSet) {
            String name = nameToPhone.getKey();
            Phone phone = nameToPhone.getValue();
            System.out.println(name + " -> " + phone);
        }
    }
}
