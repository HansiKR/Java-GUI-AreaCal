/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui3;

/**
 *
 * @author Sachith Samaraweera
 */
public class Circle implements IShape{
    float r;
    final float PI=3.14f;
    float area;
    @Override
    public float calcArea(){
        area=PI*(r*r);
        return area;
    }
    
}
