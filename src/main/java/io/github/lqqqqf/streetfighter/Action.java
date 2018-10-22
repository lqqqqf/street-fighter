/*
 * Copyright (c) lqqqqf.github.io
 */

package io.github.lqqqqf.streetfighter;

public class Action {

    private Fighter fighter;

    private long damage;

    public Action(Fighter fighter, long damage) {
        this.fighter = fighter;
        this.damage = damage;
    }

    public void damage(Action action) {
        if (this.getDamage() != 0&&action.getDamage() != 0) {
            long damage = this.getDamage() - action.getDamage();
            if (damage > 0) {
                action.getFighter().damage(damage);
            } else {
                this.fighter.damage(-damage);
            }
        }
    }

    public long getDamage() {
        return damage;
    }

    public Fighter getFighter() {
        return fighter;
    }

}