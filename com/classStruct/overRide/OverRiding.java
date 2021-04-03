package com.classStruct.overRide;

class Point{
    int x;
    int y;
    String getLocation(){
        return x+" "+y;
    }
}

class Point3D extends Point{
    int z;
    String getLocation(){
        return x+" "+y+" "+z;
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.getLocation());
        Point3D point3D = new Point3D();
        System.out.println(point3D.getLocation());
    }
}
