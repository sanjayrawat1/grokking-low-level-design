package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.chainofresponsibility;

/**
 * The chain of responsibility pattern.
 *
 * @author Sanjay Singh Rawat
 */
public class App {

    public static void main(String[] args) {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
