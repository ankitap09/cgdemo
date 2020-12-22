package com.capgemini.training.day3.core;
class GC{
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("In finalize() method");
    }    
        
}

 

public class GarbageCollection {
    public static void main(String[] args) {
        createObjects();
        //explicitly invoking garbage collector
        System.gc();
    }

 

    private static void createObjects() {
        GC obj1= new GC();
        GC obj2= new GC();
        obj1=obj2;        
    }

 

}