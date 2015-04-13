package com.xiaolu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by xiaolu on 4/12/15.
 */
public class DataParser {

    private HashMap<String, TvShow> dictionary;

    public DataParser() {
        this.dictionary = new HashMap<String, TvShow>();
    }

    public void readFile(Scanner data) {
        while (data.hasNext()) {
            String currentLine = data.nextLine();
            TvShow show = null;
            if (currentLine.contains("~")) {
                String[] showInfoArray = currentLine.split("~");
                show = new TvShow(showInfoArray[0], showInfoArray[1],
                        convertShowTimeToElipsedMunitesOfDay(showInfoArray[2]),
                        convertShowTimeToElipsedMunitesOfDay(showInfoArray[3]),
                        showInfoArray[4], Float.parseFloat(showInfoArray[5]));
                String nextLine = data.nextLine();
                show.setDescription(nextLine);
                dictionary.put(show.getNameOfShow(), show);
            }
        }
    }

    static int convertShowTimeToElipsedMunitesOfDay(String showTime) throws NullPointerException {
        if (showTime == null) {
            throw new NullPointerException("No show time info");
        }

        String[] timeArray = showTime.split(":");
        int hour = Integer.parseInt(timeArray[0]);
        int minute = Integer.parseInt(timeArray[1]);

        return hour * 60 + minute;
    }

    public HashMap<String, TvShow> getDictionary() {
        return dictionary;
    }
}