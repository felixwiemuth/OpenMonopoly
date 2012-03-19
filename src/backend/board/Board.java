/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.board;

import static backend.util.functions.log;

/**
 * The game board.
 * @author Felix Wiemuth
 */
public class Board {
    private PlanElement begin; //currently first field on board
    private PlanElement end; //currently last field on board
    
    
    public Board(Field initialField) {
        end = new PlanElement(initialField); //simple start field with no further meaning //TODO verify
        begin = end;
    }
    
    /**
     * Adds the chain of 'PlanElement's starting with 'p'
     * @param p
     */
    public void addPlanElements(PlanElement p) {
        for (; p != null; p = p.next()) {
            end.setNext(new PlanElement(p));
            end.next().setPrev(end);
            end = end.next();
        }
    }
    
    public void addPlanElements(PlanElementBlock b) {
        addPlanElements(b.begin());
    }
    
    public void printPlanElements() {
        for (PlanElement p = begin; p != null; p = p.next()) {
            log(p.field().name());
        }
    }
}
