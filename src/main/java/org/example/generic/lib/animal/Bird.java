package org.example.generic.lib.animal;

public class Bird extends MovingCreature implements Animal {

    @Override
    public String move() {
        return "I'm flying";
    }
}
