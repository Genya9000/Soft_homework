package conditions.homework.task_2;

public class Dog {
    private String name;
     private Brid brid;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, Brid brid, int age) {
        this.name = name;
        this.brid = brid;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Brid getBrid() {
        return brid;
    }

    public static boolean checkName(String name1, String name2, String name3){
        boolean result;
        if(name1.equals(name2) || name1.equals(name3) || name2.equals(name3)){
            result = false;
        }
        else result = true;
        return result;
    }

}
