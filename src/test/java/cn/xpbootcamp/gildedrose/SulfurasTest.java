package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfurasTest {
    @Test
    void should_set_sell_in_120_and_quality_30_given_general_good_sell_in_20_and_quality_30_when_pass_100_days() {
        Sulfuras sulfuras = new Sulfuras(20, 30);
        sulfuras.update(100);
        assertEquals(120, sulfuras.getSellIn());
        assertEquals(30, sulfuras.getQuality());
    }
}
