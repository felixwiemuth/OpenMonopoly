/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.moduleInterfaces.eventHandlers;

import backend.board.ActionField;
import backend.core.GameStatus;
import backend.moduleInterfaces.Module;

/**
 *
 * @author Felix Wiemuth
 */
public abstract class ActionFieldHandler extends Module implements ActionField.EventHandler {
    
    public ActionFieldHandler(GameStatus status) {
        super(status);
    }
}
