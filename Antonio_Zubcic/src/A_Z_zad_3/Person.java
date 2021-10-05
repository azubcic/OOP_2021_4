package A_Z_zad_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Person implements Cognitive {
    private static int cnt = 0;
    private int id;
    private String name;
    private Set<Integer> set2Guess;
    private static final int LWR = 1;
    private static final int UPR = 50;


    public Person(String name) {
        this.name = name;
        id = cnt++;
    }

    @Override
    public int playGuess(Set<Integer> set) {
        Set<Integer> cl_set = new HashSet<>();
        int len = set.size();
        for (int i = 0; i < len; i++) {
            cl_set.add(new Random().nextInt(UPR - LWR) + LWR);
        }
        System.out.println("Set to compare: " + cl_set);
        System.out.println("User defined set:" + set);
        ArrayList<Integer> guessed = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (new ArrayList<>(cl_set).get(i) < new ArrayList<>(set).get(i)) {
                guessed.add(new ArrayList<>(set).get(i));
                temp++;
            }
        }
        System.out.println("Less then: " + guessed);
        System.out.println("Number of the same elements:" + temp);
        return temp;
    }

    @Override
    public void think(Set<Integer> set) {
        int maks = 0;
        for (int i = 0; i < set.size(); i++) {
            if (new ArrayList<>(set).get(i) > maks) {
                maks = new ArrayList<>(set).get(i);
            }
        }
        System.out.println("The max is: " + maks);
    }
}
