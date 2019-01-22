package com.findman.chapter01.knights;

/**
 * BraveKnight Brave骑士
 *
 * @author:findman@gmail.com
 * @create: 2019-01-20 20:00
 * @version: 1.0
 **/
public class BraveKnight implements Knight{
  private Quest quest;

  /**
   * 构造函数
   * @param quest 探险行为
   */
  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  /**
   * 执行探险
   */
  @Override
  public void embarkOnQuest() {
    quest.embark();
  }
}
