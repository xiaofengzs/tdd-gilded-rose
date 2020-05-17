package cn.xpbootcamp.gildedrose;

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
            super.setQuality(quality + 20  + (5 - resultOfSellIn) * 3);
        } else if (resultOfSellIn < 10) {
            super.setQuality(quality + 10 + (10 - resultOfSellIn) * 2);
        } else {
            super.setQuality(Math.min(super.getQuality() + numOfDay, 50));
        }
        super.setSellIn(super.getSellIn() - numOfDay);
    }
}
