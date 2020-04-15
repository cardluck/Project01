package com.xmjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zd
 * @date 2020-04-14
 */
public class TemplateTest {

    //prsf
    private static final int MAX_NUM = 10;
    //psf
    public static final int MIN_NUM = 0;
    //psfi
    public static final int num2 = 1;
    //psfs
    public static final String TEAM = "hell";


    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("hello");

        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("TemplateTest.main");
        //soutv
        int num =1;
        System.out.println("num = " + num);
        //xxx.sout
        System.out.println(num);

        String[] arr = new String[]{"Tom", "Kate", "小米", "huawei"};
        //fori
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        List<String> list2 = new ArrayList<>();
        list2.add("A1");
        list2.add("A2");
        list2.add("A3");
        list2.add("A4");

        for (String s : list2) {
            System.out.println(s);
        } 
        
        //list.fori
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        
        //list.forr
        for (int i = list2.size() - 1; i >= 0; i--) {
            System.out.println(list2.get(i));
        }
    }

    public void display(String name){
        //soutm
        System.out.println("TemplateTest.display");

        List<String> list1 = new ArrayList<>();
        list1.add("A1");
        list1.add("A2");
        list1.add("A3");

        //ifn
        if (list1 == null) {

        }

        //inn
        if (list1 != null) {
            
        }

        //xxx.null
        if (list1 == null) {

        }
        //xxx.nn
        if (list1 != null) {

        }
    }
}
