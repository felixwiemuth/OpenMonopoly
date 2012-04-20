/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.moduleInterfaces.cycles;

import backend.core.GameStatus;
import backend.cycles.Turn;
import backend.moduleInterfaces.Module;

/**
 *
 * @author Felix Wiemuth
 */
public abstract class TurnModule extends Module implements Turn.TurnModule {
    
    public TurnModule(GameStatus status) {
        super(status);
    }
    
}
