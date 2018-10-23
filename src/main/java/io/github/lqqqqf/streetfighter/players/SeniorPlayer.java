/*
 * Copyright (c) lqqqqf.github.io
 */

package io.github.lqqqqf.streetfighter.players;

import io.github.lqqqqf.streetfighter.Player;
import io.github.lqqqqf.streetfighter.SkillMastery;
import io.github.lqqqqf.streetfighter.fighters.Ken;

import java.util.ArrayList;
import java.util.List;

public class SeniorPlayer extends Player {
    @Override
    protected List<SkillMastery> addSkill() {
        List<SkillMastery> list = new ArrayList<>();
        SkillMastery beatMastery = new SkillMastery(Ken.class.getName(), "beat", 2);
        list.add(beatMastery);
        SkillMastery hitMastery = new SkillMastery(Ken.class.getName(), "hit", 4);
        list.add(hitMastery);
        SkillMastery kickMastery = new SkillMastery(Ken.class.getName(), "kick", 3);
        list.add(kickMastery);
        SkillMastery trampleMastery = new SkillMastery(Ken.class.getName(), "trample", 3);
        list.add(trampleMastery);
        SkillMastery killMastery = new SkillMastery(Ken.class.getName(), "kill", 5);
        list.add(killMastery);
        return list;
    }

}
