/*
 * Copyright (c) lqqqqf.github.io
 */

package io.github.lqqqqf.streetfighter;

public class SkillMastery {

    private String fighter;

    private String skill;

    private int mastery;

    public SkillMastery(String fighter, String skill, int mastery) {
        this.fighter = fighter;
        this.skill = skill;
        this.mastery = mastery;
    }

    public String getFighter() {
        return fighter;
    }

    public String getSkill() {
        return skill;
    }

    public int getMastery() {
        return mastery;
    }
}
