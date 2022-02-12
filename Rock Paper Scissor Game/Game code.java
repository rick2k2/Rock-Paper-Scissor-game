package com.javafull;
//Rock,paper,scissors game Developed by Rick saha

import java.util.Scanner;
import java.util.Random;


public class lec20 {
    public static void main(String[] args) {

//        logic part implement through this concept
//        Rock bit scissors
//        scissors bit paper
//        paper bit  Rock



//      user input
        int userchoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock,Paper,Scissor game");
        System.out.println("Game Mode : (Computer v/s Human)");
        System.out.println("Option Menu:");
        System.out.println("1.Choose 1 for Rock");
        System.out.println("2.Choose 2 for Paper");
        System.out.println("3.Choose 3 for Scissor");
        System.out.println("Note:Once you choose your decision this is final and immutable");
        System.out.println("Lets play this game!\nEnjoy Buddy");
        System.out.println("please choose a option from above Menu:\n[Enter(1,2,3) any]:-");
        userchoice = sc.nextInt();

//      user choice show
        switch (userchoice){
            case 1 -> System.out.println("User choose Rock!");
            case 2 -> System.out.println("User choose PaperRock!");
            case 3 -> System.out.println("User choose Scissor!");
        }



//      This is computer generated random number we take it as a input
        int computerchoice;
        Random rn = new Random();
        computerchoice=rn.nextInt(4);
        //Remember:Bounds work  (num-1);


//      computerchoice show
        switch (computerchoice){
            case 1 -> System.out.println("Computer choose Rock!");
            case 2 -> System.out.println("Computer choose Paper!");
            case 3 -> System.out.println("Computer choose Scissor!");
        }



//      Main logic here
     if(userchoice==1 && computerchoice==1)
     {
         System.out.println("Dismiss!");
     }
      if(userchoice==1 && computerchoice==2)
      {
          System.out.println("Winner computer!");
      }
      else if(userchoice==1 && computerchoice==3){
          System.out.println("Winner User");
      }


      else if(userchoice==2 && computerchoice==1){
          System.out.println("Winner user");
      }
      else if(userchoice==2 && computerchoice==2){
          System.out.println("Dismiss!");
      }
      else if(userchoice==2 && computerchoice==3){
          System.out.println("Winner Computer!");
      }


      else if(userchoice==3 && computerchoice==1){
          System.out.println("Winner Computer!");
      }
      else if(userchoice==3 && computerchoice==2){
          System.out.println("Winner user");
      }
      else if(userchoice==3 && computerchoice==3){
          System.out.println("Dismiss!");
      }


    }

}
