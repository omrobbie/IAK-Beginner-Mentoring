package com.mavis.gameandroid;

/**
 * Created by Dode Agung on 18-Aug-17.
 */

public class DataListScore {
    public int item_image;
    public String item_title;
    public String item_score;

    public DataListScore(int item_image, String item_title, String item_score) {
        this.item_image = item_image;
        this.item_title = item_title;
        this.item_score = item_score;
    }

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
        return item_score;
    }

    public void setItem_description(String item_description) {
        this.item_score = item_description;
    }
}
