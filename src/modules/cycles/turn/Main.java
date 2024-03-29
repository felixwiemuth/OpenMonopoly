/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package modules.cycles.turn;

import backend.core.GameStatus;
import backend.moduleInterfaces.cycles.TurnModule;

/**
 *
 * @author felix
 */
public class Main extends TurnModule {

    public Main(GameStatus status) {
        super(status);
    }
    
    @Override
    public void before_turn() {
        //DEBUG
        mlog("TurnModule", "before_turn()");
    }

    @Override
    public void dice() {
        //DEBUG
        mlog("TurnModule", "dice()");
    }

    @Override
    public void play() {
        //DEBUG
        mlog("TurnModule", "play()");
        //DEBUG TEST
        status.runTurns = false;
    }

    @Override
    public void after_turn() {
        //DEBUG
        mlog("TurnModule", "after_turn()");
    }    
}
