package com.utm.task2;

public  class  CheckName {


    public static boolean checkAny(String in, String chk) {
        //------------------------cauta o segventa consecutiva oriunde in cuvint
                                                        //    geoffrey chaucer
                                                        //    *   frey*

                            System.out.println("Procedura checkAny este in proces "+in+"  "+chk);

        int p1 = 0,p2=0;
        for (int i = 0; i <( in.length()-(chk.length()-2)); i++) {
//if(chk.charAt(p1)=='.'){ p1++; continue;}
            if (in.charAt(i) == chk.charAt(p1)) {
//                System.out.println(in.charAt(i)+" == "+chk.charAt(p1));
                p1++;
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