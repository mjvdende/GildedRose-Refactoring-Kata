package com.gildedrose;

public class ItemFactory {

    private int quality;
    private int sellIn;
    private String name;

    public ItemFactory() {
        this.name = "";
        this.quality = 0;
        this.sellIn = 0;
    }

    public ItemFactory called(String name) {
        this.name = name;
        return this;
    }

    public ItemFactory ofQuality(int quality) {
        this.quality = quality;
        return this;
    }

    public ItemFactory toBeSoldIn(int sellIn) {
        this.sellIn = sellIn;
        return this;
    }

    public Item build() {
        return new Item(name, sellIn, quality);
    }


}
