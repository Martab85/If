package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int variable = 1; variable < 21; variable++) {
            if (variable % 2 == 0) {
                System.out.println("Variable " + variable + " is even");
            }
             else if (variable%3 == 0){
                System.out.println("Variable "+ variable + " is divisible by 3");
            }
            else {
                System.out.println("Variable " + variable + " is odd");
            }


        }

int variable2 = 3;
        switch (variable2){
            case 1:
                System.out.println("Number 1");
                break;
            case 2:
                System.out.println("Number 2");
                break;
                default:
                    System.out.println("Not 1 nor 2");
        }


 Scanner reading = new Scanner(System.in);

        System.out.println("Give me a name: ");
        String name = reading.nextLine();

        switch (name){
            case "Maciek":
                System.out.println("Hi " + "Maciek");
                break;
            case "Jola":
                System.out.println("Hi " + "Jola");
                break;
                default:
                    System.out.println("I don't know you");

        }
for (int i=0; i<10; i++){
            if (i>7){
                break;
            }
    System.out.println("number "+i);
}

for (int k=0; k<10; k++){
            if(k%2 ==0){
                continue;
            }
    System.out.println("odd number "+k);
}
    }
}
