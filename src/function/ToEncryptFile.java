package function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import static text.StringFinal.*;

public class ToEncryptFile {
    public static void toEncrypt(BufferedReader bufferedReader, BufferedWriter bufferedWriter, int key, char[] charABC) throws IOException {
        String str;

        while ((str = bufferedReader.readLine()) != null) {

            char[] lineFromText = str.toCharArray();
            for (int i = 0; i < lineFromText.length; i++) {
                for (int j = 0; j < charABC.length; j++) {
                    if (lineFromText[i] == charABC[j]) {
                        if ((j + key) > charABC.length) {
                            j = (charABC.length-1) % j;
                            lineFromText[i] = charABC[key - j];
                            break;
                        }
                        lineFromText[i] = charABC[j + key];
                        break;
                    }
                }
            }

            System.out.println(lineFromText);
            bufferedWriter.write(lineFromText);
            bufferedWriter.write("\n");

        }
        System.out.println();
        System.out.println(FILE_ENC_SAVED);
        System.out.println();
    }
}
