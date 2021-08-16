//we need to provie some value, so, that 
//these suits can be ranked among themselves
public enum Suit{
    Clubs(0), Spades(1), Diamonds(2), Hearts(3);

    private Suit(final int rankValue){
        this.rankValue = rankValue;
    }

    final int rankValue;

    public Suit getSuitOfRank(final int rankValue){
        final Suit[] suits = Suit.values();
        for(final Suit suit : suits){
            if(suit.rankValue == rankValue){
                return suit;
            }
        }

        return null;
    }
}


