/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation;

/**
 *
 * @author Omar
 */
public abstract class Viechle {
    protected int numOfSeats;
    protected double factor;

    public Viechle(int numOfSeats, double factor) {
        this.numOfSeats = numOfSeats;
        this.factor = factor;
    }    
}
