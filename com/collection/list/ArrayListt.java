package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListt {
    public static void main(String[] args) {
        // array 의 특징을 갖는 list 이다.
        // arraylist 는 indexing 이 빠르지만
        // 중간에 자료를 추가하거나 삭제하는데 인덱스를
        // 앞으로 모두 한칸 옮겨야 하기 때문에 느리다.
        List arrayList = new ArrayList();
        arrayList.add(10);
        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}
