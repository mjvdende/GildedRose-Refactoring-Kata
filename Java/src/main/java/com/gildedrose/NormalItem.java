package com.gildedrose;

public class NormalItem implements ItemUpdater {

    public Item update(Item item) {

        if(canLowerQuality(item)) {
            item.quality--;
            if(pastExpirationDate(item)) {
                item.quality--;
            }
        }

        item.sellIn--;

        return item;
    }

    private boolean pastExpirationDate(Item item) {
        if(canLowerQuality(item)){
            return item.sellIn <= 0;
        }
        return false;
    }

    private boolean canLowerQuality(Item item) {
        return item.quality > 0;
    }



}
