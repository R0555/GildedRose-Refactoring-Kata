package com.gildedrose;

public class AgedBrieUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        item.sellIn--;
        item.quality = item.sellIn < 0 ? Math.min(item.quality + 2, 50) : Math.min(item.quality + 1, 50);
    }
    
}
