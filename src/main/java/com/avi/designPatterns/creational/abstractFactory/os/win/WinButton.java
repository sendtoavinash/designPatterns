package com.avi.designPatterns.creational.abstractFactory.os.win;

import demo.component.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
