package cn.xpbootcamp.gildedrose;

public class GeneralGood extends Good{
    public GeneralGood(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    void update(int numOfDay) {
        int sellInOfGood = this.getSellIn();
        int qualityOfGood = this.getQuality();
        if(sellInOfGood > 0 && qualityOfGood > 0) {
            int reducedQuality = qualityOfGood - numOfDay;
            if (reducedQuality > 0) this.setQuality(reducedQuality);
            super.setSellIn(sellInOfGood - numOfDay);
        }
    }
}
