package de.felixklauke.luna.network.neuron;

import de.felixklauke.luna.network.function.ActivationFunction;
import de.felixklauke.luna.network.function.IdentityActivationFunction;
import de.felixklauke.luna.network.function.InputSummingFunction;
import de.felixklauke.luna.network.function.WeightedSummingFunction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class NeuronTest {

    private InputSummingFunction summingFunction = new WeightedSummingFunction();
    private ActivationFunction activationFunction = new IdentityActivationFunction();
    private Neuron neuron;

    @Before
    public void setUp() {
        neuron = new Neuron(summingFunction, activationFunction);
    }

    @Test
    public void testCalculateOutput() {
        double output = neuron.calculateOutput();

        assertEquals(0, output, 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testAddInputConnectionInvalid() {
        neuron.addInputConnection(new NeuronConnection(neuron, new Neuron(summingFunction, activationFunction), 10));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddOutputConnectionInvalid() {
        neuron.addOutputConnection(new NeuronConnection(new Neuron(summingFunction, activationFunction), neuron, 10));
    }
}