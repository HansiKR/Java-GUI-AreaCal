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
public class Square implements IShape{
    float l;
    float area;
    @Override
    public float calcArea(){
        area=l*l;
        return area;
    }
    
}
