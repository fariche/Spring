/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author fja2
 */
public class DrawingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Triangle triangle = new Triangle();

        //XML Bean reads an xml file
       // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        
        //Application Context does everything BeanFactory does plus more
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Triangle triangle = (Triangle) context.getBean("triangle");
        //Circle circle = (Circle) context.getBean("circle");
        //triangle.draw();
        //circle.draw();
        
        Shape shape = (Shape) context.getBean("triangle");
        shape.draw();
    }

}
