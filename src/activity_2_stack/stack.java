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
class stack {

    Scanner sc = new Scanner(System.in);
    int top = -1;
    int size = sc.nextInt();
    int[] arr = new int[size];
    
    void push() {
        if (top == size-1) {
            System.out.println("Stack is full!!");
        } else {
            System.out.println("Enter Value:");
            int v = sc.nextInt();
            top++;
            arr[top] = v;
            System.out.println("Item pushed!!");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty!!");
        } else {
            top--;
            System.out.println("Item popped!!");
        }
    }
    void display() {
        if (top==-1) {
            System.out.println("No element!!");
        }
        else{
        System.out.println("Stack element/s:");
        for (int i = top; i >=0; i--) {
            System.out.println("**" + arr[i]);
        }
    }}
 
}
