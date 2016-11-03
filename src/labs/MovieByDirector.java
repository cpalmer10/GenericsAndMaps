/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

import java.util.Comparator;

/**
 *
 * @author Chris
 */
public class MovieByDirector implements Comparator<Movie> {

    @Override
    public int compare(Movie t, Movie t1) {
       return t.getDirector().compareTo(t1.getDirector());
    }
    
}
