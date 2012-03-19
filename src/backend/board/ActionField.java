/**
 * ****************************************************
 * Copyright (C) 2012 Felix Wiemuth * Licensed under the GNU GENERAL PUBLIC
 * LICENSE * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 *****************************************************
 */

package backend.board;

/**
 *
 * @author Felix Wiemuth
 */
public class ActionField extends Field {
    
    public ActionField(String name) {
        super(name);
    }

    @Override
    public void onLand() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void onPass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
