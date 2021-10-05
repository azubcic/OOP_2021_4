package A_Z_zad_2;

public class Department {
    private String department;
    private static int cnt = 100;
    private int id;

    public Department(String department) {
        this.department = department;
        id = cnt;
        cnt++;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department='" + department + '\'' +
                ", id=" + id +
                '}';
    }
}
