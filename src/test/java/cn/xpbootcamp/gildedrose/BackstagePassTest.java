package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassTest {

    @Test
    void should_set_sell_in_15_and_quality_10_given_backstage_pass_sell_in_20_and_quality_5_when_pass_5_days() {
        BackstagePass backstagePass = new BackstagePass(20, 5);
        backstagePass.update(5);
        assertEquals(15, backstagePass.getSellIn());
        assertEquals(10, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_8_and_quality_19_given_backstage_pass_sell_in_20_and_quality_5_when_pass_12_days() {
        BackstagePass backstagePass = new BackstagePass(20, 5);
        backstagePass.update(12);
        assertEquals(8, backstagePass.getSellIn());
        assertEquals(19, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_2_and_quality_24_given_backstage_pass_sell_in_20_and_quality_5_when_pass_18_days() {
        BackstagePass backstagePass = new BackstagePass(20, 5);
        backstagePass.update(18);
        assertEquals(2, backstagePass.getSellIn());
        assertEquals(34, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_nagetive_1_and_quality_0_given_backstage_pass_sell_in_20_and_quality_5_when_pass_21_days() {
        BackstagePass backstagePass = new BackstagePass(20, 5);
        backstagePass.update(21);
        assertEquals(-1, backstagePass.getSellIn());
        assertEquals(0, backstagePass.getQuality());
    }


}
