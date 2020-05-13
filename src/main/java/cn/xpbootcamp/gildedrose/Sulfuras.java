package cn.xpbootcamp.gildedrose;

public class Sulfuras extends Good{
    public Sulfuras(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    void update(int numOfDay) {
        super.setSellIn(numOfDay + super.getSellIn());
    }
}
