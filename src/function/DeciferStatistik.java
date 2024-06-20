package function;

import java.io.*;

public class DeciferStatistik {
    public static void decipherStatistik(char[] dictonary, char[] encryptedChar) throws IOException {
        String str;
        try (
        BufferedReader bufferedReader = new BufferedReader(new FileReader("c:\\test\\2\\file_ENCRYPTED.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("c:\\test\\file_STATISTIK.txt"));
        ){
        while ((str = bufferedReader.readLine()) != null) {

            char[] lineFromText = str.toCharArray();
            for (int i = 0; i < lineFromText.length; i++) {
                for (int j = 0; j < encryptedChar.length; j++) {
                    if (lineFromText[i] == encryptedChar[j]) {

                        lineFromText[i] = dictonary[j];
                        break;
                    }
                }
            }
            System.out.println(lineFromText);
            bufferedWriter.write(lineFromText);
            bufferedWriter.write("\n");
        }
        }
    }
}
