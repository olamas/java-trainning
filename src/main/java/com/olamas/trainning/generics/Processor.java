package com.olamas.trainning.generics;

public class Processor<T> {

    private T command;

    public T getCommand(){
        return command;
    }

    public void setCommand(T command){
        this.command = command;
    }
}
