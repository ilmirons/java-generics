package org.example.generic.lib.animal;

import lombok.Data;

@Data
public abstract class MovingCreature implements Animal {

    private int height;
    private int weight;
    private int age;

    String move() {
        return "I'm moving";
    }
}
