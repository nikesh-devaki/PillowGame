# CoffeeMachine

 
Problem Statement:

In a family party, people are playing the musical pillow game in which people sit in a circle. Starting from the first person, they transfer the pillow to the person to their left. For simplicity, we'll assume that people are assigned an integer tag from 1 to n (which is the total number of people) in the clockwise manner, so that during the game pillow is passed in the increasing sequence of. When game starts, a song is played and the
person with the pillow at the end of the song, is eliminated and game starts again till there is only one person is left, which is declared as the winner of the game.
  You are given [total number of people playing the game] and the [duration of the song in seconds]. If game starts with pillow being put on a table & person1 (person with tag number 1) picking it up (at the end of the first second [time], pillow with be with person1) and each person takes one second to transfer the pilow to the next person, you have to tell which person (tag number) which will win the game.   [TIME: 45min]
  
Input/Output Specifications:
 
Input:
Your first input will be total number of people (n: Integer type)
Your second input will be time duration of the song in seconds (k: Integer type)
Output:
Your output will be Tag number of the winner (Integer).
Examples
Example1: Let there are 5 people and duration of the song is 2 seconds (every second person present in the clockwise manner will be eliminated) then people will be eliminated in the following order: 2,4,1,5 and person with tag 3 will be the winner.
Example2: If there are 11 person in the beginning of the game, and song duration is 4 seconds then people will be eliminated in following order:
 4,8,1,6,11,7,3,2,5,10 and winner will be the person with tag no.9.
