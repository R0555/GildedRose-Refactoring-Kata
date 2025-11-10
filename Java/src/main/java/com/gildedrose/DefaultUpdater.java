package com.gildedrose;

public class DefaultUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        item.sellIn--;
        item.quality = Math.max(item.quality - 1, 0);
        if (item.sellIn < 0) {
            item.quality = Math.max(item.quality - 1, 0);
        }
    }
}
