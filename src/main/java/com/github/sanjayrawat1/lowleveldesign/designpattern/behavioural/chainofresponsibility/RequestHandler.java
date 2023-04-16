package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.chainofresponsibility;

/**
 * A request handler.
 *
 * @author Sanjay Singh Rawat
 */
public interface RequestHandler {
    boolean canHandleRequest(Request request);

    int getPriority();

    void handle(Request request);

    String name();
}
