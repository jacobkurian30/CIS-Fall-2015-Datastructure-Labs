
package MoviecollectionList;

import java.util.Scanner;

public class MovieCollectionLinkedList {

    // This is the reference to the last movie that added to the MovieLinkList

    public Movie firstLink;
    public Movie lastLink;

    // Puuting null here to show fist link always start at a value null.

    MovieCollectionLinkedList() {
        firstLink = null;
    }

    // This is to check out MovieLinkList is empty or not
    public boolean IsEmpty() {

        return (firstLink == null);
    }
    /*
     the method to call a movie based on the index number.
     The WhileLoop help to find the match for the index that user entered.
     If there is a match, it will display the details if the movie.
     */

    private void MovieCallerIndex() {
        Scanner input = new Scanner(System.in);
        Movie initialMovie = firstLink;
        System.out.println("Let's Search for a movie by it's index");
        System.out.println("--------------------------------------");
        System.out.println("Enter the movie index number of the movie to display");
        int index = input.nextInt();
        while (initialMovie.index != (index)) {
            if (initialMovie.next == null) {
                System.out.println("End Of the Search");
                break;
            } else {
                initialMovie = initialMovie.next;
            }
        }
        boolean checker;
        checker = initialMovie.index == (index);
        if (checker) {
            System.out.println("Sucessful !" + "(" + checker + ")");
            System.out.print(initialMovie.index + ")");
            System.out.println("DETAILA ABOUT THE MOVIE");
            System.out.println("-------------------------");
            System.out.println("Name of the Movie: " + initialMovie.Name);
            System.out.println("The Movie was relesed in " + initialMovie.Year);
            System.out.println("It is a " + initialMovie.Genre + " Movie");
            System.out.println("It has a rating of " + initialMovie.Rating + " out of 10");
            System.out.println("");
        } else {
            System.out.println("No match found");
        }
    }

    // The getter for the method MovieCallerIndex

    public void getterMovieCallerIndex() {
        this.MovieCallerIndex();
    }
    /*
     This method will replace the exiting movie on a index.
     The user can provide the information about the new movie.
     Then it will display. 
     */

    private void ReplaceNewMoviebyIndex() {
        Movie initialMovie = firstLink;
        Scanner input = new Scanner(System.in);
        /*
         Gwtting the information about the new movie that user want to add.
         */
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Now you can replace a specific movie in the index by one of your Favorite");
        System.out.println("-------------------------------------------------------------------------");
        System.out.print("Add the index of the movie: ");
        int index = input.nextInt();
        System.out.print("Add new movie name: ");
        input.nextLine();
        String Name = input.nextLine();
        System.out.print("Add the Year its released: ");
        int Year = input.nextInt();
        System.out.print("Add genre of the movie: ");
        input.nextLine();
        String Genre = input.nextLine();
        System.out.print("Add the Rating of the movie out of 10: ");
        double Rating = input.nextDouble();
        System.out.println("");
        while (initialMovie.index != (index)) {
            if (initialMovie.next == null) {
                System.out.println("End Of the Search");
                break;
            } else {
                initialMovie = initialMovie.next;
            }
        }
        boolean checker;
        checker = initialMovie.index == (index);
        if (checker) {
            System.out.println("You have replace an exisiting movie: " + "Status (" + checker + ")");
            initialMovie.index = index;
            initialMovie.Name = Name;
            initialMovie.Genre = Genre;
            initialMovie.Year = Year;
            initialMovie.Rating = Rating;
            System.out.println("The New updated Movie List");
            System.out.println("---------------------------");
        } else {
            System.out.println("You have entered an index that does not exit" + "Status (" + checker + ")");
        }
    }

    // The getter for the method ReplaceNewMoviebyIndex

    public void getterReplaceNewMoviebyIndex() {
        this.ReplaceNewMoviebyIndex();
    }
    /*
     Adding the movie to a specific index
     User can add a movie to any index.
     The updated list of movie will display after adding.
     */

    public void UserNewMovieIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("You Can Add Movie By Index");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.print("Add the index of the movie: ");
        int index = input.nextInt();
        System.out.print("Add new movie name: ");
        input.nextLine();
        String Name = input.nextLine();
        System.out.print("Add the Year its released: ");
        int Year = input.nextInt();
        System.out.print("Add genre of the movie: ");
        input.nextLine();
        String Genre = input.nextLine();
        System.out.print("Add the Rating of the movie out of 10: ");
        double Rating = input.nextDouble();
        System.out.println("");
        // Each link is objetct . To add new movie(link), we have to create new object
        Movie newMovie = new Movie(index, Name, Year, Genre, Rating);
        // We are going to connect the first link that created in MovieCollection with newMovie
        newMovie.next = firstLink;
        firstLink = newMovie;
        System.out.println("The updated Movie List");
        System.out.println("-----------------------");
    }
    /*
     Odering the index of the movies in the acending order.
     */

    public void inserInOrder(int index, String Name, int Year, String Genre, int Rating) {
        Movie theNewLink = new Movie(index, Name, Year, Genre, Rating);
        Movie previousMovie = null;
        Movie currentMovie = firstLink;

        while ((currentMovie != null) && (index > currentMovie.index)) {
            previousMovie = currentMovie;
            currentMovie = currentMovie.next;
        }
        if (previousMovie == null) {
            firstLink = theNewLink;
        } else {
            previousMovie.next = theNewLink;
        }
        theNewLink.next = currentMovie;
    }
    // initializing the variable size to get the count for movies.
    int size = 0;
    // initiating the the count for matches
    int matches = 0;
    /*
     Adding the movie the linked list.
     */

    public void NewMovie(int index, String Name, int Year, String Genre, double Rating) {
        // Each link is objetct . To add new movie(link), we have to create new object
       Movie newMovie = new Movie(index, Name, Year, Genre, Rating);
        // We are going to connect the first link that created in MovieCollection with newMovie
        newMovie.next = firstLink;
        firstLink = newMovie;
    }
    /*
     Part A: Creating method to add a movie to the linked list.
     This will add the movie to the list. 
     */

    private void UserNewMovie() {
        Scanner input = new Scanner(System.in);
        System.out.println("Add the index of the movie");
        int index = input.nextInt();
        System.out.print("Add new movie name: ");
        input.nextLine();
        String Name = input.nextLine();
        System.out.print("Add the Year its released: ");
        int Year = input.nextInt();
        System.out.print("Add genre of the movie: ");
        input.nextLine();
        String Genre = input.nextLine();
        System.out.print("Add the Rating of the movie out of 10: ");
        double Rating = input.nextDouble();
        System.out.println("");
        // Each link is objetct . To add new movie(link), we have to create new object
        Movie newMovie = new Movie(index, Name, Year, Genre, Rating);
        // We are going to connect the first link that created in MovieCollection with newMovie
        newMovie.next = firstLink;
        firstLink = newMovie;
    }

    // This to getter for the "UserNewMovie" method.

    public void getUserNewMovie() {
        this.UserNewMovie();
    }
    /*
     This is for go through movie collection and display all the movies.
     This method will show the next movie in the list. 
     But it is commennted out, because it is not necessary for the lab.
     But useful to track our code.
     */

    public void displayMovie() {
        Movie initialLink = firstLink;
        if (!IsEmpty()) {
            while (initialLink != null) {
                initialLink.display();
                System.out.println("Next Movie in the list: " + initialLink.next);
                initialLink = initialLink.next;
                System.out.println("");
            }
        } else {
            System.out.println("Empty Movie List");
        }
    }
    /*
     This method is similar to the display method. 
     The main difference: this is for calculate the 
     sum of the total movies in the list.
     */

    private void displayMovieTotal() {
        Movie initialLink = firstLink;
        if (!IsEmpty()) {
            while (initialLink != null) {
                initialLink.display();
                initialLink = initialLink.next;
                System.out.println("");
                size += 1;
            }
            System.out.println("Total number of movies in the list : " + size);
            System.out.println("");
        } else {
            System.out.println("Empty Movie List");
        }
    }

    //Making getters for displayMovieTotal

    public void getterDisplayMovieTotal() {
        this.displayMovieTotal();
    }
    /*
     This method will help to search through the list and find the
     movies for the user. This serach will perform based on the name 
     of the movie.
     */

    private void MovieFinderName() {
        Movie initialMovie = firstLink;
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Lets Search a movie by entering its name");
        System.out.println("------------------------------------------");
        System.out.print("Search for the movie name: ");
        System.out.println("");
        String Name = input.nextLine();

        while (!initialMovie.Name.equalsIgnoreCase(Name)) {
            if (initialMovie.next == null) {
                System.out.println("=====End Of the Search======");
                break;
            } else {
                initialMovie = initialMovie.next;
            }
        }
        //Display the details of the movie: 
        boolean checker;
        checker = initialMovie.Name.equalsIgnoreCase(Name);
        if (checker) {
            System.out.println("Search Status: " + checker);
            System.out.println("DETAIL ABOUT THE MOVIE");
            System.out.println("-------------------------");
            System.out.println("Name of the Movie: " + initialMovie.Name);
            System.out.println("The Movie was relesed in " + initialMovie.Year);
            System.out.println("It is a " + initialMovie.Genre + " Movie");
            System.out.println("It has a rating of " + initialMovie.Rating + " out of 10");
            System.out.println("");
        } else {
            System.out.println("No match found");
        }
    }

    // The getter for the method MovieFinderName

    public void getterMovieFinderName() {
        this.MovieFinderName();
    }
    /*
     Removing a specific movie from the movie collection.
     The user can remove the movie by entering the name.
     The whileLoop will help to find a match for the name.
     */

    private Movie MovieRemoverName() {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Now you are going to remove a movie by it's name");
        System.out.println("-------------------------------------------------");
        System.out.println("Enter the name of the movie to remove: ");
        String Name = input.nextLine();
        System.out.println("===================================");
        System.out.println("-----------Processing-------------");
        System.out.println("==================================");
        Movie initialMovie = firstLink;
        Movie LastMovie = firstLink;
        if (!IsEmpty()) {
            // Searching for a the name of the movie
            while (!initialMovie.Name.equalsIgnoreCase(Name)) {
                if (initialMovie.next == null) {
                    String dial = "Empty";
                    System.out.println("Sorry we don't have that movie in our list");
                    return null;
                } else {
                    LastMovie = initialMovie;
                    initialMovie = initialMovie.next;
                }
            }
            if (initialMovie == firstLink) {
                System.out.println("Removing Processes Successful!");
                firstLink = firstLink.next;
            } else {
                LastMovie.next = initialMovie.next;
            }
        } else {
            System.out.println("Empty Movie List");
        }
        return initialMovie;
    }

    // The getter for the method MovieRemoverName

    public void getterMovieRemoverName() {
        this.MovieRemoverName();
    }

    /*
     This method is using to remove movie by entering the index
     The whileloop help to go through the list and find a matching index.
     */
    private Movie MovieRemoverIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Now you can Remove a movie by it's Index");
        System.out.println("------------------------------------------");
        System.out.println("Enter the the index number of the movie that you want to remove: ");
        int index = input.nextInt();
        System.out.println("===================================");
        System.out.println("---------- Processing -------------");
        System.out.println("===================================");
       Movie initialMovie = firstLink;
        Movie LastMovie = firstLink;
        //   if (!IsEmpty()) {
        while (initialMovie.index != (index)) {
            if (initialMovie.next == null) {
                String dial = "Empty";
                System.out.println("You have entered wrong index!");
                return null;
            } else {
                LastMovie = initialMovie;
                initialMovie = initialMovie.next;
            }
        }
        if (initialMovie == firstLink) {
            System.out.println("Removing Processes Successful!");
            firstLink = firstLink.next;
        } else {
            LastMovie.next = initialMovie.next;
        }
       // } else {
        //   System.out.println("Empty Movie List");
        // }
        return initialMovie;
    }

    // This is the getter method for MovieRemoverIndex

    public void getterMovieRemoverIndex() {
        this.MovieRemoverIndex();
    }
    /*
     This is the method for user to find all the movies in genre.
     There are two while loops to search through the entire list.
     First whileloop continue untill the list reach the last movie.
     second whileloops find the genre that user looking for.
     */

    private void MovieFinderGenre() {

        Movie initialMovie = firstLink;
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Now you can Search for the list of movie in a specific Genre");
        System.out.println("------------------------------------------------------------");
        System.out.print("Enter the movie Genre: ");
        String Genre = input.nextLine();
        // First whileloop to go untill the end of the list
        while (initialMovie != null) {
            //Second whileloop to find the genre of the movie
            while (!initialMovie.Genre.equalsIgnoreCase(Genre)) {
                if (initialMovie.next == null) {
                    System.out.println("=======End Of the Search=========");
                    break;
                } else {
                    initialMovie = initialMovie.next;
                }
            }
            boolean checker;
            checker = initialMovie.Genre.equalsIgnoreCase(Genre);
            if (checker) {
                //Displaying the information about the movie
                System.out.println("=======================================================");
                System.out.println("Search Status: " + checker);
                System.out.println("DETAIL ABOUT THE MOVIE");
                System.out.println("-------------------------");
                System.out.println("Name of the Movie: " + initialMovie.Name);
                System.out.println("The Movie was relesed in " + initialMovie.Year);
                System.out.println("It is a " + initialMovie.Genre + " Movie");
                System.out.println("It has a rating of " + initialMovie.Rating + " out of 10");
                System.out.println("========================================================");
                matches = matches + 1;
            }
            initialMovie = initialMovie.next;
        }
        System.out.println("Total Matches = " + matches);
    }

    // the getter for the function MovieFinderGenre

    public void getterMovieFinderGenre() {
        this.MovieFinderGenre();
    }
}
