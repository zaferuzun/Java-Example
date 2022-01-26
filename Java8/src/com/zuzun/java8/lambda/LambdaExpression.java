package com.zuzun.java8.lambda;

public class LambdaExpression {

    // işlevsel programlamayı kolaylaştırır
    // Koleksiyondan veri işlemlerine yardımcı olur
    // LOC (lines of code) azaltır.
            // fiziksel kod satırları LOC
            // mantıksal kod satırları LLOC (logical lines of code )
    // Tek başına yürütülemezler
    // Functional interface ile birlikte kullanılabilirler

    // (parameter list) -> {body}

    private FunctionalInterface.IFuncInt iFuncInterface;
    private FunctionalInterface.IFuncString iFuncString;

    private FunctionalInterface.IFuncArgInt iFuncArgInt;
    private FunctionalInterface.IGenericFunc<Double> iGenericFunc;

    // No parameter and expression body
    public void printLambda(){
        iFuncInterface=()-> 555;
        System.out.println(iFuncInterface.printInteger());
        
    }

    // No parameter and block body
    public void getLambdaStr(){
        iFuncString = () -> {
            StringBuffer stringBuffer = new StringBuffer("Trying");
            stringBuffer.append(" Lambda");
            stringBuffer.append(" Expression");
            return stringBuffer.toString();
        };
        System.out.println(iFuncString.getPrint());
    }

    //With Argument
    public void lambdaAdd(int number1,int number2){
        iFuncArgInt = (iNumber1,iNumber2) ->{
          return iNumber1+iNumber2;
        };
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number1);
        stringBuilder.append(" + ");
        stringBuilder.append(number2);
        stringBuilder.append(" = ");
        stringBuilder.append(iFuncArgInt.addInteger(number1,number2));
        System.out.println(stringBuilder.toString());
    }

    //Generic
    // No parameter and block body
    public void getDivide(double number1,double number2){
        iGenericFunc = (iNumber1,iNumber2) -> {
           return Double.valueOf((iNumber2==0)? 0:number1/number2);
        };
        System.out.println(iGenericFunc.divideInteger(number1,number2));
    }

}
