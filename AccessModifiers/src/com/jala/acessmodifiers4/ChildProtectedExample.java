package com.jala.acessmodifiers4;

import com.jala.acessmodifiers3.*;
public class ChildProtectedExample extends ProtectedExample {
    public void accessProtectedMembers() {
        System.out.println("Protected Field in Subclass: " + protectedField);
        protectedMethod();
    }

    public static void main(String[] args) {
        ChildProtectedExample obj = new ChildProtectedExample();
        obj.accessProtectedMembers();
    }
}