//this is something that we get when 
//purchase cards from a shop

public Deck< T extends Card>{
    private final List<T> listOfCards;

    public Deck(final int sizeOfDecsk){
        this.listOfCards = new ArrayList<>(sizeOfDeck);
    }

    public T add(final T card){
        listOfCards.add(card);
        return card;
    }
    //we can add other stuff
}
