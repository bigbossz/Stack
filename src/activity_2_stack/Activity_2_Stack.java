/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity_2_stack;

import java.util.Scanner;

/**
 *
 * @author DS-Española
 */
public class Activity_2_Stack {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int c = 0;
        stack s = new stack();
        System.out.println("--------------------------------");
        while (c != 4) {
            System.out.println("Choose Action:");
            System.out.println("1.Push\n2.Pop\n3.Dispaly\n4.Exit");
            System.out.println("Enter your choice:");
            c = sc.nextInt();
            switch (c) {
                case 1: {
                    s.push();
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
                case 4: {
                    System.out.println("Boooooom!!!!!!");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Please Enter valid choice!!");
                }
            };
        }
    }
}
