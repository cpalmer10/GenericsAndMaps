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
       

        Movie stevenSpielberg = new Movie("E.T.","Spielberg", "SPIELET");
        Movie michaelBay = new Movie("Transformers", "Bay", "TRNSFRM");
        Movie martinScorsese = new Movie("Shutter Island", "Scorsese", "SHTISL");
        Movie jamesCameron = new Movie("Avatar", "Cameron", "JCAVTR");
        Movie stevenSpielberg1 = new Movie("E.T.","Spielberg", "SPIELET");

        map.put("Spielberg", stevenSpielberg1); 
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
