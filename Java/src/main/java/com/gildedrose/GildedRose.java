package com.gildedrose;

import static com.gildedrose.UpdateFactory.updateFor;


class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            // if normal or legendary
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    updateFor(items[i]).update(items[i]);
            }

            // if backstage
            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                updateFor(items[i]).update(items[i]);
            }

            // if quality
            if (items[i].name.equals("Aged Brie")){
                items[i].sellIn = items[i].sellIn - 1;
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }

            if (items[i].sellIn < 0) {
                if (items[i].name.equals("Aged Brie") & items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }
        }
    }
}