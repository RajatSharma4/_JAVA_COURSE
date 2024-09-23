package com.codewithRajat.shape;

public class Circle extends Shape {
    Circle(int Dim1){
        super(Dim1, -1);
    }
  public double Area(){
        return Math.PI*this.Dim1*this.Dim1;
    }
    
}
