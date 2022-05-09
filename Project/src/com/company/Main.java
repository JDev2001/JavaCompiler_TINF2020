package com.company;

public class Main {
    public static void main(String[] args) {
        Object i  = new A();
            switch (i)
            {
                case A a  -> System.out.println("A");
                case B a  -> System.out.println("B");
                case Object o -> System.out.println("default");
            }
        }
 }

class A
{

}

class B
{

}