package com.utm.task2;

public  class  CheckName {


    public static boolean checkAny(String in, String chk) {
        //------------------------cauta o segventa consecutiva oriunde in cuvint
                                                        //       sam*
                                                        //    sansamuel
        int p1 = 0;
        for (int i = 0; i < in.length()-(chk.length()-1); i++) {

            if (in.charAt(i) == chk.charAt(p1)) {

                p1++;
                continue;
            } else {
                p1 = 0;

            }
            if (p1 == chk.length()) return true;

        }
        return false;
    }

    public static boolean checkDot(String in, String chk) {
//------------------------------------verifica expresia care include '.'

        int p1 = 0;
            for (int i = 0; i < chk.length(); i++) {

              //  if (chk.length() == p1){ return true; }
                if (chk.charAt(p1) == '.') {  // .vfn.knn.
                    p1++;
                    if (chk.length() == p1){ return true; }
                    continue;
                }
                if (in.charAt(i) == chk.charAt(p1)) {
                    p1++;
                    continue;
                } else return false;

        }
return false;
    }





}