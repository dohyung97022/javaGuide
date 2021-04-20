package com.forLoop;

public class NamedForLoop {
    public static void main(String[] args) {
        // Loop를 naming하여 원하는 loop을 빠져나갈 수 있다.
        // Outer loop을 빠져나가는데 유용하다.
        Loop1 :for (int i = 0; i < 10; i++) {
            Loop2 :for (int j = 0; j < 10; j++) {
                if (i==j)
                    break Loop1;
                else if (j<5) break Loop2;
                System.out.println(i);
                System.out.println(j);
            }
        }
    }
}
