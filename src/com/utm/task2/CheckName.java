package com.utm.task2;

public  class  CheckName {


    public static boolean checkAny(String in, String chk) {

        int p1 = 0,p2=0;

//        char a,b;
        for (int i = 0; i <( in.length()); i++) {
//            a=in.charAt(i);
//            b=chk.charAt(p1);
            if (in.charAt(i) == chk.charAt(p1)) {
                p1++;
                if(p1==chk.length()) return true;
                if(p1==chk.length()-1 && i==in.length()-1) return true;
                continue;
            } else {
                if(chk.charAt(p1)!='*'){
                    if (p1 == chk.length()) return true;

               if(p1>0&&p2==0) i--;
               if(p1>1&&p2==1) i--;
                    p1 = p2;
                }
                else {
                    if (p1 == 0&&p2==0) {
                        p2 = 1;
                        p1 = p2;
                    }
                    else {
                        if (p1 == chk.length()-1)return true;
                    }
                }
            }
            if (p1 == chk.length()) return true;

        }
        return false;
    }

    public static boolean checkDot(String in, String chk) {
//------------------------------------verifica expresia care include '.'

        int p1 = 0;
            for (int i = 0; i < chk.length(); i++) {

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