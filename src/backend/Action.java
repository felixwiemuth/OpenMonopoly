/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend;

/**
 * This is the communication interface to the "backend.core" part.
 * Everything done in a 'Module' is based on 'Action's.
 * @author Felix Wiemuth
 */
public interface Action {
    public void run();

}
