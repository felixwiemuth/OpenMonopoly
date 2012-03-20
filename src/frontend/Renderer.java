/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package frontend;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Interface for all types of renderers (2D, 3D).
 * OpenMonopoly uses the selected renderer over this interface.
 * @author Felix Wiemuth
 */
public abstract class Renderer {
    private ConcurrentLinkedQueue<String> animationPening;
    
    public enum Animation {
        MOVE_PLAYER_FORWARDS,
        MOVE_PLAYER_BACKWARDS;
    }
    
    //TODO different types of data must be passed to animate...
    public abstract void animate(Animation a);

}
