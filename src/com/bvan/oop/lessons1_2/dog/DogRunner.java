package com.bvan.oop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog rex = new Dog("Rex");
        rex.bark(3);
        System.out.println();

        Owner jack = new Owner("Jack", rex);
        jack.giveCommand();
    }
}
