/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Rectangle {
    protected int length = 0, width = 0;
    public void setValue(int l)
    {length = l>0?1:0;}
    public void setValue(int l, int w)
    {length = l>0?l:0;
    width = w>0?w:0;
    }
    @Override
    public String toString()
    {return "["+length+","+width+"]";
    }
}
