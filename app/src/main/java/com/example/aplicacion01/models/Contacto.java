package com.example.aplicacion01.models;

import java.util.ArrayList;

public class Contacto {
    public String phone;
    public String nickname;
    public String image;

    public  String getSmallImage(){
        return  this.image;
    }

    public Contacto(String _phone, String _nickname, String _image) {
        this.phone = _phone;
        this.nickname = _nickname;
        this.image = _image;
    }

    public static ArrayList getCollection() {
        ArrayList<Contacto> collection = new ArrayList<>();
        collection.add(new Contacto("979979800", "arte","https://mymodernmet.com/wp/wp-content/uploads/archive/Intrbh4DSN1AGBi1VXCs_1082136603.jpeg"));
        collection.add(new Contacto("979979800", "tecnologia","https://mymodernmet.com/wp/wp-content/uploads/2019/12/tech-art-2019-0.jpg"));
        collection.add(new Contacto("979979800", "ambiente","https://mymodernmet.com/wp/wp-content/uploads/2019/11/italy-climate-change-education-square.jpg"));
        collection.add(new Contacto("979979800", "naturaleza","https://mymodernmet.com/wp/wp-content/uploads/2019/10/audubon-birds-of-america-Columbian-Humming-Bird-1-1.png"));
        return collection;
    }
}