package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralGoodTest {

    @Test
    void should_set_sell_in_15_and_quality_25_given_general_good_sell_in_20_and_quality_30_when_pass_5_days() {
        GeneralGood generalGood = new GeneralGood(20, 30);
        generalGood.update(5);
        assertEquals(15, generalGood.getSellIn());
        assertEquals(25, generalGood.getQuality());
    }
}
