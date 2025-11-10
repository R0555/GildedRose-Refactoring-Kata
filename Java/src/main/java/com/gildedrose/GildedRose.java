package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn--;
            }

            if (items[i].name.equals("Aged Brie")) {
                items[i].quality = items[i].sellIn < 0 ? Math.min(items[i].quality + 2, 50) : Math.min(items[i].quality + 1, 50);

            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].sellIn < 0) {
                    items[i].quality = 0;
                } else if (items[i].sellIn < 5) {
                    items[i].quality = Math.min(items[i].quality + 3, 50);
                } else if (items[i].sellIn < 10) {
                    items[i].quality = Math.min(items[i].quality + 2, 50);
                } else {
                    items[i].quality = Math.min(items[i].quality + 1, 50);
                }
            } else if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].quality = Math.max(items[i].quality - 1, 0);
                if (items[i].sellIn < 0) {
                    items[i].quality = Math.max(items[i].quality - 1, 0);
                }
            }
        }
    }
}
