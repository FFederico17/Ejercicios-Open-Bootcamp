package com.OpenBootcamp;

public class concatStrings {

    public static void main(String[] args) {

        String[] progLang = {"Java", "Python", "C++", "Kotlin", "Javascript", "PHP", "Ruby", "Swift"};
        String concatText = "";

        for (String prog : progLang) {
            concatText += prog + " ";
            if (prog == progLang[progLang.length - 1])
                System.out.println(concatText);
        }

    }
}