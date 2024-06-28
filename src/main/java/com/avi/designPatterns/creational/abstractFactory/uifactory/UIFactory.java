package com.avi.designPatterns.creational.abstractFactory.uifactory;

import demo.component.Button;
import demo.component.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
