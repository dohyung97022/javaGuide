package com.compare;

import java.util.Arrays;
import java.util.Random;

public class Compare {
    static class MyClass implements Comparable{
        private Integer i;

        public MyClass(Integer i) {
            this.i = i;
        }

        public void setI(Integer i) {
            this.i = i;
        }

        public Integer getI() {
            return i;
        }

        @Override
        public int compareTo(Object o) {
            if (i == ((MyClass)o).getI()) return 0;
            return (i>((MyClass)o).getI())? 1 : -1;
        }
    }
    public static void main(String[] args) {

        // comparable
        // comparable 은 compare 이 가능한 object 라는 의미이다.
        // compareTo 로 this 와 다른 객체를 compare 한다.
        Integer i = 3;
        Comparable comparable = i;
        System.out.println(comparable.compareTo(3));
        // +1(크다) 0(같다) -1(작다)

        // 직접 구현한 클래스에
        // Comparable 을 implement 하였다면 가능하다.
        MyClass[] myClasses = {new MyClass(3),new MyClass(5), new MyClass(10)};
        Arrays.sort(myClasses);
        for (MyClass myClass : myClasses){
            System.out.println(myClass.getI());
        }
    }
}
