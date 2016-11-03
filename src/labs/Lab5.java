/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Chris
 */
public class Lab5 {
    public static void main(String[] args) {
        Movie stevenSpielberg = new Movie("E.T.","Spielberg", "SPIELET");
        Movie michaelBay = new Movie("Transformers", "Bay", "TRNSFRM");
        Movie martinScorsese = new Movie("Shutter Island", "Scorsese", "SHTISL");
        Movie jamesCameron = new Movie("Avatar", "Cameron", "JCAVTR");
        Movie stevenSpielberg1 = new Movie("E.T.","Spielberg", "SPIELET");

        List<Movie> movies1 = new ArrayList<>();
        movies1.add(stevenSpielberg);
        movies1.add(stevenSpielberg1);
        movies1.add(michaelBay);
        movies1.add(martinScorsese);
        movies1.add(jamesCameron);
        
        Set<Movie> movies = new TreeSet<>();
        movies.add(stevenSpielberg);
        movies.add(stevenSpielberg1);
        movies.add(michaelBay);
        movies.add(martinScorsese);
        movies.add(jamesCameron);
              
        System.out.println("Unsorted list size: " + movies1.size());
        System.out.println("Sorted set size: " + movies.size());
        System.out.println();
        
        int i = 0;
        for (Movie mo : movies1){
            
            System.out.println("\tUnsorted list counter: " + ++i);
            System.out.println(mo);
            System.out.println();
        }
        int j = 0;
        for (Movie m : movies) {
            System.out.println("\tSorted set counter: " + ++j);           
            System.out.println(m);
            System.out.println();
        }
    }
}
