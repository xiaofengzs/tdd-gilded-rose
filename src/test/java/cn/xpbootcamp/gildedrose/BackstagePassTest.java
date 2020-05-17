package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassTest {

    @Test
    void should_set_sell_in_1_and_quality_50_given_backstage_pass_sell_in_12_and_quality_49_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(12, 49);
        backstagePass.update(1);
        assertEquals(11, backstagePass.getSellIn());
        assertEquals(50, backstagePass.getQuality());
    }

    @Test
    void should_set_sell_in_11_and_quality_50_given_backstage_pass_sell_in_11_and_quality_50_when_pass_1_days() {
        BackstagePass backstagePass = new BackstagePass(11, 50);
        backstagePass.update(1);
        assertEquals(10, backstagePass.getSellIn());
        assertEquals(50, backstagePass.getQuality());
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
