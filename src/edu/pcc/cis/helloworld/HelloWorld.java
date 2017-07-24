/*
Aljandal,Saud
 */


package edu.pcc.cis.helloworld;
import java.util.Date;


public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World. This is Saud Aljandal");
        System.out.println(new Date());

        //simple heads tails game. Operates by Math.random()
        if (Math.random() < 0.5)
            System.out.println("Heads!");
        else
            System.out.println("Tails!");


    }
}
