import javax.swing.*;
import java.util.ArrayList;

public class CardCollection  {
    ArrayList<Card> hand = new ArrayList<>();
    ArrayList<Card> PlayerBF = new ArrayList<>();
    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> AIhand = new ArrayList<>();
    ArrayList<Card> AIBF = new ArrayList<>();
    ArrayList<Card> AIdeck = new ArrayList<>();
    private int count = 0;
    private int limit;
    Card thundermawhellkite = new Card("Thundermaw Hellkite", 5, 5);
    private int greenCounter = 0, whiteCounter = 0, blackCounter = 0, redCounter = 0, blueCounter = 0;
    Card forestPlaceholder = new Card("Forest", 0, 0);





    public CardCollection () {
        for(int i = 0; i < 7; i++) {
            hand.add(thundermawhellkite);
        }

    }



    //public boolean handFull(){
    //    return hand.size() >= 6;
    //}
    public void cast(int castNum){
        if(hand.get(castNum).getName() == "Forest") addForest(castNum);
        PlayerBF.add(hand.get(castNum));
        hand.remove(castNum);
        System.out.println("you casted " + PlayerBF.get(PlayerBF.size()-1).getName());
    }

    public String AIcast(int castNum){
        AIBF.add(thundermawhellkite);
        AIhand.remove(castNum);
        return "opponent casted " + thundermawhellkite.getName();
    }


    public void addForest(int castNum){
        greenCounter++;
        hand.remove(castNum);
    }
    public void draw(){
        //int handSize = hand.size();
        //for(int i = handSize; i==6; i++){
        //    hand.set(i, deck.get(0));
        //    deck.remove(0);
    }

    public void attack(int atkIndx, int defIndx){
        if(PlayerBF.get(atkIndx).getStrength() > AIBF.get(defIndx).getToughness()) {
            AIBF.remove(defIndx);
        }
    }


    public int attackNoDef(int atkIndx){
        return PlayerBF.get(atkIndx).getStrength();
    }



    public int getLimit()
    {
        return limit;
    }

    public String toString()
    {
        String nums = "";
        for (int index = 0; index < deck.size(); index++)
            nums += (deck.get(index) + "  ");
        return nums;
    }
}
