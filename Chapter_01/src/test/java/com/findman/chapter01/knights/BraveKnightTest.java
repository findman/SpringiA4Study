package com.findman.chapter01.knights;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * BraveKnightTest BraveKnight测试类
 *
 * @author:findman@gmail.com
 * @create: 2019-01-20 20:12
 * @version: 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BraveKnightTest {

  /**
   * 测试注入接口调用
   */
  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest mockQuest = mock(Quest.class);
    BraveKnight braveKnight = new BraveKnight(mockQuest);
    braveKnight.embarkOnQuest();
    verify(mockQuest, times(1)).embark();
  }
}
