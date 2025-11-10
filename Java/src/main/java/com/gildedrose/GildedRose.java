package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        switch (item.name) {
            case "Sulfuras, Hand of Ragnaros":
                updateSulfuras(item);
                break;
            case "Aged Brie":
                updateAgedBrie(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                updateBackstagePass(item);
                break;
            default:
                updateDefault(item);
                break;
        }
    }

    private void updateSulfuras(Item item) {
        return;
    }

    private void updateAgedBrie(Item item) {
        item.sellIn--;
        item.quality = item.sellIn < 0 ? Math.min(item.quality + 2, 50) : Math.min(item.quality + 1, 50);
    }

    private void updateBackstagePass(Item item) {
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn < 5) {
            item.quality = Math.min(item.quality + 3, 50);
        } else if (item.sellIn < 10) {
            item.quality = Math.min(item.quality + 2, 50);
        } else {
            item.quality = Math.min(item.quality + 1, 50);
        }
    }

    private void updateDefault(Item item) {
        item.sellIn--;
        item.quality = Math.max(item.quality - 1, 0);
        if (item.sellIn < 0) {
            item.quality = Math.max(item.quality - 1, 0);
        }
    }
}
