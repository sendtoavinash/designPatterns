package com.avi.designPatterns.creational.abstractFactory.os.mac;

import demo.component.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
