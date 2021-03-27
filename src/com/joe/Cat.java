package com.joe;

public class Cat implements Animals{
    String catVoice;



    public String voice(){
        return this.catVoice = "miau miau";
    }
}
