package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * The Strategy pattern.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        SocialMedia context = new SocialMedia(new FacebookStrategy());
        context.connect("sanjay");

        context.changeStrategy(new TwitterStrategy());
        context.connect("sanjay");

        context.changeStrategy(new LinkedInStrategy());
        context.connect("sanjay");
    }
}
