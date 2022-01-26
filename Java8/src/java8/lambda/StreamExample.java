package java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

public class StreamExample {

    private FunctionalInterface.IModelExam<ModelExam> iModelExam;

    private ArrayList<ModelExam> modelExams=new ArrayList<>();

    @Data
    @AllArgsConstructor
    public class ModelExam{

        String examName;
        String id;

    }

    public void arrayListAddRandom(int arrayLength){
        for(int i=1;i<=arrayLength;i++){
            ModelExam modelExam =new ModelExam("exam"+i,""+i);
            modelExams.add(modelExam);
        }
    }

    public void getListExam()
    {
        iModelExam = ()->{
            arrayListAddRandom(10);
            return modelExams;
        };
        iModelExam.listExam().stream().forEach((exam)-> System.out.println(exam));

    }




}
