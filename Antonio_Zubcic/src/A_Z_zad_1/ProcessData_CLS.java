package A_Z_zad_1;

import java.io.*;
import java.util.*;

public class ProcessData_CLS {

    public static ArrayList<String> readData4CSV(File csvFile) {
        String line = "";
        String splitBy = ",";
        ArrayList<String> row = new ArrayList<>();
        String[] tempArr;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                tempArr = line.split(splitBy);
                row.add(Arrays.toString(tempArr).replace("[", "").replace("]", ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return row;
    }


    public static void calculateAllData(ArrayList<String> rows) {
        System.out.println("All data from csv file has been loaded.\n");
        HashMap<String, Integer> storage = new HashMap<>();
        for (int i = 1; i < rows.size(); i++) {
            String[] tempRow = rows.get(i).split(", ");
            storage.putIfAbsent(tempRow[0], 0);
            storage.compute(tempRow[0], (k, v) -> v + Integer.parseInt(tempRow[1]) + Integer.parseInt(tempRow[2]) + Integer.parseInt(tempRow[3]));
        }
        for (String key : storage.keySet()) {
            System.out.println(key);
            System.out.println("Total for company " + key +  " : " + storage.get(key));
        }
    }
}

