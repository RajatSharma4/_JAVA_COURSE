package com.codewithRajat.shape;

public class Sphere extends Shape {
    Sphere(int Dim1){
        super(Dim1, -1);
    }
    double Area(){
        return 4*Math.PI*this.Dim1*this.Dim1;
    }
    
}
