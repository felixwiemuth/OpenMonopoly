/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.board;

import backend.core.Player;

/**
 * All kinds of fields on the game board.
 * Should be created constant and only once, the game then
 * deals with references.
 * @author Felix Wiemuth
 */
public abstract class Field {
    private String name; // Fields display name
    /* private T image //graphics of this element to be displayed */
    
    public Field(String name) {
        this.name = name;
    }
    
    public String name() {
        return name;
    }
    
    /**
     * Action when player lands on this field.
     */
    abstract public void onLand(Player player);
    
    /**
     * Action when player passes this field (in gaming direction!)
     */
    abstract public void onPass(Player player);
    
}
