//hand of cards is something that 
// a player has in a game.

//similar to Deck of cards

public class Hand<T extends Card>{
    private final List<T> listOfCards = new ArrayList<>();

    
    public int totalScore(){
        return listOfCards.stream().mapToInt(Card::getScore).sum();
    }

    public T add(final T card){
        listOfCards.add(card);
    }
}
