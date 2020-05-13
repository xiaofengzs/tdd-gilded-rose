package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Good {
    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    void update(int numOfDay) {
        super.setSellIn(super.getSellIn() - numOfDay);
        super.setQuality(super.getQuality() + numOfDay);
    }
}
