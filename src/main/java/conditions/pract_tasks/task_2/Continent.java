package conditions.pract_tasks.task_2;

import java.util.EnumSet;

public enum Continent {
    ASIA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA, AFRICA, OCEANIA, EUROPE;
    static String resultContinent;
    public static String getContinent(String continent){
        resultContinent = EnumSet.allOf(Continent.class)
                .stream().filter(cont-> cont.toString().substring(0, 4).equals(continent.toUpperCase()
                .substring(0, 4))).findFirst().get().toString();
        return  resultContinent;
    }
}
