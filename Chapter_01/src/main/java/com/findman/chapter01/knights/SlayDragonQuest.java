package com.findman.chapter01.knights;

/**
 * SlayDragonQuest 杀龙任务
 *
 * @author:findman@gmail.com
 * @create: 2019-01-20 23:15
 * @version: 1.0
 **/

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{

  private PrintStream stream;

  /**
   * 构造函数
   * @param stream 打印流
   */
  public SlayDragonQuest(PrintStream stream) {
    this.stream = stream;
  }

  /**
   * 执行任务
   */
  @Override
  public void embark() {
    stream.println("Embarking on quest to slay the dragon!");
  }
}
