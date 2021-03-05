package com.happycrh.pattern.observer.策略模式;

/**
 * @author chenrenhui
 * @version 0.0.1
 * @date 2021/3/5 10:41
 * @desc
 */
public class DisplayA implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("样子A");
    }
}
