package de.felixklauke.rebekah.network.layer;

import de.felixklauke.rebekah.network.function.IdentityActivationFunction;
import de.felixklauke.rebekah.network.function.WeightedSummingFunction;
import de.felixklauke.rebekah.network.neuron.Neuron;
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