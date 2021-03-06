package com.zipcodewilmington.gildedrose;


public class Inventory {
    private Item[] items;

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }


    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].getName().equals("Aged Brie")
                    && !items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert") && items[i].getQuality() > 0
                    && !items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                items[i].setQuality(items[i].getQuality() - 1);
            }
            if (items[i].getQuality() < 50) {
                items[i].setQuality(items[i].getQuality() + 1);
            }

            if (items[i].getName() == "Backstage passes to a TAFKAL80ETC concert" && items[i].getSellIn() < 11
                    && items[i].getQuality() < 50) {
                items[i].setQuality(items[i].getQuality() + 1);
            }
            if (items[i].getSellIn() < 6 && items[i].getQuality() < 50) {
                items[i].setQuality(items[i].getQuality() + 1);
            }

            if (!items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                items[i].setSellIn(items[i].getSellIn() - 1);
            }

            if (items[i].getSellIn() < 0 && !items[i].getName().equals("Aged Brie") &&
                    !items[i].getName().equals("Backstage passes to a TAFKAL80ETC concert") && items[i].getQuality() > 0
                    && !items[i].getName().equals("Sulfuras, Hand of Ragnaros")) {
                items[i].setQuality(items[i].getQuality() - 1);
            } else {
                items[i].setQuality(items[i].getQuality() - items[i].getQuality());
            }
            if (items[i].getQuality() < 50) {
                items[i].setQuality(items[i].getQuality() + 1);
            }
        }
    }
}