/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.moduleInterfaces.cycles;

import backend.core.GameStatus;
import backend.cycles.Round;
import backend.moduleInterfaces.Module;

/**
 *
 * @author Felix Wiemuth
 */
public abstract class RoundModule extends Module implements Round.RoundModule {
    
    public RoundModule(GameStatus status) {
        super(status);
    }
    
}
