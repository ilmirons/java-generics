package org.example.generic.lib.inheritance;

import org.example.generic.lib.animal.Human;
import org.example.generic.lib.animal.MovingCreature;
import org.example.generic.lib.animal.Animal;
import org.example.generic.lib.server.GenericResponse;

import java.util.ArrayList;
import java.util.List;

public class VlistTool implements ListTool<MovingCreature> {

    @SuppressWarnings("unused")
    public static void main(String... args) {
        List<Animal> animals = new ArrayList<>();
        List<Human> humans = new ArrayList<>();
        VlistTool me = new VlistTool();
        me.cpyList(animals, humans);
        animals.add(new Human());
        // animals = humans; this is wrong: List<Human> is not a subclass of List<Animal>
        // List<Human> is a subtype of List<? extends Animal> and List<? extends MovingCreature>
        // but not List<MovingCreature>
        List<? extends MovingCreature> covariantMovingCreatures = humans;
        List<? super MovingCreature> contravariantMovingCreatures = animals;
        GenericResponse<Animal>[] animalsArray = (GenericResponse<Animal>[]) new Object[10];
    }

    public void cpyList(List<? super MovingCreature> out, List<? extends MovingCreature> in) {
        out.addAll(in);
    }

    public <T> void cpyList2(List<T> out, List<? extends T> in) {
        out.addAll(in);
    }

    public <T> void cpyList3(List<? super T> out, List<T> in) {
        out.addAll(in);
    }

}
