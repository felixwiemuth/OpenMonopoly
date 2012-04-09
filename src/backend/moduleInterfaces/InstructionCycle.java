/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.moduleInterfaces;

import backend.core.GameStatus;

/**
 * An 'InstructionCycle' defines the order of steps that are
 * repeatedly executed during the game.
 * What is done during a step is defined in 'Module's.
 * 'InstrcutionCycle's can be nested into eachother,
 * for example you have a "Game" cycle which defines the steps of
 * a whole came, in this cycle another cycle "Round" defines how a
 * game round works etc. ("Round" is then executed by the "Game cycle").
 * Each implemented 'InstructionCycle' should define a correspondent interface
 * including the needed methods which the 'Module's should implement.
 * @author Felix Wiemuth
 */
public abstract class InstructionCycle {    
    protected GameStatus status;
    
    /**
     * 
     * @param status 'GameStatus' instance this InstructionCycle should run on
     */
    public InstructionCycle(GameStatus status) {
        this.status = status;
    }
    
    /**
     * Start the execution of the cycle.
     * The cycle itselfs decides when to stop cycling.
     */
    abstract public void run();
}
