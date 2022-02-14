package com.company;

import java.io.File;

public class Z3 {

    public static void main(String[] args) {
    try{
        File x = new File("C:\\Users");
        String[] y = x.list((file, z) -> file.isDirectory());
        for(String i:y){
            System.out.println(i);
        }
    }
    catch(Exception a){
        a.printStackTrace();
    }
    }
}
