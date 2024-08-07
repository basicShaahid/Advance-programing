import java.util.Scanner;

public class Program {

    // Method to print the array of Plant objects
    public static void printArray(Plant[] myGarden, int count) {
        for (int i = 0; i < count; i++) {
            myGarden[i].printInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;

        // Declare an array of size 100 called myGarden that can hold objects of type Plant
        Plant[] myGarden = new Plant[100];

        // Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
        String plantName, plantCost, colorOfFlowers;
        boolean isAnnual;
        int count = 0;

        // Loop to read plant information
        while (true) {
            input = scnr.nextLine();
            if (input.equals("-1")) {
                break;
            }
            String[] tokens = input.split(" ");
            if (tokens[0].equals("plant")) {
                Plant plant = new Plant();
                plant.setPlantName(tokens[1]);
                plant.setPlantCost(tokens[2]);
                myGarden[count] = plant;
            } else if (tokens[0].equals("flower")) {
                Flower flower = new Flower();
                flower.setPlantName(tokens[1]);
                flower.setPlantCost(tokens[2]);
                flower.setColorOfFlowers(tokens[3]);
                flower.setPlantType(Boolean.parseBoolean(tokens[4]));
                myGarden[count] = flower;
            }
            count++;
        }

        // Call the method printArray to print myGarden
        printArray(myGarden, count);
    }
}
