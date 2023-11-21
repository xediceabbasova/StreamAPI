package com.javastream.optional;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class PhoneBookCrawler {
    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name) {
        return phoneBook.findPhoneNumberByName(name)
                .orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name) {
        StringBuilder result = new StringBuilder();
        phoneBook.findPhoneNumberByName(name)
                .ifPresentOrElse(result::append,
                        () -> System.out.println(phoneBook.getPhoneBookEntries()));
        return result.toString();
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber) {
        return phoneBook.findPhoneNumberByName(name)
                .or(() -> phoneBook.findNameByPhoneNumber(phoneNumber))
                .orElse(phoneBook.findPhoneNumberByName("Jos de Vos")
                        .orElse(null));

    }

    public PhoneBook getPhoneBook() {
        return phoneBook;
    }
}
