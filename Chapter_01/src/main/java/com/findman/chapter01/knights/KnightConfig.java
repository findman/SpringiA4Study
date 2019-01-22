package com.findman.chapter01.knights;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * KnightConfig 骑士Bean配置
 *
 * @author:findman@gmail.com
 * @create: 2019-01-20 23:21
 * @version: 1.0
 **/
@SpringBootConfiguration
public class KnightConfig {

  /**
   * 配置骑士Bean
   * @return 骑士Bean
   */
  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }

  /**
   * 配置杀龙Bean
   * @return 返回探索任务
   */
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }
}
