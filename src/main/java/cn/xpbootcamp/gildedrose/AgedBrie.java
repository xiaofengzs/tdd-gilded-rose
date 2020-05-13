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
        }
        int resultOfSellIn = numOfDay - super.getSellIn();
        super.setQuality(quality + sellIn + 2 * resultOfSellIn);
        super.setSellIn(sellIn - numOfDay);
    }
}
