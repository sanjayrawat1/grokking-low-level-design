package com.github.sanjayrawat1.lowleveldesign.designpattern.behavioural.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Orc Soldier.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
public class OrcSoldier implements RequestHandler {

    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.COLLECT_TAX;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        log.info("{} handling request \"{}\"", name(), request);
    }

    @Override
    public String name() {
        return "Orc Soldier";
    }
}
