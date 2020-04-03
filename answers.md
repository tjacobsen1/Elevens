1. Deck of cards, a list of cards (a card array), and instance variables. Those would be HasLost, IsEmpty, Deal, Shuffle, etc. 

2. A method to deal cards, shuffle cards, compare cards (to see if they are compatible, aka they add up to 11, or a K, J and Q), a method to clear the deck, and a method to determine if someone has won (when no cards remain) or a method to determine whether someone has lost (if there are no compatible cards in the dealt cards).

3. Yes it does, although some are not written yet. 

4. A.) dealMyCards is in the newGame() method as well as when the board is created in ElevensBoard(). 
   B.) In isLegal() and anotherPlayIsPossible().
   C.) What is returned is 0, 1, 3, 6, and 7
   D.) 
    for(Integer i : cIndexes) {
       System.out.println(boards.cards[i].toString());
    }
    E.) anotherPlayIsPossible().