package com.findman.chapter01;

/**
 * Application Chapter01 Demo
 *
 * @author:findman@gmail.com
 * @create: 2019-01-20 18:03
 * @version: 1.0
 **/

import com.findman.chapter01.knights.Knight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ApplicationContext app = SpringApplication.run(Application.class, args);
    Knight knight = app.getBean(Knight.class);
    knight.embarkOnQuest();
  }
}
