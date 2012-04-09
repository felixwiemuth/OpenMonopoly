/******************************************************
 * Copyright (C) 2012 Felix Wiemuth                   *
 * Licensed under the GNU GENERAL PUBLIC LICENSE      *
 * See LICENSE or http://www.gnu.org/licenses/gpl.txt *
 ******************************************************/

package backend.core;

import static backend.util.functions.log;

/**
 * The 'Playlist' keeps track of which players are registered to the game
 * and whose turn it is.
 * @author Felix Wiemuth
 */
public class Playlist {

    private PlayerNode first; //first player
    private PlayerNode curr; //current player

    public class PlayerNode {

        private Player p;
        private PlayerNode prev;
        private PlayerNode next;

        public PlayerNode next() {
            return next;
        }

        public PlayerNode prev() {
            return prev;
        }

        public Player player() {
            return p;
        }

        public PlayerNode(Player p) {
            this.p = p;
        }

        public PlayerNode(Player p, PlayerNode prev, PlayerNode next) {
            this.p = p;
            this.prev = prev;
            this.next = next;
        }

        public void setPrev(PlayerNode prev) {
            this.prev = prev;
        }

        public void setNext(PlayerNode next) {
            this.next = next;
        }
    }

    public Playlist() {
    }

    public void add(Player p) {
        if (first == null) { //add first player
            first = new PlayerNode(p);
            first.setNext(first);
            first.setPrev(first);
        } else { //add player to other players (at least one)
            //insert player left to first player (= adding at the end)
            first.prev().setNext(new PlayerNode(p, first.prev(), first));
            first.setPrev(first.prev().next());
        }

    }

    /**
     * Get current player
     *
     * @return
     */
    public Player player() {
        return curr.player();
    }

    /**
     * Get current Player and set position to next player
     *
     * @return Current Player
     */
    public Player next() {
        Player ret = curr.player();
        curr = curr.next();
        return ret;
    }

    //DEBUG
    public void print() {
        if (first == null) {
            return;
        }
        PlayerNode p = first;
        do {
            log("Player: " + p.player().name());
            p = p.next();
        } while (p != first);
    }
}
