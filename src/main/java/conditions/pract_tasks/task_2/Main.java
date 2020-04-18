package conditions.pract_tasks.task_2;

public class Main {
    public static void main(String[] args) {

        Country countr = new Country();
        countr.enterCountry();
        String country = countr.getNameOfCounry();
        Parser parser = new Parser();
        String continent = parser.getContinent(country);
        System.out.println(Continent.getContinent(continent));



    }
}
