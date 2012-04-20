/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.moduleInterfaces;

import backend.core.GameStatus;

/**
 *
 * @author Felix Wiemuth
 */
public abstract class EventModule extends Module implements EventHandler {
    
    public EventModule(GameStatus status) {
        super(status);
    }
    
}
