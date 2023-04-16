package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Strategy to connect to LinkedIn.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class LinkedInStrategy implements SocialMediaStrategy {

    @Override
    public void connectTo(String friendName) {
        log.info("Connecting with {} through LinkedIn.", friendName);
    }
}
