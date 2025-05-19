package com.ssg.law_n_road_test;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends Application {
    int a;
    int b;
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}