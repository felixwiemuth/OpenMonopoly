/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.core;

/**
 * A Monopoly Street
 * @author Felix Wiemuth
 */
public class Street extends PropertyField {
    //TODO static memebr 'maxHousesInit' to have a standard iinitializer!
    private int maxHouses; //maximum number of houses that can be built (=hotel)
    private int[] rents; //[0]: rent without houses [n]: rent with n houses
    
    public Street(String name, int price, int group, int maxHouses) {
        super(name, price, group);
        this.maxHouses = maxHouses;
        rents = new int[maxHouses+1];
    }
    
    /**
     * Generates the usual grading of rents (based on 'price') and saves
     * them to 'rents[]'
     */
    public void generateRents() {
        //TODO implement        
    }

    @Override
    public void onLand() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onPass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
