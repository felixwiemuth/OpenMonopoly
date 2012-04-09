/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.cycles;

import backend.GameStatus;
import backend.InstructionCycle;
import java.util.ArrayList;

/**
 *
 * @author felix
 */
public class Round extends InstructionCycle {
    public interface RoundModule {
        public void before_round();
        public void after_round();
    }
    
    //Reference to loaded 'Round'-modules
    public ArrayList<RoundModule> modules;
    //Other 'InstructionCycle's used by this cycle
    Turn turn;
    
    public Round(GameStatus status) {
        super(status);
        modules = new ArrayList<>();
        turn = new Turn(status);
    }
    
    public void addModule(RoundModule module) {
        modules.add(module);
    }
    
    public Turn turn() {
        return turn;
    }

    @Override
    public void run() {
        /* 1. */
        for (RoundModule m : modules) {
            m.before_round();
        }
        /* 2. */
        while (status.runTurns) {
            turn.run();
        }
        /* 3. */
        for (RoundModule m : modules) {
            m.after_round();
        }
    }
    
}
