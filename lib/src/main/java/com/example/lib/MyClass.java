package com.example.lib;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class MyClass {
    public static void main(String[] args) {
        studentGrade studentGrade = new studentGrade();
        int i=0;
        try {
            File file = new File("couse.txt");
            FileInputStream readIn = new FileInputStream(file);
            InputStreamReader read = new InputStreamReader(readIn, "UTF-8" );
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine = null;
            while ((oneLine = bufferedReader.readLine()) != null) {
                System.out.println(oneLine);
                studentGrade.getStudentData(i,oneLine);
                i++;
            }
            read.close();
        }
        catch (Exception e) {
            System.out.println("錯誤，請再試一次");
            e.printStackTrace();
        }
        studentGrade.PrintAllData();
    }
}