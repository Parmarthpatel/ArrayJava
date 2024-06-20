package org.example;

import java.net.PasswordAuthentication;

public class ArrayInJava {
        public static void main(String[] args) {
//
//         Int Array
            int a[] = new int[5];
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;
            a[3] = 40;
            a[4] = 50;
//            System.out.println(a[0]);
//            System.out.println(a[1]);
//            System.out.println(a[2]);
//            System.out.println(a[3]);
//            System.out.println(a[4]);
//            System.out.println(a[0]+"\n" +a[1]+"\n"+a[2]+ "\n"+a[3])+"\n"+a[4];

            for (int b=0; b<=4; b++){
                System.out.println(a[b]);
            }

//        String Array
            String []name= new String[5];
            name[0]="Test1";
            name[1]="Test2";
            name[2]="Test3";
            name[3]="Test4";
            name[4]="Test5";

            for (int c=0;c<=4;c++){
                System.out.println(name[c]);
            }

//            Object Array
            Object Stud[]=new Object[11];
            Stud[0]= 1;
            Stud[1]= "Tester Test";
            Stud[2]= 'M';
            Stud[3]= 97.98;
            Stud[4]= true;
            Stud[5]= 123234234234L;
            Stud[6]= 456;
            Stud[7]= "PASS";
            Stud[8]='S';
            Stud[9]= 123456789.23F;
            Stud[10]= 'V';
            for (int i=0; i<Stud.length;i++){
                System.out.println("Student Data="+Stud[i]);

            }
        }
}
