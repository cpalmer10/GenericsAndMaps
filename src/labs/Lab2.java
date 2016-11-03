/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Chris
 */
public class Lab2 {
    public static void main(String[] args) {
       Map map = new HashMap();
       
//       List spielbergMovies = new ArrayList();
//       spielbergMovies.add("Jaws");
//       spielbergMovies.add("Star Wars");
//       spielbergMovies.add("E.T.");
//       
//       List michaelBayMovies = new ArrayList();
//       michaelBayMovies.add("Transformers");
//       michaelBayMovies.add("Bad Boys II");
//       michaelBayMovies.add("Pearl Harbor");
//       
//       List scorseseMovies = new ArrayList();
//       scorseseMovies.add("Good Fellas");
//       scorseseMovies.add("Shutter Island");
//       scorseseMovies.add("Hugo");
//       
//       List cameronMovies = new ArrayList();
//       cameronMovies.add("Avatar");
//       cameronMovies.add("Titanic");
//       cameronMovies.add("Aliens");
       
       
//       map.put("Spielberg", spielbergMovies);
//       map.put("Bay", michaelBayMovies);
//       map.put("Scorsese", scorseseMovies);
//       map.put("Cameron", cameronMovies);
        Movie stevenSpielberg = new Movie("E.T.","Spielberg", "SPIELET");
        Movie michaelBay = new Movie("Transformers", "Bay", "TRNSFRM");
        Movie martinScorsese = new Movie("Shutter Island", "Scorsese", "SHTISL");
        Movie jamesCameron = new Movie("Avatar", "Cameron", "JCAVTR");

        map.put("Spielberg", stevenSpielberg);
        map.put("Bay", michaelBay);
        map.put("Scorsese",martinScorsese);
        map.put("Cameron", jamesCameron);
        //map.put("Cameron", "Titanic");
       
        Movie m = (Movie)map.get("Spielberg");
        System.out.println(m);
        
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Movie m1 = (Movie) map.get(key);
            System.out.println(m1);
        }
        
        
    }
   
}
