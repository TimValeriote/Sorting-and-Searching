
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class linearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        
    }
   public int linearSearch(int find, int[] n){
   for(int i = 0; i < n.length; i++){
      if(n[i] == find){
         return i;
      }
   }
   return -1;
}
    
}
