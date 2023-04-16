package com.github.sanjayrawat1.lowleveldesign.designpattern.creational.builder;

import lombok.Getter;

/**
 * A Hero.
 *
 * @author Sanjay Singh Rawat
 */
@Getter
public class Hero {

    private final String name;

    private final Armor armor;

    private Hero(Builder builder) {
        this.name = builder.name;
        this.armor = builder.armor;
    }

    public static class Builder {

        private final String name;

        private Armor armor;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
