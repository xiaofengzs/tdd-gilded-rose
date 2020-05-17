package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralGoodTest {

    @Test
    void should_set_sell_in_11_and_quality_49_given_general_good_sell_in_12_and_quality_50_when_pass_1_days() {
        GeneralGood generalGood = new GeneralGood(12, 50);
        generalGood.update(1);
        assertEquals(11, generalGood.getSellIn());
        assertEquals(49, generalGood.getQuality());
    }

    @Test
    void should_set_sell_in_9_and_quality_19_given_general_good_sell_in_10_and_quality_20_when_pass_1_days() {
        GeneralGood generalGood = new GeneralGood(10, 20);
        generalGood.update(1);
        assertEquals(9, generalGood.getSellIn());
        assertEquals(19, generalGood.getQuality());
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
