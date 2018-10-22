package io.github.lqqqqf.streetfighter;

import io.github.lqqqqf.streetfighter.fighters.BeatCommand;
import io.github.lqqqqf.streetfighter.fighters.HitCommand;
import io.github.lqqqqf.streetfighter.fighters.Ken;
import io.github.lqqqqf.streetfighter.fighters.Ryu;
import io.github.lqqqqf.streetfighter.players.Beginner;
import io.github.lqqqqf.streetfighter.players.SeniorPlayer;
import org.junit.Assert;
import org.junit.Test;

public class RoundTest {

    @Test
    public void fight() {
        Player senior = new SeniorPlayer();
        Player beginner = new Beginner();
        Fighter ryu = new Ryu(beginner);
        Fighter ken = new Ken(senior);

        new BeatCommand().execute(ken).damage(new HitCommand().execute(ryu));
        Assert.assertEquals(97l, ken.getEnergy());
        Assert.assertEquals(100l, ryu.getEnergy());
        new BeatCommand().execute(ryu).damage(new HitCommand().execute(ken));
        Assert.assertEquals(98l, ryu.getEnergy());
        Assert.assertEquals(97l, ken.getEnergy());
    }
}
