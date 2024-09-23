package com.codewithRajat.shape;
public class Shape{
    int Dim1, Dim2;
    protected Shape(int Dim1, int Dim2){
        this.Dim1 = Dim1;
        this.Dim2 = Dim2;
    }
    public int getDim1(){
        return this.Dim1;
    }
    public void setDim1(int Dim1){
        this.Dim1 = Dim1;
    }
    public int getDim2(){
        return this.Dim2;
    }
    public void setDim2(int Dim2){
        this.Dim2 = Dim2;
    }
}