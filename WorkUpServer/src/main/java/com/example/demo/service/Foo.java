package com.example.demo.service;

public class Foo {
    private int id;

    public String capitalize (String targetStr){
            return targetStr.toUpperCase();
    }

    public int calc (int a, int b){
        return a/b;
    }

    public Foo() {}

    public Foo(int id) { this.id = id;}

    public int getId() {
        return id;
    }
}
