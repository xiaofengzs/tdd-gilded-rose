package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgedBrieTest {

    @Test
    void should_set_sell_in_10_and_quality_35_given_general_good_sell_in_20_and_quality_25_when_pass_10_days() {
        AgedBrie generalGood = new AgedBrie(20, 25);
        generalGood.update(10);
        assertEquals(10, generalGood.getSellIn());
        assertEquals(35, generalGood.getQuality());
    }

    @Test
    void should_set_sell_in_10_and_quality_35_given_general_good_sell_in_nagetive_1_and_quality_47_when_pass_21_days() {
        AgedBrie generalGood = new AgedBrie(20, 25);
        generalGood.update(21);
        assertEquals(-1, generalGood.getSellIn());
        assertEquals(47, generalGood.getQuality());
    }

}
