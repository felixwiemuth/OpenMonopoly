/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.board;

import backend.core.Player;
import java.util.ArrayList;

/**
 * A Monopoly Street
 * @author Felix Wiemuth
 */
public class Street extends PropertyField {
    public interface EventHandler {
        public void onLand(Player player);
        public void onPass(Player player);
    }
    
    private ArrayList<EventHandler> handlers;
    
    static int maxHousesInit = 5;
    private int maxHouses; //maximum number of houses that can be built (=hotel)
    private int[] rents; //[0]: rent without houses [n]: rent with n houses
    
    public Street(String name, int price, int group, int maxHouses) {
        super(name, price, group);
        this.maxHouses = maxHouses;
        rents = new int[maxHouses+1];
    }
    
    public Street(String name, int price, int group) {
        this(name, price, group, maxHousesInit);
    }
    
    /**
     * Generates the usual grading of rents (based on 'price') and saves
     * them to 'rents[]'
     */
    public void generateRents() {
        //TODO implement        
    }
    
    @Override
    public void onLand(Player player) {
        for (EventHandler h : handlers) {
            h.onLand(player);
        }
    }

    @Override
    public void onPass(Player player) {
        for (EventHandler h : handlers) {
            h.onPass(player);
        }
    }
}
