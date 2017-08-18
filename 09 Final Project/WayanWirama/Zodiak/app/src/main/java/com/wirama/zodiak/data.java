package com.wirama.zodiak;

/**
 * Created by ChuPAK on 8/15/2017.
 */

public class data {
    public int image;
    public  String title, description;


    public data(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
