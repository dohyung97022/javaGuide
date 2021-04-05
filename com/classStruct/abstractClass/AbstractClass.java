package com.classStruct.abstractClass;

abstract class AbstractClass {
 // abstract는 변수는 만들 수 없지만
 // function은 만들 수 있다.
// abstract int absInt;

 // 다만 변수를 가질 수 있고
 int absInt;

 // constructor도 가질 수 있다.
 public AbstractClass(int absInt) {
  this.absInt = absInt;
 }

 abstract void absMethod1();
 abstract void absMethod2();
 abstract void absMethod3();

 // 일반 method 안에 추상 method 를 호출할 수 있다.
 public void publicMethod(){
  absMethod1();
  absMethod2();
 }
}
