package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.composite;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * A Head Department.
 *
 * @author Sanjay Singh Rawat
 */
@Slf4j
@RequiredArgsConstructor
public class HeadDepartment extends Department {

    private final int id;

    private final String name;

    @Override
    public void printName() {
        log.info("{} Department", name);
        log.info("Below are the Sub Department of {} Department:", name);
        subDepartments.forEach(Department::printName);
    }
}
