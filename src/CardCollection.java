import java.util.ArrayList;

public class CardCollection  {
    ArrayList<Card> hand = new ArrayList<>();
    ArrayList<Card> PlayerBF = new ArrayList<>();
    ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> graveyard = new ArrayList<>();
    ArrayList<Card> AIhand = new ArrayList<>();
    ArrayList<Card> AIBF = new ArrayList<>();
    ArrayList<Card> AIdeck = new ArrayList<>();
    ArrayList<Card> AIgraveyard = new ArrayList<>();
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




    public void addCreature(String name, int power, int toughness) {
        Card newCard = new Card (name, power, toughness);
        deck.add(newCard);
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
        Card thundermawhellkite = new Card("Thundermaw Hellkite", 5, 5);

        for(int i = 0; i < 6; i++) {
            hand.add(thundermawhellkite);
        }
    }

    public int getLimit()
    {
        return limit;
    }
    public Card getThisCard(int index)
    {
        return deck.get(index);
    }

    public void setThisCard(int index, Card newCard)
    {
        deck.set(index, newCard);
    }

    public String toString()
    {
        String nums = "";
        for (int index = 0; index < deck.size(); index++)
            nums += (deck.get(index) + "  ");
        return nums;
    }
}
