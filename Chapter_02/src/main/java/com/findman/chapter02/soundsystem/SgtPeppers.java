package com.findman.chapter02.soundsystem;

import org.springframework.stereotype.Component;

/**
 * SgtPeppers Sgt Peppers CD
 *
 * @author:findman@gmail.com
 * @create: 2019-01-23 02:17
 * @version: 1.0
 **/
@Component
public class SgtPeppers implements CompactDisc {
  private String title = "Sgt. Pepper's Lonely Hearts Club Band";
  private String artist = "The Beatles";

  /**
   * 播放CD
   */
  @Override
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
}
