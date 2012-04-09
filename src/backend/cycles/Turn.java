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
public class Turn extends InstructionCycle {
    public interface TurnModule {
        public void before_turn(); /** Do this before turn */
        public void dice();
        public void play();
        public void after_turn();
    }
    
    //Reference to loaded 'Turn'-modules
    public ArrayList<TurnModule> modules;
    
    public Turn(GameStatus status) {
        super(status);
        modules = new ArrayList<>();
    }
    
    public void addModule(TurnModule module) {
        modules.add(module);
    }
    
    @Override
    public void run() {
        /* 1. */
        for (TurnModule m : modules) {
            m.before_turn();
        }
        /* 2. */
        for (TurnModule m : modules) {
            m.dice();
        }
        /* 3. */
        for (TurnModule m : modules) {
            m.play();
        }
        /* 4. */
        for (TurnModule m : modules) {
            m.after_turn();
        }
    }
}
