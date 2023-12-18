package com.rockpaperscissors;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String[] rps = {"r", "p", "s"};
            String compInput = rps[new Random().nextInt(rps.length)];
            String userInput;
            while (true) {
                System.out.println("Select: r, p, s");
                userInput = sc.nextLine();
                if (userInput.equals("r") || userInput.equals("p") || userInput.equals("s")) {
                    break;
                } else {
                    System.out.println(userInput + " is not a valid response.");
                    System.out.println("Try Again!!");
                }
            }
            if (compInput.equals(userInput)) {
                System.out.println("Draw");
            } else if (userInput.equals("r")) {
                if (compInput.equals("p")) {
                    System.out.println("You Lose!!");
                } else if (compInput.equals("s")) {
                    System.out.println("You Win!!");
                }
            } else if (userInput.equals("p")) {
                if (compInput.equals("r")) {
                    System.out.println("You Win!!");
                } else if (compInput.equals("s")) {
                    System.out.println("You Lose!!");
                }
            } else if (userInput.equals("s")) {
                if (compInput.equals("p")) {
                    System.out.println("You Win!!");
                } else if (compInput.equals("r")) {
                    System.out.println("You Lose!!");
                }
            }
            System.out.println("play again y/n");
            String again = sc.nextLine();
            if(again.equals("n")){
                break;
            }
        }
    }
}