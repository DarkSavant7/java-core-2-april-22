package ru.gb.java_core_2.l3_collections.hw;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {

    private final Map<String, Set<String>> entries = new TreeMap<>();

    public void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
//
//        Set<String> phones = entries.get(surname) == null ? new HashSet<>() : entries.get(surname);
//        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String surname) {
        return entries.computeIfAbsent(surname, key -> new HashSet<>());
//        return entries.computeIfAbsent(surname, new Function<String, Set<String>>() {
//            @Override
//            public Set<String> apply(String s) {
//                return new HashSet<>();
//            }
//        });
    }

    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    public Set<String> getAllSurnames() {
        return entries.keySet();
    }

}
