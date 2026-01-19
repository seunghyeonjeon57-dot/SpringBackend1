package org.example.Head03_OOP.example30;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListToTextFileExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Pear");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            for(String item : items) {
                bw.write(item);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
