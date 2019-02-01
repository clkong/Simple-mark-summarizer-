/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author nidie
 */
public class Student {
    private String name,conclution;//name of the student and conclution
    private double score;// score of the student
    private boolean belowAvg;//store whether his/her score is below average
    
    public Student(){//default 
        name="";
        score = 0;
    }
    public Student(String  n, double s ){//input name and score
        name = n ;
        score= s;
    }
    public Student (Student s){//input a studnet
        name = s.getName();
        score=  s.getScore();
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public double getScore(){
        return score;
    }
    public void setScore(double s){
        score = s;
    }
    public String getConcultion(){
        return conclution;
    }
    public void setConclution(String c){
        conclution = c;
    }
    public boolean getBelowAvg(){
        return belowAvg;
    }
    public void setBelowAvg(boolean b){
        belowAvg =b;
    }
    public String toString(){//output the status of the student
        return "Student Name: "+name+"\nScore: "+score+"\nConclution:"+conclution;
    }
}
