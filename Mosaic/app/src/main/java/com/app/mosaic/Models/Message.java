package com.app.mosaic.Models;

public class Message {
    public static final int TYPE_OUT = 0;
    public static final int TYPE_RESPONSE = 1;

    private String description;
    private String price;
    private String time;
    private int type;
    private String imageUrl;

    public Message(String description, String price, String url, String time, int type) {
        this.description = description;
        this.price = price;
        if(url != null){
            this.imageUrl = url;
        }
        this.time = time;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        if(price != null && !price.isEmpty()) {
            return description + " - $" + price;
        }
        return description;
    }

    public String getPrice() {
        if(price == null || price.isEmpty()) {
            return "";
        }
        return price;
    }

    public String getTime() {
        return time;
    }

    public int getType() {
        return type;
    }

    public String getImageUrl() {
        if(imageUrl != null && !imageUrl.isEmpty()) {
            return imageUrl;
        }
        return null;
    }
}

