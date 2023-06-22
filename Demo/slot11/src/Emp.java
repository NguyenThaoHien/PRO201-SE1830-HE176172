/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Emp {
    String name;
    int age;
    double income;
    Emp(){
        
    }
    Emp(String xName, int xAge, double xIncome){
        name = xName; age = xAge; income = xIncome;
    }
    public String toString(){
        String s = "("+name+","+age+","+income+")";
        return(s);
    }
}
