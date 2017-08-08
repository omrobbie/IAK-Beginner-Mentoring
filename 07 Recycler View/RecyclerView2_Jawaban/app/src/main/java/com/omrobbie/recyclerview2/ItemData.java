package com.omrobbie.recyclerview2;

// COMPLETED: (9) Buatlah class untuk menampung data
public class ItemData {

    // COMPLETED: (10) Deklarasikan variabel untuk semua item data
    public int item_photo;
    public String item_title;

    // COMPLETED: (11) Buatlah constructor untuk kelas ini
    public ItemData() {
    }

    // COMPLETED: (12) Deklarasikan getter dan setter
    public int getItem_photo() {
        return item_photo;
    }

    public void setItem_photo(int item_photo) {
        this.item_photo = item_photo;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }
}
