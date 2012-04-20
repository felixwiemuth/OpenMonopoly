/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.moduleInterfaces;

import backend.core.GameStatus;

/**
 * The OpenMonopoly "backend.core classes" do as less as possible and only
 * the very basic routines of the game. Every other action can be defined
 * by 'Module's what makes the game highly extendable and configurable.
 * Every module should extend this class.
 * @author Felix Wiemuth
 */
public abstract class Module {
    protected GameStatus status;
    private boolean active; //'true': module is activated
    
    public Module(GameStatus status) {
        this.status = status;
    }
    
    //DEBUG
    public void mlog(String moduleType, String msg) {
        System.out.println("MODULE " + moduleType + ":Main " + msg);
    }
}
