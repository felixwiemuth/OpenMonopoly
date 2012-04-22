/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.moduleInterfaces.eventHandlers;

import backend.board.Street;
import backend.core.GameStatus;
import backend.moduleInterfaces.Module;

/**
 *
 * @author Felix Wiemuth
 */
public abstract class StreetHandler extends Module implements Street.EventHandler {
    
    public StreetHandler(GameStatus status) {
        super(status);
    }
}
