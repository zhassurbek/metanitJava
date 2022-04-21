package metanit.m3_oop.oopm4;

import javax.crypto.spec.OAEPParameterSpec;

public class Operation {

    static int sum(int x, int y) {
        return x + y;
    }

    static int substract(int x, int y){
        return x - y;
    }

    static int multiply(int x, int y){
        return x * y;
    }


    public static void main(String[] args) {
        System.out.println(Operation.sum(45, 23));
        System.out.println(Operation.substract(45, 23));
        System.out.println(Operation.multiply(4, 25));
    }
}
