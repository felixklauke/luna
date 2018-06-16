package de.felixklauke.rebekah.network.function;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class IdentityActivationFunctionTest {

    private IdentityActivationFunction activationFunction;

    @Before
    public void setUp() {
        activationFunction = new IdentityActivationFunction();
    }

    @Test
    public void testProcessOutput() {
        assertEquals(Math.PI, activationFunction.processOutput(Math.PI), 0.001);
    }

    @Test
    public void testCalculateDerivative() {
        assertEquals(1, activationFunction.calculateDerivative(Math.PI), 0.001);
    }
}