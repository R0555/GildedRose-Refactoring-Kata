package com.gildedrose;

class GildedRose {
    Item[] items;
    ItemUpdaterFactory itemUpdaterFactory;

    public GildedRose(Item[] items) {
        this.items = items;
        this.itemUpdaterFactory = new ItemUpdaterFactory();
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater itemUpdater = itemUpdaterFactory.forItem(item);
            itemUpdater.update(item);
        }
    }
}
