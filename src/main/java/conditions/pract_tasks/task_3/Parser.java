package conditions.pract_tasks.task_3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

public class Parser {
    Document doc;
    List<String> counries;
    List<String> continents;
    String resultContinent;

   public String getContinent( String userInput)
    {
        try {
            doc = Jsoup.connect("http://statisticstimes.com/geography/countries-by-continents.php").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        counries = doc.select("#table_id > tbody > tr > td:nth-child(2)").eachText();
        continents = doc.select("#table_id > tbody > tr > td:nth-child(7)").eachText();
//        System.out.println(counries.get(1));
        for (String var: counries
             ) {
            if(var.equals(userInput)){
                resultContinent = continents.get(counries.indexOf(var));
            }
        }
        return resultContinent;
    }

   /* public static void main(String[] args) {
        Parser parser = new Parser();
        parser.getContinent("kl");
    }*/
}
