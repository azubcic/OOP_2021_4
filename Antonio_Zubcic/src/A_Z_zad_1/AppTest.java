package A_Z_zad_1;

import java.io.File;
import java.util.ArrayList;

public class AppTest {

    public static void main(String[] args) {
        File csvFile = new File("D:\\IntelliJ\\Antonio_Zubcic\\prodaja_1_snd.csv");
        ArrayList<String> rowArr = ProcessData_CLS.readData4CSV(csvFile);
        ProcessData_CLS.calculateAllData(rowArr);
    }
}
