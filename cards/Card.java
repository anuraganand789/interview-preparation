public class Card{

    private int value;
    private Suit suit;

    public Card(final int value, final Suit suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue(){
        return this.value;
    }

    public Suit getSuit(){
        return this.suit;
    }

}
