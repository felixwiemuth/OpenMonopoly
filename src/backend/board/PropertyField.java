/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.board;

/**
 * Property field that can be owned by players.
 * @author Felix Wiemuth
 */
public abstract class PropertyField extends Field {
    private int price; //property value
    private int group; //id of (e.g. color-)group this property belongs to
    
    public PropertyField(String name, int price, int group) {
        super(name);
        this.price = price;
        this.group = group;
    }
}
