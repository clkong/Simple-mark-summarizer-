/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author nidie
 */
public class Calculator {   
    private final ArrayList AClass = new <Student> ArrayList();// an arrayList of students( the student of the class)
    
    public Calculator(){//default
        
    }
    public Calculator( ArrayList <Student> c){//input the whole class
        for (int i = 0; i < c.size(); i++) {
            Student a =new Student(c.get(i));
           AClass.add( a);
            
        }
    }
    
    public double getAvg(){//get the average of the class
        double sum = 0;//store the sum
        for (int i = 0; i < AClass.size(); i++) {//go through the students
           double s =((Student) AClass.get(i)).getScore();
            sum+=s;//get the scores and add them to sum
        }
        return (sum/AClass.size());//output
    }
    
    public double getHighest(){//get the highest
        double max = 0;//default 0
        for (int i = 0; i < AClass.size(); i++) {//go through the students
            double s =((Student)AClass.get(i)).getScore();//get score
            if(s>max){//if the current sutdent's score is higher than max 
                max =s;//replace it
            }else{
                
            }
            
        }
        return max;//output 
    }
    public double getLowest(){
        double min = 100;
        for (int i = 0; i < AClass.size(); i++) {//go through the students
            double s =((Student)AClass.get(i)).getScore();//get score
            if(s<min){//if the current sutdent's score is lower than min
                min =s;//replace
            }else{
                
            }
            
        }
        return min;
    }
    public int fails(){//get number of student's mark who are below 60
        int c=0;
        for (int i = 0; i < AClass.size(); i++) {
         double b =((Student)AClass.get(i)).getScore();
         if(b<60){
         c++;    
         }
           
        }
        return c;
        
    }
    public int above90(){//get number of student's mark who above 90
      int a=0;
        for(int i=0; i<AClass.size();i++){
       double b =((Student)AClass.get(i)).getScore();
            
       if(b>=90)    
        a++;
            }
       return a; 
    }
    
    public void setClassroom(ArrayList <Student> c){//input a class
        for (int i = 0; i < c.size(); i++) {
            Student a =new Student(c.get(i));
           AClass.add( a);
            
        }
    }
    public void addStudnet(Student s){//add a student
        AClass.add(s);
    }
    public ArrayList<Student> getClassroom(){
        return AClass;
    }
}
