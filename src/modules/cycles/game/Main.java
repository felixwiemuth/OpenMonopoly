/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package modules.cycles.game;

import backend.core.GameStatus;
import backend.moduleInterfaces.cycles.GameModule;

/**
 *
 * @author felix
 */
public class Main extends GameModule {
    
    public Main(GameStatus status) {
        super(status);
    }

    @Override
    public void before_game() {
        //DEBUG
        mlog("GameModule", "before_game()");
        status.runRounds = true;
    }

    @Override
    public void init() {
        //DEBUG
        mlog("GameModule", "init()");
    }

    @Override
    public void finish() {
        //DEBUG
        mlog("GameModule", "finish()");
    }

    @Override
    public void after_game() {
        //DEBUG
        mlog("GameModule", "after_game()");
    }
}
