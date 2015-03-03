/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 *
 * @author fja2
 */
@Controller // Defines Circle class to be a Spring Bean
public class Circle implements Shape {

    private Point center;

    @Override
    public void draw() {
        System.out.println("Circle Point is: (" + center.getX() + ", " + center.getY() + ")");
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
    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }
    @PostConstruct
    public void initializeCircle(){
        System.out.println("Init of Circle");
    }
    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroy Circle");
    }
    
    
}
