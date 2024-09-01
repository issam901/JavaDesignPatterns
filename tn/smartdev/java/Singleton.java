package tn.smartdev.java;

public class Singleton{

  // private field that refers to the object
  private static volatile Singleton singleObject;
                                              
  private Singleton() {
     // constructor of the SingletonExample class
  }

  public static Singleton getInstance() {
     /*
      write code that allows us to create only one object
      access the object as per our need
     */
      if(singleObject==null) singleObject = new Singleton();
     return singleObject;
  }


}