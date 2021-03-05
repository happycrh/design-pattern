package com.happycrh.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author chenrenhui
 * @version 0.0.1
 * @date 2020/7/20 20:12
 * @desc
 */
public class Observer1 implements Observer {


    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d) {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            System.out.println("subjectFor3d's msg -- >" + subjectFor3d.getMsg());
        }

        if (o instanceof SubjectForSSQ) {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
