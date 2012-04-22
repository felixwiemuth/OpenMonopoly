/**
 * ****************************************************
 * Copyright (C) 2012 Felix Wiemuth * Licensed under the GNU GENERAL PUBLIC
 * LICENSE * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 *****************************************************
 */

package backend.board;

import backend.core.Player;
import java.util.ArrayList;

/**
 * An ActionField is a Monopoly field that cannot by owned but different kinds
 * of actions may be executed on passing or landing. E.g. "START" or
 * "go to jail" fields.
 * @author Felix Wiemuth
 */
public class ActionField extends Field {
    public interface EventHandler {
        public void onLand(Player player);
        public void onPass(Player player);
    }
    
    private ArrayList<EventHandler> handlers;
    
    public ActionField(String name) {
        super(name);
    }

    @Override
    public void onLand(Player player) {
        for (EventHandler h : handlers) {
            h.onLand(player);
        }
    }

    @Override
    public void onPass(Player player) {
        for (EventHandler h : handlers) {
            h.onPass(player);
        }
    }
}
