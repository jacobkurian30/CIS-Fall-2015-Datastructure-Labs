/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoviecollectionList;


class Movie {

    public String Name;
    public int Year;
    public String Genre;
    public double Rating;
    public int index;

    //Reference to the next movie in the linkedlist
    public Movie next;
    public Movie Previous;

    public Movie(int index, String Name, int Year, String Genre, double Rating) {
        this.Name = Name;
        this.Year = Year;
        this.Genre = Genre;
        this.Rating = Rating;
        this.index = index;
    }
// This is to display the the information on the screen

    public void display() {
        System.out.println(index + ") " + Name + "(" + Year + ") :" + Genre + " Rating: " + Rating);
    }

    @Override
    public String toString() {
        return Name;
    }
}