package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Strategy to connect to Facebook.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class FacebookStrategy implements SocialMediaStrategy {

    @Override
    public void connectTo(String friendName) {
        log.info("Connecting with {} through Facebook.", friendName);
    }
}
