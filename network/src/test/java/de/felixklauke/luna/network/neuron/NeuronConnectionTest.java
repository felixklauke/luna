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
public class NeuronConnectionTest {

    private final InputSummingFunction inputSummingFunction = new WeightedSummingFunction();
    private final ActivationFunction activationFunction = new IdentityActivationFunction();

    private static final double WEIGHT = 20;
    private Neuron sourceNeuron;
    private Neuron destinationNeuron;
    private NeuronConnection neuronConnection;

    @Before
    public void setUp() {
        sourceNeuron = new Neuron(inputSummingFunction, activationFunction);
        destinationNeuron = new Neuron(inputSummingFunction, activationFunction);

        neuronConnection = new NeuronConnection(sourceNeuron, destinationNeuron, WEIGHT);
    }

    @Test
    public void testGetSource() {
        assertEquals(sourceNeuron, neuronConnection.getSource());
    }

    @Test
    public void testGetDestination() {
        assertEquals(destinationNeuron, neuronConnection.getDestination());
    }

    @Test
    public void testGetWeight() {
        assertEquals(WEIGHT, neuronConnection.getWeight(), 0.001);
    }
}