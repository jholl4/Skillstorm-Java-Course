package com.skillstorm.test;

class Fridge implements AutoCloseable {

   public Fridge() {
      System.out.println("Opening the fridge");
   }

   @Override
   public void close() throws Exception {
      System.out.println("Closing the fridge");
      throw new Exception("Fridge malfunction: Food may spoil!");
   }
}

class Freezer implements AutoCloseable {

   public Freezer() {
      System.out.println("Opening the freezer");
   }

   @Override
   public void close() throws Exception {
      System.out.println("Closing the freezer");
      throw new Exception("Freezer malfunction: Food may spoil!");
   }
}

class GroceryDisaster {
   public static void main(String[] args) {
      try (Fridge fridge = new Fridge();
            Freezer freezer = new Freezer()) {
         System.out.println("Stocking up the fridge and freezer");
      } catch (Exception e) {
         System.out.println(e.getMessage());
         System.out.println("Suppressed exceptions: " + e.getSuppressed().length);
      } finally {
         System.out.println("Cleaning up.");
      }
   }
}