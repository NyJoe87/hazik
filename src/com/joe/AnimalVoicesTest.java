package com.joe;

import java.util.ArrayList;
import java.util.List;

public class AnimalVoicesTest {
    public static void main(String[] args) {
        // primitive type
        int a = 4;
        // reference type
        //letrejon egy referencia(mutato) ami a jobb oldalban letrehozott obiektum cimere mutat
//        Dog dog = new Dog("nemetjuhasz");
//        changeTipus(dog);
//        System.out.println(dog.tipus);

        printAnimal(new Dog("mops"));
        printAnimal(new Cat());
        printAnimal(new Cow());
        changeValue(a);
        System.out.println(a);

        //Animal referenciaval mutatunk a Dog obiektumra
        Dog dog2 = new Dog("mops");
        //heterogen kollekcio a kozos nevezo az animal interface
        //olyan obiektumokat tudunk belerakni melyek tipusa inmoplementalja az Animal interfacet
        List<Animal> allatok = new ArrayList<>();
        allatok.add(new Dog("mops"));
        allatok.add(new Cat());
        allatok.add(new Cow());

        for (int i = 0; i < allatok.size(); i++) {
            printAnimal(allatok.get(i));
        }

//        int i = 0;
//        while (i < allatok.size()) {
//            printAnimal(allatok.get(i));
//            i++;
//        }

//        for (Animal allat:allatok){
//            printAnimal(allat);
//        }
        Car car = new Car("BMW","Red");
        System.out.println(car.brand);
        System.out.println(car.colour);
        System.out.println(car.hit(dog2));
    }

    //adj mezot a cow es cat classhoz,
    public static void printAnimal(Animal animal) {
        System.out.println(animal.tipus());
        System.out.println(animal.voice());

    }


    public static void changeValue(int n) {
        n = 5;
    }

    /**
     * a referencia fog lemasolodni
     */
    public static void changeTipus(Dog t) {
        t.setTipus("mops");
    }

}
//hozz letre egy car osztalyt, s rakj bele nehany mezot kezzel irj hozza konstruktort, settert
//adj hozza a dog osztalyhoz egy uj mezot es ez legyen az "is alive"
// a car osztalyban legyen egy hit metodusa ami parameterkent egy dog ot kap meg es ennek a dog nak fogja beallitani az is alive mezojet false ra
