package com.gildedrose;

import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class UpdateFactory {

    private static Map<String, List<String>> itemTypes = ImmutableMap.<String, List<String>>builder()
            .put("backstage", asList("Backstage passes to a TAFKAL80ETC concert"))
            .put("legendary", asList("Sulfuras, Hand of Ragnaros"))
            .put("quality", asList("Aged Brie"))
            .put("conjured", asList("Conjured Mana Cake"))
            .build();


    public static ItemUpdater updateFor(Item currentItem) {
        if (isQuality(currentItem)) {
            return new QualityItem();
        }
        else if(isLegendary(currentItem)) {
            return new LegendaryItem();
        }
        else if(isBackstage(currentItem)) {
            return new BackstageItem();
        }
        else if(isConjured(currentItem)) {
            return new ConjuredItem();
        }
        else {
            return new NormalItem();
        }
    }

    private static boolean isConjured(Item item) {
        return itemTypes.get("conjured").contains(item.name);
    }

    private static boolean isBackstage(Item item) {
        return itemTypes.get("backstage").contains(item.name);
    }

    private static boolean isLegendary(Item item) {
        return itemTypes.get("legendary").contains(item.name);
    }

    private static boolean isQuality(Item item) {
        return itemTypes.get("quality").contains(item.name);
    }
}
