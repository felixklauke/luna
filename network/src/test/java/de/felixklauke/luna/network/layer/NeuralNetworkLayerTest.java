package de.felixklauke.luna.network.layer;

import de.felixklauke.luna.network.function.IdentityActivationFunction;
import de.felixklauke.luna.network.function.WeightedSummingFunction;
import de.felixklauke.luna.network.neuron.Neuron;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class NeuralNetworkLayerTest {

    private NeuralNetworkLayer neuralNetworkLayer;

    @Before
    public void setUp() {
        neuralNetworkLayer = new NeuralNetworkLayer();
    }

    @Test
    public void testGetNeurons() {
        assertEquals(0, neuralNetworkLayer.getNeurons().size());
    }

    @Test
    public void testAddNeuron() {
        Neuron neuron = new Neuron(new WeightedSummingFunction(), new IdentityActivationFunction());
        boolean result = neuralNetworkLayer.addNeuron(neuron);

        assertTrue(result);
        assertTrue(neuralNetworkLayer.getNeurons().contains(neuron));
    }
}