import javafx.scene.Group;

import java.util.ArrayList;
import java.util.Scanner;

public class textBoard {


    public static void main(String[] args) {
        ArrayList<Card> filler;
        CardCollection cards = new CardCollection();
        int playerLife = 20, AIlife = 20;
        int greenCounter = 0, whiteCounter = 0, blackCounter = 0, redCounter = 0, blueCounter = 0;
        Scanner scan = new Scanner(System.in);
        boolean game = true;

        while (game) {
            //if (!cards.handFull()) {
            //    cards.draw();
            //}
            System.out.println("Your HP is " + playerLife);
            System.out.println("Your hand is ");
            for(int i = 0; i < 7; i++){
                System.out.println("" + cards.thundermawhellkite.getName() + " \t [" + cards.thundermawhellkite.getStrength() + "/" + cards.thundermawhellkite.getToughness() + "]");
            }
            System.out.println("AI HP is " + AIlife);
            System.out.println("AI hand is ");
            for(int i = 0; i < 7; i++){
                System.out.println("" + cards.hand.get(i).getName() + " \t [" + cards.hand.get(i).getStrength() + "/" + cards.hand.get(i).getToughness() + "]");
            }
            System.out.println("");
            System.out.println("Swamps:" + blackCounter);
            System.out.println("Plains:" + whiteCounter);
            System.out.println("Mountains:" + redCounter);
            System.out.println("Islands:" + blueCounter);
            System.out.println("Forests::" + greenCounter);
            System.out.println("which card would you like to play");
            String x = scan.nextLine();
            switch (x.toUpperCase()) {
                default:
                    System.out.println("invalid");

                case "0": {
                    //cards.cast(0);
                    System.out.println("You casted ");
                    break;
                }
                case "1": {
                    cards.cast(1);
                    break;
                }
                case "2": {
                    cards.cast(2);
                    break;
                }
                case "3": {
                    cards.cast(3);
                    break;
                }
                case "4": {
                    cards.cast(4);
                    break;
                }
                case "5": {
                    cards.cast(5);
                    break;
                }
                case "6": {
                    cards.cast(6);
                    break;
                }
                case "FOREST": {
                    greenCounter++;
                    System.out.println("you played a forest. current forest number is: " + greenCounter);
                    break;
                }
                case "SWAMP": {
                    blackCounter++;
                    System.out.println("you played a swamp. current swamp number is: " + blackCounter);
                }
                case "MOUNTAIN": {
                    redCounter++;
                    System.out.println("you played a mountain. current mountain number is: " + redCounter);
                }
                case "ISLAND": {
                    blueCounter++;
                    System.out.println("you played an island. current island number is: " + blueCounter);
                }
                case "PLAINS": {
                    whiteCounter++;
                    System.out.println("you played a plains. current plains number is: " + whiteCounter);
                }

            }
        }
    }
}