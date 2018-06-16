package de.felixklauke.rebekah.network.function;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class LinearCombinationActivationFunctionTest {

    private static final double BIAS = 5;
    private final LinearCombinationActivationFunction activationFunction = new LinearCombinationActivationFunction(BIAS);

    @Test
    public void testProcessOutput() {
        double result = activationFunction.processOutput(20);

        assertEquals(25, result, 0.001);
    }

    @Test
    public void testCalculateDerivative() {
        assertEquals(0, activationFunction.calculateDerivative(Math.PI), 0.001);
    }
}