package com.codewithRajat.shape;

public class Cylinder extends Shape {
    Cylinder(int Dim1, int Dim2){
        super(Dim1, Dim2);
    }
    double Area(){
        return 2*Math.PI*this.Dim1*(this.Dim1 +this.Dim2);
    }
    
}
