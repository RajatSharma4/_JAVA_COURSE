package com.codewithRajat.shape;

public class Rectangle extends Shape {
    Rectangle(int Dim1, int Dim2){
        super(Dim1, Dim2);
    }
    int Area(){
        return this.Dim1*this.Dim2;
    }
    
}
