/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend;

import backend.core.Board;

/**
 *
 * @author Felix Wiemuth
 */
public class GameStatus {
    //data
    private Board board;
    private Playlist players;
    
    //status
    public boolean runRounds; //if set 'false', rounds will end
    public boolean runTurns; //if set 'false', current round will end

    public GameStatus() {
    }
    
//    public boolean runRounds() {
//        return runRounds;
//    }
}
