package javasamples.sumofnums;

public class App {

    public static void main(String args[]){
        System.out.println("Hello World sum of nums");
        int n= 10;
        int res = sumofnums(n);
        System.out.println("sum of nums "+n +" result "+res);
      }

    public static int sumofnums(int n){
        n = n*(n+1)/2;
        return n;
    }


}
