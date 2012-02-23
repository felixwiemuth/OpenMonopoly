/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.core;

/**
 *
 * @author Felix Wiemuth
 */
public class PlanElementBlock {
    
    private PlanElement begin;
    private PlanElement curr;
    
    public PlanElementBlock() {
        
    }
    
    public void add(Field x) {
        if (begin == null) {
            begin = new PlanElement(x);
            curr = begin;
        }
        else {
            curr = curr.append(x);
        }
    }
    
    public PlanElement begin() {
        return begin;
    }

}
