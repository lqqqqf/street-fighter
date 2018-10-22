/*
 * Copyright (c) lqqqqf.github.io
 */

package io.github.lqqqqf.streetfighter;

import java.util.List;

public abstract class Player {

    private List<SkillMastery> skillMasteries;

    protected Fighter fighter;

    public Player() {
        this.skillMasteries = addSkill();
    }

    protected abstract List<SkillMastery> addSkill();

    public int getSkill(String fighter, String skill) {
        final int mastery = 3;
        int result = skillMasteries.stream().filter(t -> t.getFighter().equals(fighter)&&t.getSkill().equals(skill)).map(SkillMastery::getMastery).findFirst().get();
        return result == 0?mastery:result;
    }

    void play(Command command) {
        command.execute(fighter);
    }

}
