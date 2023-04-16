package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Java 8 Lambda Strategy.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class LambdaStrategy {

    public static void main(String[] args) {
        Strategy.FACEBOOK.connectTo("sanjay");
        Strategy.TWITTER.connectTo("sanjay");
        Strategy.LINKEDIN.connectTo("sanjay");
    }

    public enum Strategy implements SocialMediaStrategy {
        FACEBOOK(friendName -> log.info("Connecting with {} through Facebook.", friendName)),
        TWITTER(friendName -> log.info("Connecting with {} through Twitter.", friendName)),
        LINKEDIN(friendName -> log.info("Connecting with {} through LinkedIn.", friendName));

        private final SocialMediaStrategy socialMediaStrategy;

        Strategy(SocialMediaStrategy socialMediaStrategy) {
            this.socialMediaStrategy = socialMediaStrategy;
        }

        @Override
        public void connectTo(String friendName) {
            socialMediaStrategy.connectTo(friendName);
        }
    }
}
