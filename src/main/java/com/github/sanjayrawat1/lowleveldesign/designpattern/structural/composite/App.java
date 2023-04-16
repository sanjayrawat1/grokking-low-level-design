package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.composite;

/**
 * The composite pattern.
 *
 * @author Sanjay Singh Rawat
 */
public class App {

    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(2, "Sales");
        Department financialDepartment = new FinancialDepartment(3, "Financial");
        Department accountDepartment = new AccountDepartment(4, "Account");

        financialDepartment.addDepartment(accountDepartment);

        Department headDepartment = new HeadDepartment(1, "Head");
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printName();
    }
}
