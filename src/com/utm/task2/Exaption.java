package com.utm.task2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exaption extends Throwable{


    String[] exemplu =new String[4];


    List<String> str = Arrays.asList("AAAAA","bbbb","ccccc");



    public void aExemplu() {

        try {

            for (int i = 0; i < 5; i++) {
                exemplu[i] = "efrw";


            }
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();

        }finally {
            // gygygiu
        }

    }


    public void editList(){

        str.remove(1);
        str.add(0,"ggggg");
        str.set(str.size()-1,"sssssss");
//        str.sort(()->compare)// comparator;


    }
}
