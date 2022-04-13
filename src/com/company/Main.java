package com.company;

    class num {
    public int num1;
    public int num2;

    num(int first, int second){
        this.num1 = first;
        this.num2 = second;
    }
}

    class num2 {
        public int num3;
        public int num4;

        num2(int third, int fourth) {
            this.num3 = third;
            this.num4 = fourth;
        }
    }
public class Main {

    public static void main(String[] args) {
        num n1 = new num(45,100);
        num2 n2 = new num2(5, 10);


        if (n1.num1 > n1.num2){
            System.out.println("the greater integer value between 45 and 100 is: "+n1.num1);
        }

        if (n2.num3 > n2.num4){
            System.out.println("the greater value between 5 and 10 is:"+n2.num3);
        }else if(n2.num3 < n2.num4){
            System.out.println("the greater value between 5 and 10 is: "+n2.num4);
        }
    }
}
