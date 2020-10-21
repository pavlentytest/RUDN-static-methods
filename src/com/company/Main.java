package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        int l = animal.legs;

        Animal.legs++;
        System.out.println(Animal.legs);  // 5

        Animal cat = new Animal();
        System.out.println(Animal.legs); // 5
        System.out.println(cat.makeSound());

        Animal.makeSound();

        Math.sqrt(5.6);

        String str1 = "hello!";
        str1 = "abc" + "a";

        // StringBuilder - для однопоточных приложений
        // StringBuffer - в многопоточных приложениях

        StringBuilder builder = new StringBuilder("abc");
        //builder.
        builder.append("123");
        String str = builder.toString(); // abc123

        String a1 = "school";
        String a2 = "school";
        System.out.println(a1==a2); // true
        System.out.println(a1.equals(a2)); // true

        String b1 = new String("Moscow");
        String b2 = new String("Moscow");
        System.out.println(b1==b2); // false
        System.out.println(b1.equals(b2)); //true

        // String - immutable - неизменяемая
        // StringBuilder, StringBuffer - mutable - изменяемые

        String c1 = "Testing";
        char[] ch = new char[c1.length()];
        for(int i=0; i<c1.length();i++) {
            ch[i] = c1.charAt(i);
        }

        String d1 = "123";
        // простой тип int - класс Integer
        int d2 = Integer.parseInt(d1); // 123

        String d3 = Integer.toString(d2);

        Speakable speakable = new Speakable() {
            @Override
            public String doSpeak(String str, int a) {
                return null;
            }
        };

        speakable.doSpeak("ppp",1);



    }
}
