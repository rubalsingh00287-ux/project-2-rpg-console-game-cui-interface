# project-2-rpg-console-game-cui-interface
== RPG Character Creator ==
# Project Overview
RPG Character Creator is a simple
# Its an Console-based Java game
Its console based program that demostrates the use of Object-Oriented programming concepts such as clases, objects, methods and encapsulation.
The program allows a user to create a character, train abilities, fight enemies, and manage health and gold.                                    
# Java Programming Fundamentals
Including control structures, user input handling, random number generation and modular program design.                                                
## Features                                                                                   This console based application provides the following features:
 1. Create new RPG character with default attributes.
 2. view the character's current statistics.
 3. Train the character to increase attributes.
 4. Fight a quick battle against an enemy.
 5. Rest to restore health points.
 6. Earn gold and skill points after winning battles.
 ## Character Attribute                                                                       
 Each character has serval attributes that affect gameplay.
 # Attributes & their Description
  1. HP representing -- Health Points representing the character's life
  2. STR -- Strength which increases attack damage
  3. AGI -- Agility which reprseents speed and movement
  4. INT -- intelligence used for future extension
  5. GOLD -- Currency earned from battles
  6. Unspent Points -- Points used for training abilities                                      ## Project Structure
     This Project divided into three JAVA classes
     ### 1. RpgCharacter.java
     This class represents the player character
     Function includes
     Storing Character attributes
     Calculating attack damage
     Receiving damage
     Training abilities
     Displaying character statistics
     -------------------------------------
     ### 2. Enemy.java
     This class represents the Enemy in the battle
     Function include:
     creating an enemy character
     Generating attack damage
     Taking damage
     checking if the enemy is alive
     --------------------------------------
     ### 3. RpgApp.java
     This is the main application class thet runs the program
     Fuction include
     Displaying the game menu
     Handling user input
     Creating characters
     Running battles
     Managing training and rest option
     ------------------------------------------
     ## Game menu
     When the program runs, the user sees the following menu:
     1.  Create Character
     2.  View Stats
     3.  Train (Allocate Points)
     4.  Quick Battle
     5.  Rest ( Heal to Full)
     6.  Exit
     User can choose an option by entering the corresponding number
    -------------------------------------------
     The battle system is a simple turn-based comat system
     The player attack first
     Damage is calculated using the character's strength plus a random value
     The enemy attack if it is still alive
     The battle continues until one side's HP reaches zero
     If the player wins:
     Gold is awarded
     The character gains one unspent training point
     ## Technologies Used
     The Project was implemented using:
     * Java Programming Language
     * Object-Oriented programming
     * Java Random Class
     * Java Scanner Class
     -----------------------------------
     
     
     
     
     
     
     



