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
        AgedBrie agedBrie = new AgedBrie(15, 51);
        agedBrie.update(1);
        assertEquals(14, agedBrie.getSellIn());
        assertEquals(51, agedBrie.getQuality());
    }

    @Test
    void should_set_sell_in_nagetive_11_and_quality_50_given_general_good_sell_in_20_and_quality_25_when_pass_31_days() {
        AgedBrie agedBrie = new AgedBrie(20, 25);
        agedBrie.update(31);
        assertEquals(-11, agedBrie.getSellIn());
        assertEquals(50, agedBrie.getQuality());
    }
}
