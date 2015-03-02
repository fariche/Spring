/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;


/**
 *
 * @author fja2
 */
public class Triangle implements Shape{

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw() {
        System.out.println("Drawing Trianvle");
             System.out.println("Point A = " + getPointA().getX() + ", " + getPointA().getY()
                + "\nPoint B = " + getPointB().getX() + ", " + getPointB().getY()
                + "\nPoint  = " + getPointC().getX() + ", " + getPointC().getY());
    }

 
}
