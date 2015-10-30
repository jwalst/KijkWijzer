/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wijzer;

import java.util.*;
/**
 *
 * @author Jeffrey
 */
public class Overzicht {
   private ArrayList<Film> lijst; 
   
   public Overzicht(){
   lijst = new ArrayList<Film>();
   
   lijst.add(new Film(1877832, "X-Men: Days of Future Past","horror"));
   lijst.add(new Film(1086772, "Blended", "detective"));
   lijst.add(new Film(1179031, "Cold in July","actie"));
   lijst.add(new Film(2405372, "Stand clear of the closing doors","romantisch"));
   lijst.add(new Film(2380331, "Words and Pictures", "horror"));
   lijst.add(new Film(1294970, "The angriest man in Brooklyn", "actie"));
   }
   
   public String getLijst(){
       String s="";
       
       for(Film f:lijst){
           s +="<tr>";
           s +="<td>"+f.getNummer()+"</td>";
           s +="<td>"+f.getTitel()+"</td>";
           s +="<td>"+f.getKijkwijzer()+"</td>";
           s +="</tr>";
       }
       return s;
   }
   
   public String zoek(String z){
       String s="";
       
       for(Film f:lijst){
           if(f.getTitel().equals(z)){
           s +="<br />";
           s +="<h1>"+f.getTitel()+"</h1>";
           s +="<br />"+f.getKijkwijzer();
           s +="<br /><a href='http://www.imdb.com/title/tt"+f.getNummer()+"'>http://www.imdb.com/title/tt"+f.getNummer()+"</a><br /><br />";
           }
       }
       return s;
   }
}
