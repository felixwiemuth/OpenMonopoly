/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend;

/**
 *
 * @author Felix Wiemuth
 */
public class PlayerAction implements Action {
    int p1, p2;
    
    public PlayerAction(int player1, int player2) {
        p1 = player1;
        p2 = player2;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
        //like: "p1.pay(p2, 500);"
    }

}
