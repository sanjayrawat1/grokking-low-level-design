package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.composite;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * A sales department.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
@RequiredArgsConstructor
public class SalesDepartment extends Department {

    private final int id;

    private final String name;

    @Override
    public void printName() {
        log.info("{} Department", name);
    }
}
