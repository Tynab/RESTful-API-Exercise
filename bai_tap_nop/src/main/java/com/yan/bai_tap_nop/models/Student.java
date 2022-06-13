package com.yan.bai_tap_nop.models;

import lombok.*;

@Data
public class Student {
    // #region Fields
    private String name;
    private int age;
    // #endregion

    // #region Constructors
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // #endregion
}
