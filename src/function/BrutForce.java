package function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class BrutForce {
    public static void brutForce(BufferedReader bufferedReader, BufferedWriter bufferedWriter, int key, char[] charABC) throws IOException{
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
            bufferedWriter.write(lineFromText);
            bufferedWriter.write("\n");
        }

    }

    public static boolean searchWords(int key, BufferedReader bufferedReader) throws IOException {
        String line;
        int countWords = 0;
        boolean result = false;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains(" of ") || line.contains(" and ") || line.contains(" or ") || line.contains(" to ")
                    || line.contains(" що ") || line.contains(" в ") || line.contains(" і ") || line.contains(" на ")){
                countWords++;
                //System.out.println(countWords);
                if (countWords > 10) {
                   // System.out.println(FILE_BRUT_DECIPHER + key);
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
