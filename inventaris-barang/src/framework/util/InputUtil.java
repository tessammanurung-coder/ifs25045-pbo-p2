package framework.util;

import java.util.Scanner;

/**
 * Utility untuk membaca input string dari keyboard.
 * Berada di layer framework karena bergantung pada {@link System#in}.
 */
public class InputUtil {
    /** Scanner bersama untuk seluruh aplikasi (satu instance cukup). */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Menampilkan prompt dan membaca satu baris input dari user.
     *
     * @param info label yang ditampilkan sebelum input
     * @return teks yang diketik user
     */
    public static String input(String info) {
        System.out.print(info + " : ");
        // Input habis (mis. pada pengujian otomatis): hentikan program dengan tenang,
        // bukan melempar NoSuchElementException.
        if (!scanner.hasNextLine()) {
            System.out.flush();
            System.exit(0);
        }
        return scanner.nextLine();
    }
}