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
        if (resultOfSellIn < 5) {
            super.setQuality(quality + 20  + (5 - resultOfSellIn) * 3);
        } else if (resultOfSellIn < 10) {
            super.setQuality(quality + 10 + (10 - resultOfSellIn) * 2);
        } else {
            super.setQuality(super.getQuality() + numOfDay);
        }
        super.setSellIn(super.getSellIn() - numOfDay);
    }
}
