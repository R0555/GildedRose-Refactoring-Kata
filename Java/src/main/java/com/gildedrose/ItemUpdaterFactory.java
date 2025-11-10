package com.gildedrose;

class ItemUpdaterFactory {
    private final ItemUpdater defaultUpdater = new DefaultUpdater();
    private final ItemUpdater agedBrie = new AgedBrieUpdater();
    private final ItemUpdater sulfuras = new SulfurasUpdater();
    private final ItemUpdater backstage = new BackstagePassUpdater();

    public ItemUpdater forItem(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return agedBrie;
            case "Sulfuras, Hand of Ragnaros":
                return sulfuras;
            case "Backstage passes to a TAFKAL80ETC concert":
                return backstage;
            default:
                return defaultUpdater;
        }
    }
}

