package com.omrobbie.recyclerview;

public class Data {
    // COMPLETED: (6) Setup data yang akan dipakai
    public int item_image;
    public String item_title;
    public String item_description;

    // COMPLETED: (7) Buatlah constructor untuk kelas ini
    public Data(int item_image, String item_title, String item_description) {
        this.item_image = item_image;
        this.item_title = item_title;
        this.item_description = item_description;
    }

    // COMPLETED: (8) Buatlah Getter & Setter untuk data di kelas ini
    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }
}
