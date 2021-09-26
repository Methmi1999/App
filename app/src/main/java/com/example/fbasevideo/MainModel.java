package com.example.fbasevideo;

public class MainModel {

    String name,email,type,date,surl;

    MainModel()
    {

    }
    public MainModel(String name, String email, String type, String surl){
        this.name = name;
        this.email = email;
        this.type = type;
        this.surl = surl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl;
    }
}
