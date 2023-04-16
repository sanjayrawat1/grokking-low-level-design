package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * The decorator pattern.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("A simple looking troll approaches");
        var troll1 = new SimpleTroll();
        troll1.attack();
        log.info("Simple troll power : {}", troll1.attackPower());

        log.info("A troll with huge club surprises you.");
        var clubbedTroll = new ClubbedTroll(troll1);
        clubbedTroll.attack();
        log.info("Clubbed troll power : {}", clubbedTroll.attackPower());
    }
}
