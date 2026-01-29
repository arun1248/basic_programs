package oops.staticprogram;

public class EmployeeRunner {

    public static void main(String[] args) {

        System.out.println(BoschEmployee.company);

        BoschEmployee nazrin = new BoschEmployee(43, 30000);
        BoschEmployee shifa = new BoschEmployee(44, 30000);

        System.out.println(nazrin.company);
//        nazrin.company = "Zoho";
        System.out.println("After static value change");
        BoschEmployee.company = "Infosys";
        System.out.println(shifa.company);

        BoschEmployee.team();

    }

}
