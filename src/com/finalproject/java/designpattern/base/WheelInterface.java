package com.finalproject.java.designpattern.base;

import com.designpatterns.visitor.VisitableInterface;
import com.designpatterns.visitor.WheelVisitorInterface;

public interface WheelInterface extends VisitableInterface {
    int getSize();
    boolean isWide();

    void acceptVisitor(WheelVisitorInterface visitor);
}
