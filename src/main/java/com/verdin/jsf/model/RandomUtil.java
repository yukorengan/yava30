package com.verdin.jsf.model;


import java.time.LocalDate;
//import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;

public class RandomUtil {
    public static String getWord(int len) {
        String word = "";
        for (int i = 0; i < len; i++) {
            int v = 1 + (int) (Math.random() * 26);
            char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
            word += c;
        }
        return word;
    }


    public static int getInt(int start, int end) {
        return ThreadLocalRandom.current()
                                .nextInt(start, end);
    }

    public static LocalDate getDate(int startYear, int endYear) {
        int day = getInt(1, 28);
        int month = getInt(1, 12);
        int year = getInt(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    public static String getFullName() {
        int i = getInt(0, NAMES.length);
        int j = getInt(0, NAMES.length);

        return NAMES[i] + " " + NAMES[j];
    }


    public static <T> T getAnyOf(T... objects) {
        if (objects == null || objects.length == 0) {
            return null;
        }
        return objects[getInt(0, objects.length)];
    }

    private static final String[] NAMES = {"Muhammad", "Ahmad", "Santoso", "Arifin", "Dwi",
            "Putra", "Putri", "Dewa", "Eka", "Tri", "Budi", "Agus", "Siti", "Ros",
            "Utami", "Aulia", "Hadi", "Bayu", "Annisa", "Retno", "Fajar", "Wulandari", "Nurul",
            "Rini", "Ilham", "Kusuma", "Rizki", "Dinda", "Andre", "Ari", "Maria", "Wahyu", "Mila",
            "Lia", "Kartika", "Indra", "Arif", "Eko", "Kurniawan", "Sari", "Aji", "Sri", "Tyas",
            "Dian", "Lestari", "Maya", "Ika", "Indah", "Ade", "Nur"};
}