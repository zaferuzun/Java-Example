package com.zuzun.java8.lambda;

public class MainTest {

    public static void braceLines(int dash){
        while (0<dash){
            System.out.print("-");
            dash--;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        LambdaExpression lambdaExpression=new LambdaExpression();
        braceLines(20);
        lambdaExpression.printLambda();
        braceLines(20);
        lambdaExpression.getLambdaStr();
        braceLines(20);
        lambdaExpression.lambdaAdd(10,15);
        braceLines(20);
        lambdaExpression.getDivide(15,2);

        //--------------------STREAM--------------------

        StreamExample streamExample = new StreamExample();

        streamExample.getListExam();




    }
}
