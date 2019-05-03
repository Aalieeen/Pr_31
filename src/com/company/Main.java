package com.company;

public class Main {

    public static void main(String[] args) {


        int[] w1 = {1, 2, 5, 10, 20,
                       50, 100, 200};

        int[] w2 = new int[200 + 1];
        w2[0] = 1;

        for ( int w3 : w1 )
            for ( int i = w3; i <= 200; i ++ )
                w2[i] += w2[i - w3];
        System.out.println( w2 [200] );

    }
}




