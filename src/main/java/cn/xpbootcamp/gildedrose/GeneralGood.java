package cn.xpbootcamp.gildedrose;

public class GeneralGood extends Good{
    public GeneralGood(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    void update(int numOfDay) {
        int sellInOfGood = this.getSellIn();
        int qualityOfGood = this.getQuality();
        if(sellInOfGood > numOfDay && qualityOfGood > 0) {
            int reducedQuality = qualityOfGood - numOfDay;
            if (reducedQuality > 0) this.setQuality(reducedQuality);
            super.setSellIn(sellInOfGood - numOfDay);
        } else if(sellInOfGood < numOfDay && qualityOfGood > 0) {
            int result = sellInOfGood - numOfDay;
            super.setSellIn(result);
            int resultOfQuality = qualityOfGood - sellInOfGood + result * 2;
            super.setQuality(resultOfQuality);
            if (resultOfQuality < 0) super.setQuality(0);
        }
    }
}
