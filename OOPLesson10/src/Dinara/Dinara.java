package Dinara;
import Aigerim.*;

import java.util.Scanner;

public class Dinara extends Aigerim {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int c = 111;

        boolean b = true;

        System.out.println("Password:" + a);
        if (a == c) {

            Dinara obj = new Dinara();
            obj.msg();
        } else System.out.println("False");




}
}



