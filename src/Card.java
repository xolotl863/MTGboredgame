import java.lang.reflect.Array;
import java.util.ArrayList;

public class Card {
    // array of data
    private int strength, defense;
    private String name;
    private final int MULTIPLE = 2;
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    private int count = 0;

    /**
     * Constructor for objects of class NumberData
     */
    public Card(String title, int power, int toughness)
    {
    name = title;
    strength = power;
    defense = toughness;

    }

    public int getStrength(){
        return strength;
    }
    public int getToughness(){
        return defense;
    }
    public String getName(){
        return name;
    }



    //public int[] getMana(int num){
    //    return manaCost;
    //}

    //public boolean isEnoughMana{
    //    for(int t = 0; t manaCost.length; )
    //}

    public String toString(){
        String report = new String("");
        report.concat("\t" + name + "[" + strength + "/" + defense + "]");
        return report;
    }



}