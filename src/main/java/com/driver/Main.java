package com.driver;

public class Main {
    // Task 1: Create class Product inside Main
    public static class Product {
        // Task 3: Method with 2 int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with 3 int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with 2 double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main
        Product p = new Product();

        // Calling all overloaded methods
        System.out.println(p.product(2, 3));
        System.out.println(p.product(2, 3, 4));
        System.out.println(p.product(2.5, 4.0));
    }
}