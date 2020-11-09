package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testUpdateQuality() {
        Item[] items = new Item[] { new Item("normal item", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("normal item, -1, 0", app.items[0].toString());
    }

    @Test
    void testNormalItemSellDatePassedQualityDegradesTwiceAsFastMinus2() {
        Item[] items = new Item[] { new Item("normal item", -1, -1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("normal item, -2, -1", app.items[0].toString());
    }

    @Test
    void testNormalItemSellDatePassedQualityDegradesTwiceAsFastMinus2Edge1() {
        Item[] items = new Item[] { new Item("normal item", 0, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("normal item, -1, 0", app.items[0].toString());
    }

    @Test
    void testNormalItemQualityDecreased1() {
        Item[] items = new Item[] { new Item("normal item", 22, 43) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("normal item, 21, 42", app.items[0].toString());
    }

    @Test
    void testNormalItemSellDatePassedQualityDegradesTwiceAsFast() {
        Item[] items = new Item[] { new Item("normal item", -1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("normal item, -2, 8", app.items[0].toString());
    }

    @Test
    void testQualityItemSellIn1QualityIncreasesWith1() {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 0, 11", app.items[0].toString());
    }

    @Test
    void testBackstageItemSellIn1QualityIncreasedWith3() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 13", app.items[0].toString());
    }

    @Test
    void testLegendaryItem() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 22, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros, 22, 80", app.items[0].toString());
    }

    @Test
    void testLegendaryItemSellInMin1() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros, -1, 80", app.items[0].toString());
    }

    @Test
    void tesQualityItemQualityMax50() {
        Item[] items = new Item[] { new Item("Aged Brie", 22, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 21, 50", app.items[0].toString());
    }

    @Test
    void testBackstageItemSellInn11OrLessQualityIncreasedBy1() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 11", app.items[0].toString());
    }

    @Test
    void testBackstageItemSellInn10OrLessQualityIncreasedBy1() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", app.items[0].toString());
    }

    @Test
    void testBackstageItemSellInn5OrLessQualityIncreasesBy3() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50", app.items[0].toString());
    }

    @Test
    void testBackstageItemSellInn6OrLessQualityIncreasesBy2() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, -5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, -3", app.items[0].toString());
    }

    @Test
    void testBackstageItemSellInn0OrLessSetQuality0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", app.items[0].toString());
    }

    @Test
    void testQualityItemSellIn0QualityIncreasesWith2() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, -1, 12", app.items[0].toString());
    }

    @Test
    void testQualityItemSellDatePassedQualityIncreases() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, -2, 50", app.items[0].toString());
    }

    @Test
    void testItemFactory() {
        Item[] items = new Item[] {new Item("normal item", 2, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("normal item, 1, 1", app.items[0].toString());
    }

}
