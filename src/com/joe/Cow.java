package com.joe;

public class Cow implements Animals {
    String cowVoice;

    public String voice(){
        return this.cowVoice = "muu muu";
    }
}
