package com.company;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Read_from_URL {
    private int CONNECTION_TIMEOUT;
    private int READ_TIMEOUT;
    private String FILE_URL;
    private String FILE;
    private String raw_weather_data;

    Read_from_URL(){
        CONNECTION_TIMEOUT = 1000;
        READ_TIMEOUT = 1000;
        FILE_URL="https://openweathermap.org/city/3337498";
        FILE="D:\\Pliczek";
        download_and_save_data();
        read_data_from_file();
    }

   // Read_from_URL(){}
    private String output_information;


    private void download_and_save_data(){
        try {
            FileUtils.copyURLToFile(
                    new URL(FILE_URL),
                    new File(FILE),
                    CONNECTION_TIMEOUT,
                    READ_TIMEOUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void read_data_from_file(){
        File file = new File(FILE);
        try {
            raw_weather_data = FileUtils.readFileToString(file);
            System.out.println(raw_weather_data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
