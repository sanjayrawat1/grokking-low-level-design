package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.chainofresponsibility;

import java.util.Objects;

/**
 * A request.
 *
 * @author Sanjay Singh Rawat
 */
public class Request {

    private final RequestType requestType;

    private final String requestDescription;

    private boolean handled;

    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void markHandled() {
        this.handled = true;
    }

    public boolean isHandled() {
        return handled;
    }

    @Override
    public String toString() {
        return requestDescription;
    }
}
