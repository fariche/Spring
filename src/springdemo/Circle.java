/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author fja2
 */
public class Circle implements Shape {

    private Point center;
    
    @Override
    public void draw() {
        System.out.println("Circle Point is: ("+center.getX()+", "+center.getY()+")");
    }

    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    @Required
    public void setCenter(Point center) {
        this.center = center;
    }
    
    
}
