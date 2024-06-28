package com.avi.designPatterns.creational.abstractFactory.os.win;

import demo.component.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
