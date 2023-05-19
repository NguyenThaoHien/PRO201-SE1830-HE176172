
import java.util.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class bai1 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++) {
            a[i] = sc.nextInt();  
        }
        //1
        int max = a[0];
        if (max < a[1]) max=a[1];
        if (max < a[2]) max=a[2];
        System.out.println(max);
}
}