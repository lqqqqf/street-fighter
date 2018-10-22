/*
 * Copyright (c) lqqqqf.github.io
 */

package io.github.lqqqqf.streetfighter;

public interface Fighter {

    /**
     * 连续的用拳击打，速度快，伤害小
     */
    Action beat();

    /**
     * 用拳重击，速度慢，伤害大
     */
    Action hit();

    /**
     * 连续的用腿踢，速度快，伤害小
     */
    Action kick();

    /**
     * 用脚踹,速度慢，伤害大
     */
    Action trample();

    /**
     * 防御
     * @return
     */
    Action defense();

    void damage(long damage);

    /**
     * 必杀技
     * @return
     */
    Action kill();

    long getEnergy();

}
