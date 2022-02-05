package org.example.generic.lib.animal;

public class Main {

    public static void main(String[] args) {
        Human h = new Human();
        MovingCreature mc = h;
        Bird b = new Bird();
        final var h2 = mc;

        makeCreatureMove(h);
        makeCreatureMove(b);
        makeCreatureMove(mc);
        makeCreatureMove(h2);
        makeCreatureMove((Human)mc);
    }

    static void makeCreatureMove(Human h) {
        System.out.println("Here is a human");
        System.out.println(h.move());
    }

    static void makeCreatureMove(MovingCreature mc) {
        System.out.println("Here is a moving creature");
        System.out.println(mc.move());
    }
}
