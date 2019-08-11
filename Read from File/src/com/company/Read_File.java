package com.company;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class Read_File {

    public void Read (){
        try {
            String expected_value = "Hello There";
            String file = "D:\\File.txt";

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            reader.close();
            System.out.println(currentLine);

            assertEquals(expected_value, currentLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    }

