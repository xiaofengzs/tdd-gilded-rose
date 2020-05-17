package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgedBrieTest {

    @Test
    void should_set_sell_in_14_and_quality_16_given_general_good_sell_in_15_and_quality_16_when_pass_1_days() {
        AgedBrie agedBrie = new AgedBrie(15, 15);
        agedBrie.update(1);
        assertEquals(14, agedBrie.getSellIn());
        assertEquals(16, agedBrie.getQuality());
    }

    @Test
    void should_set_sell_in_14_and_quality_51_given_general_good_sell_in_15_and_quality_50_when_pass_1_days() {
        AgedBrie agedBrie = new AgedBrie(15, 50);
        agedBrie.update(1);
        assertEquals(14, agedBrie.getSellIn());
        assertEquals(51, agedBrie.getQuality());
    }

    @Test
    void should_set_sell_in_nagetive_1_and_quality_51_given_general_good_sell_in_0_and_quality_50_when_pass_1_days() {
        AgedBrie agedBrie = new AgedBrie(0, 50);
        agedBrie.update(1);
        assertEquals(-1, agedBrie.getSellIn());
        assertEquals(51, agedBrie.getQuality());
    }

    @Test
    void should_set_sell_in_negative_3_and_quality_51_given_general_good_sell_in_negative_2_and_quality_50_when_pass_1_days() {
        AgedBrie agedBrie = new AgedBrie(-2, 50);
        agedBrie.update(1);
        assertEquals(-3, agedBrie.getSellIn());
        assertEquals(51, agedBrie.getQuality());
    }
}
