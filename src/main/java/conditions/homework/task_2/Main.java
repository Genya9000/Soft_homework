package conditions.homework.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Torpeda", Brid.BOXER, 4);
        Dog dog2 = new Dog("Philip", Brid.PITBUL, 5);
        Dog dog3 = new Dog("Toreodor", Brid.SPANIEL, 6);
        Dog oldest = Arrays.asList(dog1, dog2, dog3).stream()
                .max((ex1, ex2)-> Integer.compare(ex1.getAge(), ex2.getAge())).get();
        if(Dog.checkName(dog1.getName(), dog2.getName(), dog3.getName())){
            System.out.println("Name and the kind of the oldest dog are: "
            + oldest.getName() + " - " + oldest.getBrid());
        }
    }
}
