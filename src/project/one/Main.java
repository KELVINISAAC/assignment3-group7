package project.one;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Main {

    public static void main(String[] args) {

        String csvFile = "C:\\Users\\KELVIN ISAAC\\IdeaProjects\\kaz\\FILE.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("FULL_NAME " + country[1] + " , REGISTRATION_NUMBER " + country[2] + " , CA " + country[3] + " , UE " + country[3] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
