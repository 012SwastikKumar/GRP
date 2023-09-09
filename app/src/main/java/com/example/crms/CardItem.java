package com.example.crms;
public class CardItem {
    private int displayPicture;
    private String heading;
    private String subHeading;

    public CardItem(int displayPicture, String heading, String subHeading) {
        this.displayPicture = displayPicture;
        this.heading = heading;
        this.subHeading = subHeading;
    }

    public int getDisplayPicture() {
        return displayPicture;
    }

    public String getHeading() {
        return heading;
    }

    public String getSubHeading() {
        return subHeading;
    }
}
