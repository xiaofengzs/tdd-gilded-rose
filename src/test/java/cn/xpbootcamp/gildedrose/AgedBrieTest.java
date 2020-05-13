package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgedBrieTest {

    @Test
    void should_set_sell_in_10_and_quality_35_given_general_good_sell_in_20_and_quality_25_when_pass_10_days() {
        AgedBrie agedBrie = new AgedBrie(20, 25);
        agedBrie.update(10);
        assertEquals(10, agedBrie.getSellIn());
        assertEquals(35, agedBrie.getQuality());
    }

    @Test
    void should_set_sell_in_nagetive_1_and_quality_47_given_general_good_sell_in_20_and_quality_25_when_pass_21_days() {
        AgedBrie agedBrie = new AgedBrie(20, 25);
        agedBrie.update(21);
        assertEquals(-1, agedBrie.getSellIn());
        assertEquals(47, agedBrie.getQuality());
    }

    @Test
    void should_set_sell_in_nagetive_11_and_quality_50_given_general_good_sell_in_20_and_quality_25_when_pass_31_days() {
        AgedBrie agedBrie = new AgedBrie(20, 25);
        agedBrie.update(31);
        assertEquals(-11, agedBrie.getSellIn());
        assertEquals(50, agedBrie.getQuality());
    }
}
