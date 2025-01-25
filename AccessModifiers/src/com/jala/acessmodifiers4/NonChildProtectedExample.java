package com.jala.acessmodifiers4;

import com.jala.acessmodifiers3.*;
public class NonChildProtectedExample {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();

        // Compilation Error: Cannot access protected members outside the package
        // System.out.println(obj.protectedField);
        // obj.protectedMethod();
    }
}