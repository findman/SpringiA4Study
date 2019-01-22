package com.findman.chapter02.soundsystem;

import static junit.framework.TestCase.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CDPlayerTest CD播放测试
 *
 * @author:findman@gmail.com
 * @create: 2019-01-23 02:22
 * @version: 1.0
 * @description: 这里采用了Springboot的测试方式，SpringBoot会自动扫描下级包中的bean，并进行自动装配
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CDPlayerTest {

  @Autowired
  private CompactDisc cd;

  @Test
  public void cdShouldNotBeNull() {
    assertNotNull(cd);
  }
}
