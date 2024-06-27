package com.avi.abstractFactory.uifactory;

import demo.component.Button;
import demo.component.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
