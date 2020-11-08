package com.gildedrose;

public class BackstagItem extends Item{

    private String name;
    private int sellIn;
    private int quality;

    public BackstagItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }
}
