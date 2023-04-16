package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.strategy;

/**
 * A strategy.
 *
 * @author Sanjay Singh Rawat
 */
@FunctionalInterface
public interface SocialMediaStrategy {
    void connectTo(String friendName);
}
