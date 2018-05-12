package com.dharma.spring.draw;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("PointA is (" + pointA.getX() + ", " + pointA.getY() + ")");
        System.out.println("PointB is (" + pointB.getX() + ", " + pointB.getY() + ")");
        System.out.println("PointC is (" + pointC.getX() + ", " + pointC.getY() + ")");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean init method is called for Triangle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method is called for Triangle");
    }

    public void myInit() {
        System.out.println("My init method is called for Triangle");
    }

    public void cleanUp() {
        System.out.println("CleanUp method is called for Triangle");
    }
}