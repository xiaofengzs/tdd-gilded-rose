package cn.xpbootcamp.gildedrose;

public class GeneralGood extends Good{
    public GeneralGood(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    void update(int numOfDay) {
        int sellInOfGood = this.getSellIn();
        int qualityOfGood = this.getQuality();
        if(sellInOfGood > numOfDay && qualityOfGood > sellInOfGood) {
            int reducedSellIn = sellInOfGood - numOfDay;
            int resultOfQuality = qualityOfGood - numOfDay;
            if (resultOfQuality > 0) this.setQuality(resultOfQuality);
            super.setSellIn(reducedSellIn);
        } else if(sellInOfGood < numOfDay && qualityOfGood > sellInOfGood) {
            int result = sellInOfGood - numOfDay;
            super.setSellIn(result);
            int resultOfQuality = qualityOfGood - sellInOfGood + result * 2;
            super.setQuality(resultOfQuality);
            if (resultOfQuality < 0) super.setQuality(0);
        } else if(qualityOfGood < sellInOfGood) {
            super.setQuality(qualityOfGood - numOfDay);
            super.setSellIn(sellInOfGood - numOfDay);
        }
    }
}
