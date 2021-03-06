package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Good {
    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    void update(int numOfDay) {
        int quality = super.getQuality();
        int sellIn = super.getSellIn();
        if (numOfDay < sellIn) {
            super.setQuality(quality + numOfDay);
        } else {
            int resultOfSellIn = numOfDay - super.getSellIn();
            super.setQuality(Math.min(quality + sellIn + 2 * resultOfSellIn, 50));
        }
        super.setSellIn(sellIn - numOfDay);
    }
}
