package com.keyin;

public class ExampleClassToTest {
    public boolean containsString(String stringToSearch, String stringToFind) {
        if (stringToSearch == null) return false;
        if (stringToFind == null) return false;

        return stringToSearch.toLowerCase().contains(stringToFind.toLowerCase());
    }
}
