package homeworkChapter7;

import java.security.SecureRandom;

public class Homework6 {
   private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST};

    private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

    public static void main(String[] args) {
      int myPoint = 0; 
      Status gameStatus; 
      int sumOfDice = rollDice();
      int won = 0;
      int lose = 0;
      int cont = 1;
      int countWon = 0;
      int countLose = 0;
      int totalWon = 0;
      int totalLose = 0;
      int[] arrayWon = new int[21];
      int[] arrayLose = new int [21];
      
      for (int games = 0; games < 200; games ++) {

       switch (sumOfDice) {
         case SEVEN: 
         case YO_LEVEN:          
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: 
         case TREY: 
         case BOX_CARS: 
            gameStatus = Status.LOST;
            break;
         default:         
            gameStatus = Status.CONTINUE; 
            myPoint = sumOfDice; 
            System.out.printf("Point is %d%n", myPoint);
            cont++;
            break;
      } 

      
      while (gameStatus == Status.CONTINUE) { 
         sumOfDice = rollDice(); 
         cont ++;

        
         if (sumOfDice == myPoint) 
            gameStatus = Status.WON;
         else if (sumOfDice == SEVEN) 
               gameStatus = Status.LOST;
      } 

      
      if (gameStatus == Status.WON) {
         System.out.println("Player wins");
         won++;
         arrayWon[cont]++;
         cont = 1;
      }
      else {
         System.out.println("Player loses");
      	lose++;
      	arrayLose[cont]++;
      	cont = 1;
      }
   }
      System.out.println(won + " games are woned");
      System.out.println(lose + " games are losed");
      
      for (int showWon = 0; showWon < arrayWon.length; showWon++) {
    	  if (arrayWon[showWon] != 0) {
    		  System.out.printf("%d tries won %d times\n", showWon, arrayWon[showWon]);
    		  totalWon =+ showWon;  
    		  countWon++;
    	  }
      }
    	  
      for (int showLose = 0; showLose < arrayLose.length; showLose++) {
          if (arrayLose[showLose] != 0) {
        	  System.out.printf("%d tries lose %d times\n", showLose, arrayLose[showLose]);
        	  totalLose =+ showLose;
        	  countLose++;
          }
     }
      
      int aver = (totalWon + totalLose)/(countWon + countLose);
      System.out.println("Chance of win is "+(won *100/(won+lose)) + " %"); 
      System.out.println("The average length of games is " + aver);
    }   

   
   public static int rollDice() {
      
      int die1 = 1 + randomNumbers.nextInt(6); 
      int die2 = 1 + randomNumbers.nextInt(6); 

      int sum = die1 + die2; 

      
      System.out.printf("Player rolled %d + %d = %d%n", 
         die1, die2, sum);

      return sum; 
   }
}


//7.18 (Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
//answers the following questions:
//a) How many games are won on the first roll, second roll, …, twentieth roll and after the
//twentieth roll?
//b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
//twentieth roll?
//c) What are the chances of winning at craps? [Note: You should discover that craps is one
//of the fairest casino games. What do you suppose this means?]
//d) What is the average length of a game of craps?
//e) Do the chances of winning improve with the length of the game?