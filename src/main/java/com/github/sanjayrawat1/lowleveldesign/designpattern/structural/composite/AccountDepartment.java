package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.composite;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * An account department.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
@RequiredArgsConstructor
public class AccountDepartment extends Department {

    private final int id;

    private final String name;

    @Override
    protected void printName() {
        log.info("{} Department", name);
    }
}
