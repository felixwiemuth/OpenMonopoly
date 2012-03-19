/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend;

import backend.board.Field;

/**
 *
 * @author felix
 */
public interface EventHandler {
    public void player_pass_field(Player player, Field field);
    public void player_land_field(Player player, Field field);    
}
