package function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import static text.StringFinal.*;


public class DecipherFile {
    public static void decipherFile(BufferedReader bufferedReader, BufferedWriter bufferedWriter, int key, char[] charABC) throws IOException {
        String str;

        while ((str = bufferedReader.readLine()) != null) {

            char[] lineFromText = str.toCharArray();
            for (int i = 0; i < lineFromText.length; i++) {
                for (int j = 0; j < charABC.length; j++) {
                    if (lineFromText[i] == charABC[j]) {
                        if (key > j) {
                            lineFromText[i] = charABC[(charABC.length - 1) - (key - j)];
                            break;
                        }
                        lineFromText[i] = charABC[j - key];
                        break;
                    }
                }
            }
            System.out.println(lineFromText);
            bufferedWriter.write(lineFromText);
            bufferedWriter.write("\n");

        }
        System.out.println();
        System.out.println(FILE_DEC_SAVED);
        System.out.println();
    }
}
