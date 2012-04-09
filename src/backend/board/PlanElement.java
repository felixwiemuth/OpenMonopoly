/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.board;

/**
 * 'Field' encapsulated to be used in the game board.
 * 'PlanElementBlock's are built of this type.
 * //TODO create immutable Field type
 * //TODO make THIS immutable. PlanElemenetBlock COPIES objects of this type,
 * //       then Board copies those from those blocks again... (mind references!)
 *          in the borad there have to be complete free and only twice referenced
 *          objects (referenced by previous and next element)
 * @author Felix Wiemuth
 */
public class PlanElement {
    private Field field; //reference to field type
    private PlanElement prev; //field coming before this in gaming direction
    private PlanElement next; //field coming after this in gaming direction
    
    public PlanElement(Field field) {
        this.field = field;
    }
    
    /**
     * Copy constructor.
     * @param x 
     */
    public PlanElement(PlanElement x) {
        field = x.field;
        prev = x.prev;
        next = x.next;
    }
    
    /**
     * Get respective 'Field'
     * @return 
     */
    public Field field() {
        return field;
    }
    
    public PlanElement append(Field x) {
        PlanElement p = new PlanElement(x);
        append(p);
        return p;
    }
    
    public void append(PlanElement x) {
        x.setPrev(this);
        setNext(x);
    }
    
    public PlanElement prev() { return prev; }
    public PlanElement next() { return next; }
    
    /**
     * Set previous 'PlanElement' if not already set
     * @param x
     * @return 
     */
    public boolean setPrev(PlanElement x) {
        if (prev != null)
            return false;
        prev = x;
        return true;
    }
    
    /**
     * Set next 'PlanElement' if not already set
     * @param x
     * @return 
     */
    public boolean setNext(PlanElement x) {
        if (next != null)
            return false;
        next = x;
        return true;
    }
    
//    /**
//     * Sets 'dest' to 'src' if 'dest' is not set
//     * @param dest
//     * @param src
//     * @return 'true' if success
//     */
//    private boolean set(PlanElement dest, PlanElement src) {
//        if (dest != null)
//            return false;
//        dest = src;
//        return true;
//    }  
}
