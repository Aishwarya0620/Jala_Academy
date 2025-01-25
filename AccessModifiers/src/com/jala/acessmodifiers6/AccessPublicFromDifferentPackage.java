package com.jala.acessmodifiers6;

import com.jala.acessmodifiers5.PublicExample;

public class AccessPublicFromDifferentPackage {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}