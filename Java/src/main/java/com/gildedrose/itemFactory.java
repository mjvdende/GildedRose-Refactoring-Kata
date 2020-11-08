package com.gildedrose;

public class itemFactory {

    public static Item getItem(String type, String name, int sellIn, int quality){
        if("NORMAL".equalsIgnoreCase(type)) return new NormalItem(name, sellIn, quality);
        else if("QUALITY".equalsIgnoreCase(type)) return new QualityItem(name, sellIn, quality);

        return null;
    }
}
