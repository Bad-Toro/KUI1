package com.mobileappscompany.training.ui1;

/**
 * Created by ferna on 3/8/2017.
 */

public class Just {

    public static void main(String[] args) {
        int n = 21;
        int r = fibo(n);
        System.out.println("The " + n +
                "th. fibonacci is: " +
                r);

        String oS = "Have a nice day";
        String r1 = revStr("", oS);
        String r2 = revStr(" ", oS);
        System.out.println(r1);
        System.out.println(r2);


    }

    static int fibo(int n){
        int r;

        if (n < 3) return 1;
        r = fibo(n-1) + fibo(n-2);
        return r;
    }

    static String revStr(String separator, String oStr){
        StringBuilder sb = new StringBuilder();
        String[] a = oStr.split(separator);

        for(int i = a.length -1; i>=0; i--){
            sb.append(a[i] + separator);
        }
        return sb.toString();
    }

}
//    fernando.toro@mobileappscompany.com