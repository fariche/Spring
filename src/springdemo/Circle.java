/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

/**
 *
 * @author fja2
 */
@Controller // Defines Circle class to be a Spring Bean
public class Circle implements Shape, ApplicationEventPublisherAware {

    private Point center;
    @Autowired
    private MessageSource messgeSource;
    private ApplicationEventPublisher publisher;

    @Override
    public void draw() {
        System.out.println(this.messgeSource.getMessage("drawing.circle", null, "Default Circle", null));
        System.out.println(this.messgeSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Point Messge", null));
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
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

    /**
     * @param messgeSource the messgeSource to set
     */
    public void setMessgeSource(MessageSource messgeSource) {
        this.messgeSource = messgeSource;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
    
    
}
