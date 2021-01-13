package com.example.ali_ateeq;

public class Inbox  {
    private String Name;
    private String phone;
    private int photo;

    public Inbox(String name, String phone, int photo) {
        Name = name;
        this.phone = phone;
        this.photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
