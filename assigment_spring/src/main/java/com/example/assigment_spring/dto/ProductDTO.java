package com.example.assigment_spring.dto;

import com.example.assigment_spring.model.Product;

public class ProductDTO extends Product {
    private  String comName;
    private  String comPhone;
    private  String companyAdress;


    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComPhone() {
        return comPhone;
    }

    public void setComPhone(String comPhone) {
        this.comPhone = comPhone;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }
}
