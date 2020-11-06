package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testUpdateQuality() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo, -1, 0", app.items[0].toString());
    }

    @Test
    void testItemQuality5() {
        Item[] items = new Item[] { new Item("foo", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo, -1, 3", app.items[0].toString());
    }

    @Test
    void testItemQuality10() {
        Item[] items = new Item[] { new Item("foo", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo, -1, 8", app.items[0].toString());
    }

    @Test
    void testItemQuality100() {
        Item[] items = new Item[] { new Item("foo", 0, 100) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo, -1, 98", app.items[0].toString());
    }

    @Test
    void testItemSellIn5() {
        Item[] items = new Item[] { new Item("foo", 5, 100) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo, 4, 99", app.items[0].toString());
    }

    @Test
    void testItemAgedBrieQuality100() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 100) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 4, 100", app.items[0].toString());
    }

    @Test
    void testItemAgedBrieQuality50() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 4, 50", app.items[0].toString());
    }

    @Test
    void testItemAgedBrieQuality49() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 4, 50", app.items[0].toString());
    }

    @Test
    void testItemBackstageQuality49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50", app.items[0].toString());
    }

    @Test
    void testItemBackstageQuality42SellIn11() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 42) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 43", app.items[0].toString());
    }

    @Test
    void testItemBackstageQuality42SellIn10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 42) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 44", app.items[0].toString());
    }

    @Test
    void testItemBackstageQuality42SellIn4() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 42) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, 3, 45", app.items[0].toString());
    }

    @Test
    void testItemBackstageQualityMin9() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, -9) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -2, 0", app.items[0].toString());
    }

    @Test
    void testItemAgedBrieQualityMin9() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, -9) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Age Brie, -2, -7  ", app.items[0].toString());
    }

}
