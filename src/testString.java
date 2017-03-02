import java.io.UnsupportedEncodingException;

/**
 * Created by i.lapshinov on 02.03.2017.
 */
public class testString {

    public static void main(String[] str) throws UnsupportedEncodingException {
        String str1 = "this is my new testing string";

        System.out.println(str1.length());
        System.out.println("charAt()  " +  str1.charAt(7));
        byte[] mas = str1.getBytes(); // озвращает массив байт
        System.out.println(mas);

        char[] kop = new char[7];

        str1.getChars(2, 9, kop,0); // копируем строку
        System.out.println(kop);

        char[] newMas = str1.toCharArray(); // создает массив символов из строки

        String eqStr = "this";
        System.out.println("equals    " + eqStr.equals(str1)); // Сравнение строки

        System.out.println("compareTO   "+eqStr.compareTo(str1));// Сравненеи

        System.out.print("contains   " + str1.contains(eqStr)); // содержит ли строка

        System.out.print("startWith   " + str1.startsWith(eqStr)); // начинается с

        System.out.print("startWith   " + str1.endsWith("ing")); // заканчивается

        System.out.print("swubString    " + str1.substring(3,5)); // возвращает подстроку

        System.out.print(" concat    " + str1.concat(eqStr)); // возвращает объединенные строки

        System.out.print("replace   " + str1.replace("i" , "I")); // замена

        System.out.print("егистр   " + str1.toUpperCase()); // регистр

        int prov = Integer.valueOf("123");
        System.out.print("ValueOf   " + prov); // преобразование типов

        


    }
}
