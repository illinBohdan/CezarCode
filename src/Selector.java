import function.*;


import java.io.*;
import java.util.Scanner;

import static text.StringFinal.*;


public class Selector {
    public static void start(int mode) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char[] charABC = alphabet.toCharArray();
        if (mode == 1) {
            getInfo(FILE_FOR_ENCRYPT, ENTER_KEY_ENC, "c:\\test\\file_ENCRYPTED.txt", mode );
        } else if (mode == 2) {
            getInfo(FILE_FOR_DECIPHER, ENTER_KEY_DEC, "c:\\test\\file_DECKRYPTED.txt", mode);
        } else if (mode == 3) {
            System.out.println(FILE_FOR_BRUT_FORCE);
            String route = scanner.nextLine();
            String text = "c:\\test\\file_BRUT_FORCED.txt";
            for (int key = 0; key < charABC.length; key++) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(route));
                     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(text))) {
                    BrutForce.brutForce(bufferedReader, bufferedWriter, key, charABC);
                }
                if (BrutForce.searchWords(key, new BufferedReader(new FileReader("c:\\test\\file_BRUT_FORCED.txt")))) {
                    String line;
                    BufferedReader buf = new BufferedReader(new FileReader("c:\\test\\file_BRUT_FORCED.txt"));
                    while ((line = buf.readLine()) != null) {
                        System.out.println(line);
                    }
                    System.out.println();
                    System.out.println(FILE_BRUT_SAVED + FILE_BRUT_DECIPHER + key);
                    System.out.println();
                    buf.close();
                    break;
                }
            }
        }else if (mode == 4){
            char[] dictonaryLeters = new char[26];
            char[] encryptedLeters = new char[26];
            StatistickAnalize.countDictonary("c:\\test\\2\\dictonary.txt", dictonaryLeters);
            System.out.println();
            StatistickAnalize.countDictonary("c:\\test\\2\\file_ENCRYPTED.txt", encryptedLeters);

            DeciferStatistik.decipherStatistik(dictonaryLeters,encryptedLeters);
        }
    }

    public static void getInfo(String firstText, String keyText, String secondText, int mode) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char[] charABC = alphabet.toCharArray();
        System.out.println(firstText);
        String route = scanner.nextLine();
        System.out.println(keyText);
        int key = scanner.nextInt();
        String text = secondText;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(route));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(text))) {
            if (mode == 1) {
                ToEncryptFile.toEncrypt(bufferedReader, bufferedWriter, key, charABC);
            }
            if (mode == 2) {
                DecipherFile.decipherFile(bufferedReader, bufferedWriter, key, charABC);
            }
        }
    }
}
