package com.codewithRajat.shape;
public class Square extends Shape {
    Square(int Dim1){
        super(Dim1, -1);
    }
    int Area(){
        return this.Dim1*this.Dim1;
    } 
}
    

