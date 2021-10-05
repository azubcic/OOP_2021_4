package A_Z_zad_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AppTest {
    public static void main(String[] args) {
        Department dp1 = new Department("IT Security");
        Department dp2 = new Department("Markteing");
        ArrayList<Employee> arrD1 = employees2Dep(3);
        ArrayList<Employee> arrD2 = employees2Dep(5);
        HashMap<Department, ArrayList<Employee>> allDepartments = new HashMap<>();
        allDepartments.put(dp2, arrD2);
        allDepartments.put(dp1, arrD1);
        listALL(allDepartments);


    }

    private static ArrayList<Employee> employees2Dep(int num) {
        ArrayList<Employee> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String name = "Emp-"+ i;
            arr.add(new Employee(name));
        }
        return arr;
    }

    private static void listALL(HashMap<Department, ArrayList<Employee>> allDepartments) {
        System.out.println("=====================================================");
             allDepartments.forEach((dp, arr) -> {
                 System.out.println(dp.toString());
                 for (Employee emp: arr) {
                     System.out.println(emp.toString());
                 }
                 System.out.println("=====================================================");
             });
    }
}
