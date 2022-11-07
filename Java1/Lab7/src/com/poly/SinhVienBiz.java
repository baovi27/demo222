/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly;

/**
 *
 * @author Admin
 */
public class SinhVienBiz extends SinhVienPoly{
    public double diemMarrketing;
    public double diemSales;

    public SinhVienBiz(double diemMarrketing, double diemSales, String hoTen) {
        super(hoTen,"Biz");
        this.diemMarrketing = diemMarrketing;
        this.diemSales = diemSales;    
        
    }

    @Override
    public double getDiem() {
        return (diemMarrketing*2+diemSales)/3;
    }
       
}
