package A_Z_zad_4;

public class Actor extends Person{
    private static int cnt = 0;

    public Actor(String name) {
        this.name = name;
        this.id = cnt++;
    }

    @Override
    public void getInterview(String neki) {

    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
