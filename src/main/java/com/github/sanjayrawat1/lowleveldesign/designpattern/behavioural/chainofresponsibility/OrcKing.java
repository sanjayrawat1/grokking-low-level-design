package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.chainofresponsibility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Orc King.
 *
 * @author Sanjay Singh Rawat
 */
public class OrcKing {

    private List<RequestHandler> handlers;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        handlers = Arrays.asList(new OrcCommander(), new OrcOfficer(), new OrcSoldier());
    }

    public void makeRequest(Request request) {
        handlers
            .stream()
            .sorted(Comparator.comparing(RequestHandler::getPriority))
            .filter(handler -> handler.canHandleRequest(request))
            .findFirst()
            .ifPresent(handler -> handler.handle(request));
    }
}
