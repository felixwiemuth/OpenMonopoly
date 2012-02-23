/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.util;

import backend.core.PlanElement;

/**
 *
 * @author Felix Wiemuth
 */
public class functions {
    
//    /**
//     * Link 'PlanElement's a and b together so that "a->b"
//     * ('a.next==b && b.prev==a').
//     * @param a Left element
//     * @param b Right element
//     */
//    public static void link(PlanElement a, PlanElement b) {
//        //TODO exception instead of return
//        if (!a.setNext(b))
//            return;
//        if (!b.setPrev(a)) {
//            a.clearNext();
//            return;
//        }
//    }
    
    public static void log(Object o) {
        System.out.println(o);
    }

}
