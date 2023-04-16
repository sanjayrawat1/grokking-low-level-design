package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Orc Commander.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class OrcCommander implements RequestHandler {

    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.DEFEND_CASTLE;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        log.info("{} handling request \"{}\"", name(), request);
    }

    @Override
    public String name() {
        return "Orc commander";
    }
}
