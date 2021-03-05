package com.happycrh.pattern.observer;

import java.util.Observable;

/**
 * @author chenrenhui
 * @version 0.0.1
 * @date 2020/7/20 20:15
 * @desc
 */
public class SubjectForSSQ extends Observable {

    private String msg;


    public String getMsg() {
        return msg;
    }


    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }

}
