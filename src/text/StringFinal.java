package text;

public class StringFinal {

    private static final String AlphabetEN = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String AlpabetUA = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюяАБВГҐДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЬЮЯ";
    private static final String symbol = "(*/\\$%&#@!(){}[],:;'\"<>|^~.)`—";
    public static final String alphabet = AlphabetEN + AlpabetUA + symbol;
    public static final String MODE = "Виберіть режим роботи: 1 - Шифрування; 2 - Розшифрування; 3 - Brut Force: 4 - Статистичний аналіз";
    public static final String FILE_FOR_ENCRYPT = "Веддіть шлях до файлу, текст якого Ви хочете зашифрувати:";
    public static final String ENTER_KEY_ENC = "Веддіть ключ (число) для шифрування тексту";
    public static final String ENTER_KEY_DEC = "Веддіть ключ (число) для розшифрування тексту";
    public static final String FILE_FOR_DECIPHER = "Веддіть шлях до файлу, текст якого Ви хочете розшифрувати:";
    public static final String FILE_FOR_BRUT_FORCE = "Веддіть шлях до файлу, текст якого Ви хочете розшифрувати за допомогою - BRUT FORCE:";
    public static final String FILE_BRUT_DECIPHER = " Ключ ---> ";

    public static final String FILE_ENC_SAVED = "Файл зашифровано та збережено за шляхом - c:\\test\\file_ENCRYPTED.txt";
    public static final String FILE_DEC_SAVED = "Файл розшифоровано та збережено за шляхом - c:\\test\\file_DECKRYPTED.txt";
    public static final String FILE_BRUT_SAVED = "Файл розшифоровано та збережено за шляхом - c:\\test\\file_BRUT_FORCED.txt";


}
