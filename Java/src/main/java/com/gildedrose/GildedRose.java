package com.gildedrose;

import static com.gildedrose.UpdateFactory.updateFor;


class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateFor(items[i]).update(items[i]);
        }
    }
}