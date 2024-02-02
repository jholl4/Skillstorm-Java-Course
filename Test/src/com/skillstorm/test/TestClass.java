package com.skillstorm.test;

interface Flyer {
}

class AirPlane implements Flyer {
}

public class TestClass {
   static void flyIt(Flyer f) {
      System.out.println("Flyer Flying");
   }

   static void flyIt(AirPlane a) {
      System.out.println("AirPlane Flying");
   }

   public static void main(String[] args) {
      Flyer f = new AirPlane();
      AirPlane a = new AirPlane();
      flyIt(f);
      flyIt(a);
   }
}