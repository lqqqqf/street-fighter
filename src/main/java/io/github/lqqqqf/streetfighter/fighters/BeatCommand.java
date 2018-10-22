/*
 * Copyright (c) lqqqqf.github.io
 */

package io.github.lqqqqf.streetfighter.fighters;

import io.github.lqqqqf.streetfighter.Action;
import io.github.lqqqqf.streetfighter.Command;
import io.github.lqqqqf.streetfighter.Fighter;

public class BeatCommand implements Command {
    @Override
    public Action execute(Fighter fighter) {
        return fighter.beat();
    }
}
