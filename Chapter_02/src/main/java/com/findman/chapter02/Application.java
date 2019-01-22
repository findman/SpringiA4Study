package com.findman.chapter02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Application
 *
 * @author:findman@gmail.com
 * @create: 2019-01-23 02:00
 * @version: 1.0
 **/

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
  }
}
