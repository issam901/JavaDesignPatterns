package tn.smartdev.java;

public class designPattern {
    
    public static void main(String[] args) {
        //this code ensure that only instance will be created
        Singleton singleton=Singleton.getInstance();
    }
    public void MyMethod()
    {
        System.out.println("Singlton created");
    }
}
