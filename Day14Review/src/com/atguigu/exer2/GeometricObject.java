package com.atguigu.exer2;


public abstract class GeometricObject {
    protected String color;
    protected double weight;


    protected GeometricObject (String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    //求面积的方法
    public abstract double findArea();
}
