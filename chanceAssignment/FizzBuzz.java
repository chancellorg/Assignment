package com;

public class FizzBuzz {

    public static void main(String[] args) {

        int[] numbers = new int[101];

        for (int x =1; x < 101; ++x) {

            for (int y = 1; y < 101; ++y) {
                if (y > x) break;
                if (x % y == 0) numbers[x] += 1;
            }
        }


//    numbers[24] 1 2 3 4 6 8 12 24
        if (1==0)
            for(int ctr =1; ctr<=100; ++ctr) {

                String temp = "";

                if(ctr%3==0) temp += "Fizz";
                if(ctr%5==0) temp += "Buzz";

                if(numbers[ctr]==2) temp="Prime Number";


                if(temp.equals("")) temp += ctr;

                System.out.println(temp+"\t"+ctr+"\t"+numbers[ctr]);
            }


        int c = 10;
        int d = 5;

        c = c + d; // c = 15
        d = c - d; // d = 10
        c = c - d; // c = 5


        // d = ( c + d ) - (c = d) ;


        System.out.println(c + " " + d);

    }



}
