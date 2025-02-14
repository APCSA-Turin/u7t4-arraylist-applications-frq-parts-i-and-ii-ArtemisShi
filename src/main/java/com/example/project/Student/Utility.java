package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        Student place;
        for(int j=0; j<2;j++){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).getLastName().compareTo(list.get(i+1).getLastName())>0){
                place=list.get(i);
                list.set(i, list.get(i+1));
                list.set(i+1, place);
                i=0;
            }
            else{
            if(list.get(i).getLastName().compareTo(list.get(i+1).getLastName())==0){
                if(list.get(i).getFirstName().compareTo(list.get(i+1).getFirstName())>0){
                    place=list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, place);
                    i=0;
                }
                else{
                if(list.get(i).getFirstName().compareTo(list.get(i+1).getFirstName())==0){
                if(list.get(i).getGpa()<list.get(i+1).getGpa()){
                    place=list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, place);
                    i=0;
                }
                }
            }
        }
        }
        }
    }
   
        return list;
    }

}
