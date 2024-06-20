package org.example.arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//            Object Array
//
//Object Stud[]=new Object[11];
//Stud[0]= 1;
//Stud[1]= "Tester Test";
//Stud[2]= 'M';
//Stud[3]= 97.98;
//Stud[4]= true;
//Stud[5]= 123234234234L;
//Stud[6]= 456;
//Stud[7]= "PASS";
//Stud[8]='S';
//Stud[9]= 123456789.23F;
//Stud[10]= 'V';
//        for (int i=0; i<Stud.length;i++){
//        System.out.println("Student Data="+Stud[i]);

//
        String[] name = new String[5];
        name[0] = "Test1";
        name[1] = "TEST2";
        name[2] = "Test3";
        name[3] = "Rest4";
        name[4] = "Rest5";

        for (int c = 0; c <= 4; c++) {
            System.out.println(name[c]);
        }
    }


}

