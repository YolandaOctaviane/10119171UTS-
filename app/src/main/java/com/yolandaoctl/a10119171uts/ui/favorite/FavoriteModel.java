package com.yolandaoctl.a10119171uts.ui.favorite;

public class FavoriteModel {
    int image;
    String title;
    String penyanyi;

    public FavoriteModel(int image, String title, String penyanyi) {
        this.image = image;
        this.title = title;
        this.penyanyi = penyanyi;
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

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }
}

