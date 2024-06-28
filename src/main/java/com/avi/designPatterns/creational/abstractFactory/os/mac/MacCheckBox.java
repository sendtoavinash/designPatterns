package com.avi.designPatterns.creational.abstractFactory.os.mac;

import demo.component.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
