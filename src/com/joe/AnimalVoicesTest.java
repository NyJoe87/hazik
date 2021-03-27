package com.joe;

public class AnimalVoicesTest {
    public static void main(String[] args) {
        printAnimalVoices(new Dog());
        printAnimalVoices(new Cat());
        printAnimalVoices(new Cow());

    }
    public static void printAnimalVoices(Animals animals){
        System.out.println(animals.voice());
    }
}
