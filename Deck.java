import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    
    private LinkedList<Card> cards;

    public Deck(boolean isEmpty){
           
        cards = new LinkedList<Card>();
        if(!isEmpty){    
            String numbers = "123456789trsf";
            String colors = "rgbyx";
       
            for(char color: colors.toCharArray() ){
                for( char number: numbers.toCharArray()){
                    cards.add(new Card(number, color));
                }
            }
            for (int i = 0; i < 4; i++)
            {
                cards.add(new Card('C', 'X'));
                cards.add(new Card('F', 'X'));
            }
        }
    }


    public String toString()
    {
        String output = "(";

        for (Card c : cards)
        {
            output += c + "),(";
        }
        return output.substring(0, output.length() - 2);
    }
    


    public void shuffle(){
        Collections.shuffle(cards);

    }

    public void addCard(Card a){
        cards.add(0,a);
    }
    public Card getTop(){
        return cards.remove(0);
    }
    public Card seeTop(){
        return cards.getFirst();
    }


}
