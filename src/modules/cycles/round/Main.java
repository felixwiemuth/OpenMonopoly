/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package modules.cycles.round;

import backend.core.GameStatus;
import backend.moduleInterfaces.Module;
import backend.cycles.Round;

/**
 *
 * @author felix
 */
public class Main extends Module implements Round.RoundModule {

    public Main(GameStatus status) {
        super(status);
    }
    
    @Override
    public void before_round() {
        status.runTurns = true;
        //DEBUG
        mlog("RoundModule", "before_round()");
    }

    @Override
    public void after_round() {
        //DEBUG
        mlog("RoundModule", "after_round()");
        //DEBUG TEST
        status.runRounds = false;
    }    
}
