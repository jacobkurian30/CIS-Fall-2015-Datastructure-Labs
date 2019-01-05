package MoviecollectionList;
// Jacob Kurian
// Lab 3 and 4
// CIS 2168
// Assignment: Movie Collection as Linked List

import java.util.Scanner;

/*---------------------------------
 The main class start from here
 ------------------------------------*/

public class MovieCollectionLinkedListTest {

    public static void main(String[] args) {
        String Choice;
        Scanner input = new Scanner(System.in);
        /*
         The do-while loops starts here.
         This loops is here to make a menu on the screen.
         The ask whether we want to run this program again or not.
         */
        do {
            // creating an object to call the methods
            MovieCollectionLinkedList call = new MovieCollectionLinkedList();
            // A basic displayer message that showing the list of the movies
            // This is not a linked list
            display();
            // Calling the method that add the movie based on the index
            call.UserNewMovieIndex();

            // Creating the list of the movies
            call.inserInOrder(1, "iron Man", 2008, "Action", 8);
            call.inserInOrder(2, "Avengers", 2015, "Action", 7);
            call.inserInOrder(3, "Cripson Peak", 2015, "Horror", 7);
            call.inserInOrder(4, "Thor", 2011, "Fantasy", 8);
            call.inserInOrder(5, "Captain America", 2014, "Adventure", 7);
            call.inserInOrder(6, "X men", 2000, "Sci-Fi", 7);
            call.inserInOrder(7, "Spider-Man", 2002, "Action", 7);
            call.inserInOrder(8, "The Jungle Book", 2016, "Fantasy", 7);
            call.inserInOrder(9, "Fantastic Four", 2015, "Fantasy", 8);
            /*
             Calling the method from class "MovieLinkList" to display
             the updated movie list. Also this shows the total number of movies in the list.
             */
            call.getterDisplayMovieTotal();

            /*
             This is the function to search the movie by its name. 
             */
            call.getterMovieFinderName();

            // This is the method to search and display a movie by its index.
            call.getterMovieCallerIndex();

            /* This is the method for replace a movie in the index by a new movie
             that is provided by the user. The movie information will print on the screen
             */
            call.getterReplaceNewMoviebyIndex();
            // This method is for display the updated movie list
            call.displayMovie();
            // This is the method to remove a movie by it's index
            call.getterMovieRemoverIndex();
            // Displaying the updated list
            call.displayMovie();
            // Method to remove a movie by it's name
            call.getterMovieRemoverName();
            //Displaying the updaed movie list
            call.displayMovie();
            // This method search for the list of the movie in the same genre
            call.getterMovieFinderGenre();

            System.out.println("===========Menu=================");
            System.out.println("* Do you want to run this program again ? ");
            System.out.println("Type 'Yes' to 'continue'");
            System.out.println("____________OR___________");
            System.out.println("Press 'any other key' to 'exit'");
            Choice = input.next();
        } /*
         This is the part of do while loop.
         Asking the user that does he want to continue or not.
         */ while (Choice.equalsIgnoreCase("Yes"));
        // The end meesage after user prees exit
        System.out.println("===============================");
        System.out.println("*********Thank You !***********");
        System.out.println("===============================");
    }

    // A basic displayer at the very begining.
    //Not a linked list

    public static void display() {
        System.out.println("Welcome to the Movie List");
        System.out.println("--------------------------");
        System.out.println("1) Iron Man(2008) : Action : Rating: 8");
        System.out.println("2) Avengers (2015) : Action: Rating: 7");
        System.out.println("3) Crimson Peak(2015) : Horror : Rating: 7");
        System.out.println("4) Thor (2011) : Fantasy :Rating: 8");
        System.out.println("5) Captain America (2014) : Adventure: Rating: 7");
        System.out.println("6) X men (2000): Sci-Fi: Rating: 7 ");
        System.out.println("7) Spider-Man (2002) : Action : Rating: 7");
        System.out.println("8) The Jungle Book (2016) :Fantasy: Rating: 7");
        System.out.println("9) Fastastic Four (2015) : Fantasy:Rating: 8");
    }
}
/*--------------------------------------------------------------
 The third class start here. 
 All of the methods for the program is in this class.
 ----------------------------------------------------------*/
 //This is the linked list of the program
// That means this class know the last the address of the last movie.

