package com.xiaolu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static final String SHOW_FILE_NAME = "shows.txt";

    public static void main(String[] args) {
        Scanner data = null;

        try {
             data = new Scanner(new File(SHOW_FILE_NAME));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        DataParser parser = new DataParser();
        parser.readFile(data);

        HashMap<String, TvShow> showDictionary = parser.getDictionary();

        System.out.println("Finish show lookup service");
    }
}
