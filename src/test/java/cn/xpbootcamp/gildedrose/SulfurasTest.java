package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasTest {
    @Test
    void should_set_sell_in_0_and_quality_1_given_general_good_sell_in_1_and_quality_1_when_pass_1_days() {
        Sulfuras sulfuras = new Sulfuras(1, 1);
        sulfuras.update(1);
        assertEquals(0, sulfuras.getSellIn());
        assertEquals(1, sulfuras.getQuality());
    }

    @Test
    void should_set_sell_negative_1_and_quality_1_given_general_good_sell_in_0_and_quality_1_when_pass_1_days() {
        Sulfuras sulfuras = new Sulfuras(0, 1);
        sulfuras.update(1);
        assertEquals(-1, sulfuras.getSellIn());
        assertEquals(1, sulfuras.getQuality());
    }
}
