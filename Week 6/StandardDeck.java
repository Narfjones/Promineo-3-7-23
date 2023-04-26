import java.util.ArrayList;
import java.util.Random;

public class StandardDeck extends DeckOfCards {
    
    public StandardDeck(){
    super();

    int lowestCard = 2;
    int highestCard = 10;
    String jackCard = "Jack";
    String queenCard = "Queen";
    String kingCard = "King";
    String aceCard = "Ace";

    for(Integer i = lowestCard; i <= highestCard; i++ ){
        deck.add(i.toString());
    }

    deck.add(jackCard);
    deck.add(queenCard);
    deck.add(kingCard);
    deck.add(aceCard);

    System.out.println(deck);

    System.out.println("------------------------------------------------------------");

    System.out.println(shuffleDeck(deck));

    }


public ArrayList shuffleDeck(ArrayList arr){

    Random rand = new Random();
    ArrayList newArr = new ArrayList();

    for(int i = 0; i < arr.size(); i++){
        int rand_int1 = rand.nextInt(arr.size());
        newArr.add(arr.get(rand_int1));
    }

 return newArr;
}

}
