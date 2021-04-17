package com.enumm;

public class Enum {
    enum Kind {CLOVER , HEART ,DIAMOND, SPADE}
    enum Value {ONE, TWO ,THREE}

    public static void main(String[] args) {

        // typeMatch
        // 이 각각 두 enum 은 0 으로 지정이 되어 있지만
        // 값이 일치하다고 나오면 안된다.
        // 그래서 java 는 타입과 value 의 값을 모두 비교한다.
        // if (Kind.CLOVER == Value.ONE)
        // System.out.println("this is not compilable");

        // 다만 같은 enum 의 타입일 경우 비교가 가능하다.
        if (Kind.CLOVER == Kind.DIAMOND){
            System.out.println("this is compilable");
        }
        // 같은 enum 이라 할지라도 비교형 연산자 < 나 > 를 사용할 수 없다.
        // if (Kind.CLOVER > Kind.DIAMOND){
        // System.out.println("this is also not compilable");
        // }

        // valueOf
        // valueOf 는 enum 에 str 을 줘서 그 str 의 enum 값을 얻을 수 있다.
        System.out.println(Kind.valueOf("CLOVER"));

        // name
        // name 은 해당 enum 의 이름을 출력해준다.
        System.out.println(Kind.CLOVER.name());

        // ordinary
        // enum 이 지정된 순서, 증 enum 안의 값을 출력해준다.
        System.out.println(Kind.CLOVER.ordinal());

    }

    // enum 에 직접 값을 부여하는 방법이다.
    enum EditedEnum {
        ONE(1), TWO(2), THREE(3);
        private final int value;
        EditedEnum(int i) {
           this.value = i;
        }
        public int getValue() {
            return value;
        }
    }
}
