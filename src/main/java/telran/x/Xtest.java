package telran.x;

import telran.reflect.BeforeEach;
import telran.reflect.Test;

public class Xtest {
    @Test
	void f1() {
    	System.out.println("test 1");
    }
    int sum(int op1, int op2) {
    	System.out.println("method sum");
    	return op1 + op2;
    }
    int subtract(int op1, int op2) {
    	System.out.println("method subtract");
    	return op1 - op2;
    }
    @Test
    void f2() {
    	System.out.println("test 2");
    }
    @BeforeEach
   void setUp() {
        
        System.out.println("Setting up first method before each test method");
    }
    @BeforeEach
    void setUp1() {
         
         System.out.println("Setting up second method before each test method");
     }
}