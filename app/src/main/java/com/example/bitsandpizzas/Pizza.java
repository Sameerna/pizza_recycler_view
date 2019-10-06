package com.example.bitsandpizzas;

public class Pizza {
    private String name;
    private int imageResourceId;
    public static final Pizza[] pizzas = {
            new Pizza("Indie paneer",R.drawable.diavolo),
            new Pizza("Fungi",R.drawable.funghi)
    };
    private Pizza( String name,int imageResourceId){
        this.name= name;
        this.imageResourceId = imageResourceId;
    }
    public String getName(){
        return name;
    }
     public int getImageResourceId(){
        return imageResourceId;
     }
}
