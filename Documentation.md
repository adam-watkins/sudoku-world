#Documentation#

- User Story: As a player i would like to be able to play a variety of modes in order to first learn how to play and then progressively challenge myself more and more.
- Example: Upon clicking start game the a random board will be generated using backtracking search so that the user is not greeted with the same board every time
- Example: Through the new game menu, the player will have the option of either playing Numbers mode, Native mode, or Foreign mode. These modes will be explained briefly in the settings menu.
- Example: The user will be able to select the desired difficulty within the menu system. The three modes are Easy, Medium, and Hard:
Easy : 50-60 pre-placed Sudoku tiles
Medium : 35 - 40 pre-placed Sudoku tiles
Hard: Less than 35 pre-placed Sudoku tiles
These numbers are approximations of the actual game<br/><br/>


- User Story: As a user I would like an interface in which i can navigate and utilize in order to start games with various options.
- Example: Clicking the new game button on the main menu will lead the user to a fragment that can control how the game is played. (Difficulty, language, etc)<br/><br/>


- User Story: As a player, I would like to be able integrate studying a new language and playing.
- Example (UNDER CONSTRUCTION): In the new game menu, the player will be able to choose which foreign language he is trying to learn and the game will adjust the text in cells and buttons accordingly.
- Example: In the new game menu, a user can elect to display native words in inital cells and place foreign words, or do the opposite.
- Example: When the player selects the a preplaced cell in the board, the player is able to see the translated version of that word while playing.<br/><br/>


- User Story: As a user, i would like to be able to zoom into the screen to better see the words on the grid
- Example (UNDER CONSTRUCTION) : A User will be able to zoom in and out of the screen with pinch gestures
- Example (WIP) : Within the settings menu the user can select rectangle mode which displays the cell in larger rectangles to better see the words. This mode is designed for tablets.<br/><br/>


- User Story: As a player, I would like to be able to continue where I left off if I decide to stop playing midway through a game.
- Example: When a user freshly opens up the app or when the user presses back to go to the menu screen, the user is able to press the continue button in the title screen in order to continue where the user left off.<br/><br/>


- User Story: As a sudoku player, i would like to be able to play multiple concurrent games so that when i get stuck on one hard puzzle, i can reset myself with a different puzzle and come back to the original puzzle with a clear head.
- Example: Within the continue game menu, the user can swipe the display and pick whichever one of her save files he/she wishes to play.
- Example: (WILL BE CHANGED) If you have no save files you will be greeted with a blank fragment when you click continue<br/><br/> 


- User Story: As a player, I would like to be able to check if I solved the sudoku puzzle correctly.
- Example: Once the player has completed the puzzle, the player is able to press check the answer to see if the player correctly solved it. If so, a toast will pop up and congratulate them for solving the puzzle.
- Example: If a user places an incorrect value into a cell, the cell will be highlighted in red and a sound will play indiciating that the user is wrong<br/><br/>


- User Story: As a sudoku player, I would like to have incorrectly placed cells display so that i don't waste my time playing with incorrect cells
- Example: Within the settings menu the user can select "Hints" and when he places incorrect cells in game, they will be highlighted and an appropriate sound will play.<br/><br/>


- User Story: As a player, I would like to be able to edit my grid in case I input an incorrect value in the grid cell.
- Example: The player is able to clear cells by selecting which cell he wants to clear and using the "clear cell" button.<br/><br/>


- User Story: As a transiter, i would like to be able to play the game in landscape mode for when i ride the bus.
- Example: Rotating the screen will turn the game into landscape mode and will retain prior functionality.<br/><br/>


- User Story: As a language learner, i would like to know the translation of some words incase i forget while playing.
- Example: Through a long press of a locked cell, a toast displaying that cells translation will appear.<br/><br/>


- User Story: As a player, I would like to improve my comprehension of native and foreign words.
- Example: In the settings menu, the user will have the option of turning listening comprehension mode on. In doing so, the word contained inside a locked sudoku cell or sudoku button will be read to the user upon a long click.<br/><br/> 


- User Story: As a user, I would like to use this app in various devices.
- Example: Because the grid UI is designed to use as much space as possible, it will be drawn bigger on bigger screened devices.<br/><br/>


- User Story: As a music listener, i would like to be able to turn off the the in game sounds so that i may listen to my music in the background of my phone
- Example: Within the settings menu the user can turn on/off sounds.<br/><br/>


- User story: As a language learner, I would like to be able to pick the words I use in game so that i can decide which words I want to learn in a non-native language.
- Example (WIP): Within the play game fragment, the player is able to freely choose their 9 desired word pairs that they wish to practice with.
- Example: The res/raw folder of the app contains a CSV that has word pairs read from and put into the game.
- Example: (UNDER CONSTRUCTION) Within the new game menu, the user will be able to create word pairs IN GAME which is saved in our database.<br/><br/>


- User story: As a traveller, i would like to preload large sets of words before a trip so that i will have a constant stream of new words to practice
- Example: (UNDER CONSTRUCTION) Because of our database, a user is able to load a huge number of word pairs either by file or by hand through the new game option.<br/><br/>


- User story: As a user, i would like to know which words i struggle with the most so that i may practice them more.
- Example: (UNDER CONSTRUCTION) The database will keep a count of all used word pairs and how many times they were misplaced. The user will be able to select these words to play a game with and will be able to see statistics in the statistics menu.<br/><br/>



- User Story: As a language learner, I would like to work with custon wordlists that i may import myself.
- Example:(WIP) Users are able to load wordlists from a csv file. This option will be avaliable through clicking new game, and then clicking change set.<br/><br/>
