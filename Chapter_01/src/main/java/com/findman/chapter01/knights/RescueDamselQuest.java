package com.findman.chapter01.knights;

import org.springframework.stereotype.Component;

/**
 * RescueDamselQuest 拯救少女
 *
 * @author:findman@gmail.com
 * @create: 2019-01-20 18:23
 * @version: 1.0
 **/
@Component
public class RescueDamselQuest implements Quest{

  /**
   * 拯救少女行动
   */
  @Override
  public void embark() {
    System.out.println("Embarking on a quest to rescue the damsel.");
  }
}
