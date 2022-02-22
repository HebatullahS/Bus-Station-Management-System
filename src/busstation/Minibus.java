/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation;

/**
 *
 * @author lenovo
 */
public class Minibus extends Viechle {
    
    public Minibus(int numOfSeats, double factor) {
        super(numOfSeats, factor);
    }
    
     public double ticket_price(){
      int value=5;
      
        return value*factor;
       
   }
}
