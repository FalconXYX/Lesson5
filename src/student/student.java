/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

public class student {

    private String name;
    private int test1, test2, test3;

    public student() {
        name = "";
        test1 = test2 = test3 = 0;
    }

// Additional constructor -- initialize the name and test scores // to the values provided. 
    public student(String nm, int tl, int t2, int t3) {
        name = nm;
        test1 = tl;
        test2 = t2;
        test3 = t3;
    }
// Additional constructor -- initialize the name and test scores // to match those in the parameter s. 

    public student(student s) {
        name = s.name;
        test1 = s.test1;
        test2 = s.test2;
        test3 = s.test3;
    }

    public void setName(String nm) {
        name = nm;
        
    }

    public String getName() { //Get a student's name 
        return name;
    }

    public void setScore(int i, int score) { //Set test i to score 
        if (i == 1) {
            this.test1 = score;
        } else if (i == 2) {
            this.test2 = score;
        } else if (i == 3) {
            this.test3 = score;
        }
    }

    public int getScore(int i) {
        if (i == 1) {
            return test1;
        }
        if (i == 2) {
            return test2;
        } 
        else if (i == 3) {
            return test3;
        }
        return 0;
    }
    int average;

    public int getavg() {

        average = (int) Math.round((test1 + test2 + test3) / 3.0);
        return average;
    }

    public int getHighScore() {
        int highScore;
        highScore = test1;
        if (test2 > highScore) {
            highScore = test2;
        }
        if (test3 > highScore) {
            highScore = test3;
        }
        return highScore;

    }

    public String validatedata() {
        String em = null;
        if (name.equals("")) {
            em = "Name is required";
        }
        if(test1<0 || test1>100 ||test2<0 || test2>100 || test3<0 || test3>100){
         if (em != null) {
            em = "1 of the marks are invalid";
        }
         else{
         
         em += "\n 1 of the marks are invalid";}
        
        }
        if (em != null) {
            em += "\n Re-enter all data";
        }
        return em;

    }

    public String toString() {
        getavg();
        String str;
        str = "Name: " + name;
        str += "\nTest 1:" + test1;
        str += "\nTest 2:" + test2;
        str += "\nTest 3:" + test3;
        str += "\nAverage:" + average;
        return str;

    }

}
