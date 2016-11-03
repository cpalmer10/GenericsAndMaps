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


        map.put("Spielberg", "E.T.");
        map.put("Bay", "Transformers");
        map.put("Scorsese","Good Fellas");
        map.put("Bay", "Transformers");
        //map.put("Cameron", "Titanic");
       
       List found = (List)map.get("Spielberg");
        System.out.println(found);
        
    }
   
}
