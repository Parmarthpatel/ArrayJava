package org.example;

import java.util.ArrayList;

public class ArrayListConcept {
    void xyz(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(200);
        arrayList.add("Master voice");
        arrayList.add('M');
        arrayList.add(2341234123L);
        arrayList.add("Tester examination");
        arrayList.add(12345.456F);
        arrayList.add('S');
        arrayList.add(true);
        arrayList.add('V');
        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(2));
        System.out.println(arrayList);
        System.out.println(arrayList.remove(7));
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.add(true);
        System.out.println(arrayList.size());
        System.out.println(arrayList);

//        ArrayList arrayList=new ArrayList();
//        arrayList.add(100);
//        arrayList.add("Tester test");
//        arrayList.add('m');
//        arrayList.add(123452123123L);
//        arrayList.add(133444.234F);
//        arrayList.add(true);

//        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(2));
//        System.out.println(arrayList.get(5));
//        System.out.println(arrayList.get(1));


    }

    public static void main(String[] args) {
        ArrayListConcept arrayListConcept=new ArrayListConcept();
        arrayListConcept.xyz();
    }
}
