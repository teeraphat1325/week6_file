/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ox_gui;

import java.io.Serializable;

/**
 *
 * @author teeraphat
 */
public class Friend implements Serializable {
    private String name;
    private int age;
    private String tel;

    public Friend(String name, int age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Friend{" + "name=" + name + ", age=" + age + ", tel=" + tel + '}';
    }
    
}
