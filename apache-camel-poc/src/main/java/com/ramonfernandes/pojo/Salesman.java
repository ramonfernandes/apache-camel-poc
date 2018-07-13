package com.ramonfernandes.pojo;

public class Salesman implements ObjectFromFile{
    private String cnpj;
    private String name;
    private String businessArea;

    public Salesman(String cnpj, String name, String businessArea) {
        this.cnpj = cnpj;
        this.name = name;
        this.businessArea = businessArea;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getName() {
        return name;
    }

    public String getBusinessArea() {
        return businessArea;
    }
}
