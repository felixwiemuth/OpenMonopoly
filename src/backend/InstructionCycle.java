/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend;

/**
 * An 'InstructionCycle' defines the order of steps that are
 * repeatedly executed during the game.
 * 'InstrcutionCycle's can be nested into eachother,
 * for example you have a "Game" cycle which defines the steps of
 * a whole came, in this cycle another cycle "Round" defines how a
 * game round works etc. ("Round" is then executed by the "Game cycle").
 * @author Felix Wiemuth
 */
public interface InstructionCycle {
    
    /**
     * Start the execution of the cycle.
     * The cycle itselfs decides when to stop cycling.
     */
    public void run();

}
