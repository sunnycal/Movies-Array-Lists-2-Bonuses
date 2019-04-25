//create array list

//prompt user to enter name of a favorite movie

//add movie to array list

// use a loop to continue adding movies to array list

// when user presses q or Q print the list of movies

// after printing list of movies, exit program

//Bonus 1: Print out the list of movies sorted in alphabetical order.

//Bonus 2: Suggest a movie to the user to watch by randomly selecting a
//         movie from the list of movies entered.

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class SecondCommitMoviesArrayList {


    public static void main(String[] args) {

        //initialize array list
        ArrayList<String> favoritemovies = new ArrayList<>();

        //prompt user to enter data through keyboard
        Scanner keybd = new Scanner(System.in);


//       favoritemovies.add("The Notebook");
//       favoritemovies.add("Black Panther");
//       favoritemovies.add("If Beale Street Could Talk");
//       favoritemovies.add("Moonlight");
//       favoritemovies.add("Transformers");

//       favoritemovies.add("The Wolfe of Wall Street");
//       favoritemovies.add("Crash");
//       favoritemovies.add("The clocks in the wall");
//       favoritemovies.add("The hunger games");
//       favoritemovies.add("La La Land");
//       favoritemovies.add("The Infiltrator");

        //prompt user to type data
        System.out.println("Please type name of your favorite movie :");

        //tell keyboard to store user input
        String userAnswer = keybd.nextLine();

        //store name of user favorite movie
        //favoritemovies.add(userAnswer);


        //start while loop using .toLowerCase() to enter q or Q to exit
        while (!userAnswer.equalsIgnoreCase("q")) {
            favoritemovies.add(userAnswer);
            System.out.println("Enter the name of your favorite movie or type q or Q to exit");
            //tell keyboard to accept user input
            userAnswer = keybd.nextLine();
        }

//              **keeps printing twice** not sure where duplicate error is

        //print favorite movies in alphabetical order
        System.out.println(favoritemovies);
        Collections.sort(favoritemovies);

//       shuffle order
        Collections.shuffle(favoritemovies);
        System.out.println(favoritemovies);

//       after printing list of movies, exit program
        System.out.println("Program will now exit");


    }
}




