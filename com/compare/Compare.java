package com.compare;

import java.util.Arrays;
import java.util.Comparator;

public class Compare {

    // comparable
    static class Comparable implements java.lang.Comparable {
        private Integer i;

        public Comparable(Integer i) {
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
            if (i == ((Comparable)o).getI()) return 0;
            return (i>((Comparable)o).getI())? 1 : -1;
        }
    }
    public static void main(String[] args) {

        // comparable
        // comparable 은 compare 이 가능한 object 라는 의미이다.
        // compareTo 로 this 와 다른 객체를 compare 한다.
        // 정렬을 위해 사용된다.
        Integer i = 3;
        java.lang.Comparable comparable = i;
        System.out.println(comparable.compareTo(3));
        // +1(크다) 0(같다) -1(작다)

        // comparator
        // class 내에 interface 를 사용할 수 있지만
        // 따로 객체를 통해 비교 기준을 정할 수 있다.
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 원하는 비교 구문으로 바꾸고
                return 0;
            }

            @Override
            public boolean equals(Object obj) {
                // unique 한 value 로 비교하도록 하자.
                return false;
            }
        };

        // sort
        // 직접 구현한 클래스에
        // Comparable 을 implement 하였다면 가능하다.
        Comparable[] comparables = {new Comparable(3),new Comparable(5), new Comparable(10)};
        Arrays.sort(comparables);
        for (Comparable myClass : comparables){
            System.out.println(myClass.getI());
        }
    }
}
