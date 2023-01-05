package kr.springboot.pattern.composite;

public class CompositeApp {

    public static void main(String[] args) {

        Department salesDepartment = new SalesDepartment(1, "Sales");
        Department financialDepartment = new FinancialDepartment(2, "Financial");
        HeadDepartment headDepartment = new HeadDepartment(2, "Head");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();

    }

}
