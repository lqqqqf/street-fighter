/*
 * Copyright (c) lqqqqf.github.io
 */

package io.github.lqqqqf.streetfighter.fighters;

import io.github.lqqqqf.streetfighter.Action;
import io.github.lqqqqf.streetfighter.Fighter;
import io.github.lqqqqf.streetfighter.Player;

public class Ken implements Fighter {

    private long energy;
    private Player player;

    public Ken(Player player) {
        this.player = player;
        this.energy = 100l;
    }

    @Override
    public Action beat() {
        final long beat = 1l;
        final long playBeat = player.getSkill(this.getClass().getName(), "beat");
        return new Action(this, beat + playBeat);
    }

    @Override
    public Action hit() {
        final long hit = 2l;
        final long playHit = player.getSkill(this.getClass().getName(), "hit");
        return new Action(this, hit + playHit);
    }

    @Override
    public Action kick() {
        final long kick = 1l;
        final long playKick = player.getSkill(this.getClass().getName(), "kick");
        return new Action(this, kick + playKick);
    }

    @Override
    public Action trample() {
        final long trample = 1l;
        final long playTrample = player.getSkill(this.getClass().getName(), "trample");
        return new Action(this, trample + playTrample);
    }

    @Override
    public Action defense() {
        return new Action(this, 0);
    }

    @Override
    public void damage(long damage) {
        energy -= damage;
        if (energy <= 0) {
            System.exit(0);
        }
    }

    @Override
    public Action kill() {
        final long kill = 5l;
        final long playKill = player.getSkill(this.getClass().getName(), "kill");
        return new Action(this, kill + playKill);
    }

    public long getEnergy() {
        return energy;
    }
}
