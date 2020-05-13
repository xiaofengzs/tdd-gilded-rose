package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Good{
    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    void update(int numOfDay) {
        super.setSellIn(super.getSellIn() - numOfDay);
        super.setQuality(super.getQuality() + numOfDay);
    }
}
