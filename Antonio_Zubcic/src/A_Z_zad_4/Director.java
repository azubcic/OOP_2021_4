package A_Z_zad_4;

public class Director extends Person{

    private static int cnt = 0;

    public Director(String name) {
        this.name = name;
        this.id = cnt++;
    }

    @Override
    public void getInterview(String neki) {

    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
