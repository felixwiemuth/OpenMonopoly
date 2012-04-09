/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.cycles;

import backend.core.GameStatus;
import backend.moduleInterfaces.InstructionCycle;
import java.util.ArrayList;

/**
 *
 * @author felix
 */
public class Game extends InstructionCycle {
    public interface GameModule {
        public void before_game();
        public void init();
        public void finish();
        public void after_game();
    }
    
    //Reference to loaded 'Game'-modules
    private ArrayList<GameModule> modules;
    //Other 'InstructionCycle's used by this cycle
    private Round round;
    
    public Game(GameStatus status) {
        super(status);
        modules = new ArrayList<>();
        round = new Round(status);
    }
    
    public void addModule(GameModule module) {
        modules.add(module);
    }
    
    public Round round() {
        return round;
    }

    @Override
    public void run() {
        /* 1. Before Game */
        for (GameModule m : modules) {
            m.before_game();
        }
        /* 2. Initialize Game */
        for (GameModule m : modules) {
            m.init();
        }
        /* 3. Play rounds */
        while (status.runRounds) {
            round.run();
        }
        /* 4. ... */
        for (GameModule m : modules) {
            m.finish();
        }
        /* 5. After Game */
        for (GameModule m : modules) {
            m.after_game();
        }
    }
    
}
