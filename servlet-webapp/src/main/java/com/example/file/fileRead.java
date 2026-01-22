package com.example.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class fileRead {
    public static String readFile(String filename) {
        try {
            String path = System.getProperty("java.io.tmpdir") + "/" + filename + ".txt";
            FileReader fr = new FileReader(path);
            BufferedReader buff = new BufferedReader(fr);
            String data = "";
            String line;
            while ((line = buff.readLine()) != null) {
                data += line;
            }
            fr.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }
}
