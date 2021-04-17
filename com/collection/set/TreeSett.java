package com.collection.set;

import com.sun.source.tree.Tree;

import java.net.Inet4Address;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSett {
    public static void main(String[] args) {
        // 생성자는 parameter 로서 크기, comparator 가 들어갈 수 있다.
        TreeSet<Integer> stringTree = new TreeSet<>();

        stringTree.add(10);
        stringTree.add(5);
        stringTree.add(1);
        stringTree.add(8);

        // first
        // 가장 작은 원소를 반납한다.
        System.out.println(stringTree.first());

        // last
        // 가장 큰 원소를 반납한다.
        System.out.println(stringTree.last());

        // ceiling
        // ceiling 은 가장 가까운 더 큰 값, 같을 수 있다.
        System.out.println(stringTree.ceiling(4));

        // floor
        // floor 은 가장 가짜운 작은 값, 같을 수 있다.
        System.out.println(stringTree.floor(4));

        // higher
        // higher 은 같지 않은 더 큰 값을 반환
        System.out.println(stringTree.higher(5));

        // lower
        // lower 은 같지 않은 더 작은 값을 반환
        System.out.println(stringTree.lower(5));

        // subset
        // subset 은 해당 값 사이의 값을 반환, 꼭 포함되지 않아도 된다.
        // 끝의 toElement 값은 포함되지 않는다.
        SortedSet<Integer> stringTreeSub = stringTree.subSet(10,20);

        // headSet
        // headSet 은 해당 값보다 더 작은 값들을 반환한다.
        SortedSet<Integer> stringTreeHeadSub = stringTree.headSet(10);

        // tailSet
        // tailSet 은 해당 값보다 더 큰 값들을 반환한다.
        SortedSet<Integer> stringTreeTailSet = stringTree.tailSet(10);
    }
}
