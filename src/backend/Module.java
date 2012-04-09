/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend;

/**
 * The OpenMonopoly "backend.core classes" do as less as possible and only
 * the very basic routines of the game. Every other action can be defined
 * by 'Module's what makes the game highly extendable and configurable.
 * The games main routine calls the methods of every module activated at
 * every moment a 'Module'-action (the methods that are defined by the
 * interface) is due.
 * @author Felix Wiemuth
 */
public abstract class Module {
    protected GameStatus status;
    
    public Module(GameStatus status) {
        this.status = status;
    }
    
    //DEBUG
    public void mlog(String moduleType, String msg) {
        System.out.println("MODULE " + moduleType + ":Main " + msg);
    }
}
