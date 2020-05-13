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

    @Test
    void should_set_sell_in_negative_2_and_quality_6_given_general_good_sell_in_20_and_quality_30_when_pass_22_days() {
        GeneralGood generalGood = new GeneralGood(20, 30);
        generalGood.update(22);
        assertEquals(-2, generalGood.getSellIn());
        assertEquals(6, generalGood.getQuality());
    }

    @Test
    void should_set_sell_in_negative_6_and_quality_0_given_general_good_sell_in_20_and_quality_30_when_pass_26_days() {
        GeneralGood generalGood = new GeneralGood(20, 30);
        generalGood.update(26);
        assertEquals(-6, generalGood.getSellIn());
        assertEquals(0, generalGood.getQuality());
    }

    @Test
    void should_set_sell_in_10_and_quality_0_given_general_good_sell_in_20_and_quality_10_when_pass_10_days() {
        GeneralGood generalGood = new GeneralGood(20, 10);
        generalGood.update(10);
        assertEquals(10, generalGood.getSellIn());
        assertEquals(0, generalGood.getQuality());
    }

    @Test
    void should_set_sell_in_9_and_quality_0_given_general_good_sell_in_20_and_quality_10_when_pass_11_days() {
        GeneralGood generalGood = new GeneralGood(20, 10);
        generalGood.update(11);
        assertEquals(9, generalGood.getSellIn());
        assertEquals(0, generalGood.getQuality());
    }
}
