package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
       
      
        List favFords =  new ArrayList();
        favFords.add("Ford GT");
        favFords.add("Shelby GT350");
        
        List favChevy = new ArrayList();
        favChevy.add("Corvette");
        favChevy.add("Camaro");
        
        
        
        Map favoriteCars = new HashMap();    
        favoriteCars.put("Ford", favFords);
        favoriteCars.put("Chevy", favChevy);
        favoriteCars.put("Dodge", "Viper");
        
        List found =  (List)favoriteCars.get("Ford");
        System.out.println(found);
    }
    
}
