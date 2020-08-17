package com.demo;
//package com.demo;
import java.util.*;

class Complex {
    double real_val,imag_val;
    public Complex(double real_val , double imag_val){
        this.real_val = real_val;
        this.imag_val = imag_val;
    }
    public static Complex complex_sum(Complex c1 , Complex c2){
        Complex c_store = new Complex(0.0,0.0);
        c_store.real_val = c1.real_val + c2.real_val;
        c_store.imag_val = c1.imag_val + c2.imag_val;
        return c_store;
    }
    public static Complex subtractComp(Complex C1, Complex C2)
    {
        Complex temp_sub = new Complex(0.0 , 0.0);

        temp_sub.real_val = C1.real_val - C2.real_val;

        temp_sub.imag_val = C1.imag_val - C2.imag_val;

        return temp_sub;
    }
    public Complex comp_mul(Complex C1, Complex C2)
    {
        Complex c = new Complex(0.0 ,0.0);
        c.real_val = (this.real_val * C2.real_val) - (this.imag_val * C2.imag_val);
        c.imag_val = (this.imag_val * C2.real_val) + (this.real_val * C2.imag_val);
        return c;
    }
}
class Call_main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex obj1 = new Complex(sc.nextDouble() , sc.nextDouble());
        Complex obj2 = new Complex(sc.nextDouble() , sc.nextDouble());
        Complex ob_final = obj2.complex_sum(obj1 , obj2); // obj1.complex_sum(obj1 , obj2);
        System.out.println(ob_final.real_val + "+"+ ob_final.imag_val+"i");
        //-----------------------------------------------------------------------
        Complex obj3 = new Complex(sc.nextDouble() , sc.nextDouble());
        Complex obj4 = new Complex(sc.nextDouble() , sc.nextDouble());
        Complex ob_sub = obj3.subtractComp(obj3 , obj4); 
        System.out.println(ob_sub.real_val + "-"+ "("+ob_sub.imag_val+")"+"i");
        //-----------------------------------------------------------------------
        Complex obj5 = new Complex(sc.nextDouble() , sc.nextDouble());
        Complex obj6 = new Complex(sc.nextDouble() , sc.nextDouble());
        Complex ob_fin = obj3.comp_mul(obj5 , obj6);
        System.out.println(ob_fin.real_val + "+"+ob_sub.imag_val+"i");
    }
}


