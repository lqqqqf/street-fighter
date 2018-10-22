/*
 * Copyright (c) lqqqqf.github.io
 */

package io.github.lqqqqf.streetfighter.players;

import io.github.lqqqqf.streetfighter.Player;
import io.github.lqqqqf.streetfighter.SkillMastery;
import io.github.lqqqqf.streetfighter.fighters.Ryu;

import java.util.ArrayList;
import java.util.List;

public class Beginner extends Player {
    @Override
    protected List<SkillMastery> addSkill() {
        List<SkillMastery> list = new ArrayList<>();
        SkillMastery beatMastery = new SkillMastery(Ryu.class.getName(), "beat", 2);
        list.add(beatMastery);
        SkillMastery hitMastery = new SkillMastery(Ryu.class.getName(), "hit", 3);
        list.add(hitMastery);
        SkillMastery kickMastery = new SkillMastery(Ryu.class.getName(), "kick", 2);
        list.add(kickMastery);
        SkillMastery trampleMastery = new SkillMastery(Ryu.class.getName(), "trample", 3);
        list.add(trampleMastery);
        SkillMastery killMastery = new SkillMastery(Ryu.class.getName(), "kill", 4);
        list.add(killMastery);
        return list;
    }

}
