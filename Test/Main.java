package Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] dataList = { "x", "y", "z" };
        for (String dataElement : dataList) {
            int innerCounter = 0;
            while (innerCounter < dataList.length) {
                System.out.println(dataElement + ", " + innerCounter);
                innerCounter++;
            }
        }
    }

}
