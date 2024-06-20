package function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class StatistickAnalize {


    public static void countDictonary(String route, char[] charLeters) throws IOException {
        //String text = "c:\\test\\2\\dictonary.txt";
        int count = 0;
        HashMap<Character, Integer> ABC = new HashMap<>();
        ABC.put('a', 0);
        ABC.put('b', 0);
        ABC.put('c', 0);
        ABC.put('d', 0);
        ABC.put('e', 0);
        ABC.put('f', 0);
        ABC.put('g', 0);
        ABC.put('h', 0);
        ABC.put('i', 0);
        ABC.put('j', 0);
        ABC.put('k', 0);
        ABC.put('l', 0);
        ABC.put('m', 0);
        ABC.put('n', 0);
        ABC.put('o', 0);
        ABC.put('p', 0);
        ABC.put('q', 0);
        ABC.put('r', 0);
        ABC.put('s', 0);
        ABC.put('t', 0);
        ABC.put('u', 0);
        ABC.put('v', 0);
        ABC.put('w', 0);
        ABC.put('x', 0);
        ABC.put('y', 0);
        ABC.put('z', 0);

        int[] leters = new int[ABC.size()];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(route));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(text));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            char[] charLine = line.toCharArray();


            for (int i = 0; i < charLine.length; i++) {
                for (char key : ABC.keySet()) {
                    if (charLine[i] == key) {
                        Integer value = ABC.get(key);
                        ABC.put(key, value + 1);
                        count++;
                    }
                }
            }
        }

        for (int i = 0; i < leters.length; ) {
            for (char key : ABC.keySet()) {
                int value = ABC.get(key);
                // System.out.println(key + "--->" + value);
                leters[i] = value;
                i++;
            }
        }

        Arrays.sort(leters);
        System.out.println(Arrays.toString(leters));

        for (int i = leters.length - 1; i > 0; ) {
            for (char key : ABC.keySet()) {
                if (leters[i] == ABC.get(key)) {

                    charLeters[i] = key;

                    i--;
                }
                if (i == -1)
                    break;
            }
        }

        System.out.println(Arrays.toString(charLeters));
    }


}

