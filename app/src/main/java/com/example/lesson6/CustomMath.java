package com.example.lesson6;


import java.util.ArrayList;
import java.util.Comparator;

public class CustomMath {
    private final String WRONG_FORMAT = "Wrong format";


    public String add(String a, String b) {
        String string1 = a.trim();
        String string2 = b.trim();
        if (string1.isEmpty() && string2.isEmpty())
            return "Empty Fields";
        if (string1.isEmpty() && !string2.isEmpty())
            return b;

        if (!string1.isEmpty() && string2.isEmpty())
            return a;

        try {
            Integer num1 = Integer.parseInt(string1);
            Integer num2 = Integer.parseInt(string2);
            return String.valueOf(num1 + num2);
        } catch (NumberFormatException e) {
            return WRONG_FORMAT;
        }

    }

    public String sub(String a, String b) {
        String string1 = a.trim();
        String string2 = b.trim();
        if (string1.isEmpty() && !string2.isEmpty())
            return "-" + string2;

        if (!string1.isEmpty() && string2.isEmpty())
            return "-" + string1;

        if (string1.isEmpty() && string2.isEmpty()) {
            return "Empty Fields";

        } else {
            try {
                Integer num1 = Integer.parseInt(string1);
                Integer num2 = Integer.parseInt(string2);
                return String.valueOf(num1 - num2);
            } catch (NumberFormatException e) {
                return WRONG_FORMAT;
            }
        }

    }

    public String mult(String a, String b) {
        String string1 = a.trim();
        String string2 = b.trim();
        if (string1.isEmpty() && !string2.isEmpty() || !string1.isEmpty() && string2.isEmpty())
            return "0";

        if (string1.isEmpty() && string2.isEmpty()) {
            return "Empty Fields";

        } else {
            try {
                Integer num1 = Integer.parseInt(string1);
                Integer num2 = Integer.parseInt(string2);
                return String.valueOf(num1 * num2);
            } catch (NumberFormatException e) {
                return WRONG_FORMAT;
            }
        }

    }

    public String div(String a, String b) {
        String string1 = a.trim();
        String string2 = b.trim();
        if (string1.isEmpty() && !string2.isEmpty() || !string1.isEmpty() && string2.isEmpty())
            return "0";

        if (string1.isEmpty() && string2.isEmpty()) {
            return "Empty Fields";

        } else {
            try {
                Integer num1 = Integer.parseInt(string1);
                Integer num2 = Integer.parseInt(string2);
                if (num2.equals(0))
                    return "by zero";

                return String.valueOf(num1 / num2);
            } catch (NumberFormatException e) {
                return WRONG_FORMAT;
            }
        }

    }


    public String reverseString(String words) {


        if (words.equals("")) {
            return "";
        }

       /* StringBuilder builder = new StringBuilder(words);
        return builder.reverse().toString();*/

            if (words.trim().isEmpty()) {
                String[] reversedWords = words.split(",");
                if (reversedWords.length > 1) {


           }
            if (reversedWords.length == 1)
                return words;


            return reversedWords[1] + " " + reversedWords[0];
        }
        String[] reversedWords = words.split(" ");
        for (int i = 0; i < reversedWords.length; i++) {
            reversedWords[i].trim();
        }


        if (reversedWords.length == 1)
            return words;

        return reversedWords[1] + " " + reversedWords[0];
    }
}

