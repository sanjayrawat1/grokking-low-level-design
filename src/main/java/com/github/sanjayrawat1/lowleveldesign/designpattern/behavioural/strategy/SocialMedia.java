package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.strategy;

/**
 * Social media context.
 *
 * @author Sanjay Singh Rawat
 */
public class SocialMedia {

    private SocialMediaStrategy socialMediaStrategy;

    public SocialMedia(SocialMediaStrategy socialMediaStrategy) {
        this.socialMediaStrategy = socialMediaStrategy;
    }

    public void changeStrategy(SocialMediaStrategy socialMediaStrategy) {
        this.socialMediaStrategy = socialMediaStrategy;
    }

    public void connect(String name) {
        socialMediaStrategy.connectTo(name);
    }
}
