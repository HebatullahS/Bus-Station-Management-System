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
public class Bus extends Viechle{
    
    public Bus(int numOfSeats, double factor) {
        super(numOfSeats, factor);
    }
    
      public double ticket_price(){
      double value = 10;
      
        return value *factor;
      
      
  }

    
}
