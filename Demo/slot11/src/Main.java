/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Main {
    public static void main (String[] agrs) {
        String [] a = {"hoa","la","canh","cay","goc","re"};
        int [] b = {22,24,25,25};
        double [] c = {500,600,700};
        MyList u = new MyList();
        u.addMany (a,b,c);
        u.display();
        System.out.println();
    }
}

