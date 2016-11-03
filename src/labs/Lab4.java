/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Chris
 */
public class Lab4 {
     public static void main(String[] args) {
        Map<String, Movie> map = new HashMap<String,Movie>();
    
    
        Movie stevenSpielberg = new Movie("E.T.","Spielberg", "SPIELET");
        Movie michaelBay = new Movie("Transformers", "Bay", "TRNSFRM");
        Movie martinScorsese = new Movie("Shutter Island", "Scorsese", "SHTISL");
        Movie jamesCameron = new Movie("Avatar", "Cameron", "JCAVTR");
        Movie stevenSpielberg1 = new Movie("E.T.","Spielberg", "SPIELET");

        map.put("Spielberg", stevenSpielberg);
        map.put("Bay", michaelBay);
        map.put("Scorsese",martinScorsese);
        map.put("Cameron", jamesCameron);
        
        
        Map<String,Movie> map2 = new TreeMap<String,Movie>(map);
        Set<String> keys2 = map2.keySet();
        for(String key : keys2) {
            Movie found = map.get(key);
            //System.out.println(found.toString());
        }
        
        Collection<Movie> values = map2.values();
        List<Movie> sortedMovies = new ArrayList<Movie>(values);
        
        Collections.sort(sortedMovies, new MovieByDirector());
        for(Movie movie : sortedMovies){
            System.out.println(movie);
        }
     }
}
