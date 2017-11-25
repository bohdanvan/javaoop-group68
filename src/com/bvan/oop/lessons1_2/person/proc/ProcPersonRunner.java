package com.bvan.oop.lessons1_2.person.proc;

/**
 * @author bvanchuhov
 */
public class ProcPersonRunner {

    public static void main(String[] args) {
        ProcPerson p1 = new ProcPerson();
        p1.name = "Ivan";
        p1.age = 30;

        ProcPerson p2 = new ProcPerson();
        p2.name = "Vlad";
        p2.age = 45;

        String info1 = getPersonInfo(p1);
        String info2 = getPersonInfo(p2);

        System.out.println(info1);
        System.out.println(info2);
    }

    private static String getPersonInfo(ProcPerson p) {
        return "Hello, I'm " + p.name + ", "
                + p.age + " years old";
    }
}
