package org.example.mypackage;

public class Body {
    private Heart heart;

    public Body() {
        this.heart = new Heart(4);
    }

    public Heart getHeart() {
        return heart;
    }

    public int getPompimgs () {
        return heart.getPomps();
    }

}
