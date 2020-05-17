package cn.xpbootcamp.gildedrose;

import org.omg.CORBA.MARSHAL;

public class BackstagePass extends Good {
    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    void update(int numOfDay) {
        int sellIn = super.getSellIn();
        int quality = super.getQuality();
        int resultOfSellIn = sellIn - numOfDay;
        if (resultOfSellIn < 0) {
            super.setQuality(0);
        } else if (resultOfSellIn < 5) {
            super.setQuality(Math.min(quality + numOfDay * 3, 50));
        } else if (resultOfSellIn < 10) {
            super.setQuality(Math.min(quality + numOfDay * 2, 50));
        } else {
            super.setQuality(Math.min(super.getQuality() + numOfDay, 50));
        }
        super.setSellIn(super.getSellIn() - numOfDay);
    }
}
