package A_Z_zad_3;

import java.util.HashSet;
import java.util.Set;

public class TestApp {

    public static void main(String[] args) {
        Person pers = new Person("Person-1");
        Robot rbt = new Robot("Robot-1");
        AI_Assitant ai = new AI_Assitant("AI-1");
        Set<Integer> intSet = new HashSet<>();
        intSet.add(23);
        intSet.add(44);
        intSet.add(1);
        intSet.add(33);
        intSet.add(15);
        intSet.add(49);
        intSet.add(10);

        System.out.println("------------------- Robot ---------------------");
        rbt.playGuess(intSet);
        rbt.think(intSet);
        System.out.println("------------------- AI Assist ---------------------");
        ai.playGuess(intSet);
        ai.think(intSet);
        System.out.println("------------------- Person ---------------------");
        pers.playGuess(intSet);
        pers.think(intSet);
    }


}
