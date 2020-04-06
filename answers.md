1. All of them have a deck of cards and a board. deckSize, isEmpty, etc. are functions that these will have in common. isLegal and anotherPlayIsPossible will be different for each of these games, while a function such as containsJQK will be completely different for each type of game.

2. Variables are given to the board class when it is initialized. When this happens, each game sends variables back to the Board class which creates a customized board for each game. 

3. All the differences have to be covered because they are not defined in the board class. Functions that do the same exact thing that require different implementations also have to be defined because they're not identical for each game. 