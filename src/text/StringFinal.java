package text;

public class StringFinal {

    private static final String AlphabetEN = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String AlpabetUA = "��������賿�����������������������å�Ū��Ȳ���������������������";
    private static final String symbol = "(*/\\$%&#@!(){}[],:;'\"<>|^~.)`�";
    public static final String alphabet = AlphabetEN + AlpabetUA + symbol;
    public static final String MODE = "������� ����� ������: 1 - ����������; 2 - �������������; 3 - Brut Force: 4 - ������������ �����";
    public static final String FILE_FOR_ENCRYPT = "������ ���� �� �����, ����� ����� �� ������ �����������:";
    public static final String ENTER_KEY_ENC = "������ ���� (�����) ��� ���������� ������";
    public static final String ENTER_KEY_DEC = "������ ���� (�����) ��� ������������� ������";
    public static final String FILE_FOR_DECIPHER = "������ ���� �� �����, ����� ����� �� ������ ������������:";
    public static final String FILE_FOR_BRUT_FORCE = "������ ���� �� �����, ����� ����� �� ������ ������������ �� ��������� - BRUT FORCE:";
    public static final String FILE_BRUT_DECIPHER = " ���� ---> ";

    public static final String FILE_ENC_SAVED = "���� ����������� �� ��������� �� ������ - c:\\test\\file_ENCRYPTED.txt";
    public static final String FILE_DEC_SAVED = "���� ������������� �� ��������� �� ������ - c:\\test\\file_DECKRYPTED.txt";
    public static final String FILE_BRUT_SAVED = "���� ������������� �� ��������� �� ������ - c:\\test\\file_BRUT_FORCED.txt";


}
