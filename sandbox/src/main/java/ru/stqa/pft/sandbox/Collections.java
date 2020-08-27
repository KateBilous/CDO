package ru.stqa.pft.sandbox;

import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        String[] langs = {"Java", "C#", "Python", "PHP"};
        for (String l : langs) {
            System.out.println("I want learn" + " " + l);
        }
        List<String> languages = Arrays.asList("Java", "Python");

        for (String l : languages) {
            System.out.println("Collection +"
                    + l);
        }

    }


}


