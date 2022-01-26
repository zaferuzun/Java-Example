package java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

public class FunctionalInterface {

    //For Exam, Not SOLID Principle :)

    // Yalnızca bir abstract methodu olan interface'e fonksiyonel interface denir.
    // Örn Runnable interface'si sadece run() methodundan oluşur

    //No argument and expression body
    @java.lang.FunctionalInterface
    public interface IFuncInt{
        // SAM (single abstract method)
        int printInteger();
    }

    // No parameter and block body
    @java.lang.FunctionalInterface
    public interface IFuncString{
        String getPrint();
    }

    //With Argument
    @java.lang.FunctionalInterface
    public interface IFuncArgInt{
        int addInteger(int a,int b);
    }

    //Generic
    @java.lang.FunctionalInterface
    public interface IGenericFunc<T>{
        T divideInteger(T t,T t2);
    }

    //--------------------STREAM--------------------

    //Exam Model

    // stream functional interface example
    @java.lang.FunctionalInterface
    public interface IModelExam<T>{
        ArrayList<T> listExam();
    }




}
