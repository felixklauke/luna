package de.felixklauke.luna.network.function;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class WeightedSummingFunctionTest extends InputSummingFunctionTest {

    private static final InputSummingFunction WEIGHTED_SUMMING_FUNCTION = new WeightedSummingFunction();

    public WeightedSummingFunctionTest() {
        super(WEIGHTED_SUMMING_FUNCTION);
    }

    @Test
    public void testProcessOutput() {
        assertEquals(0, WEIGHTED_SUMMING_FUNCTION.processOutput(getNeuronConnections()), 0.001);
    }
}