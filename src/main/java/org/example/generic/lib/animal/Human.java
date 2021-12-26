package org.example.generic.lib.animal;

public class Human extends MovingCreature implements Animal {

    @Override
    public String move() {
        return "I'm walking";
    }
}
