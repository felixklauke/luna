package de.felixklauke.luna.network;

import de.felixklauke.luna.network.layer.NeuralNetworkLayer;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class NeuralNetworkTest {

    private final NeuralNetworkLayer inputLayer = new NeuralNetworkLayer();
    private final NeuralNetworkLayer outputLayer = new NeuralNetworkLayer();
    private final List<NeuralNetworkLayer> hiddenLayers = Collections.singletonList(new NeuralNetworkLayer());

    private NeuralNetwork neuralNetwork;

    @Before
    public void setUp() {
        neuralNetwork = new NeuralNetwork(inputLayer, hiddenLayers, outputLayer);
    }

    @Test
    public void testGetHiddenLayers() {
        assertEquals(hiddenLayers, neuralNetwork.getHiddenLayers());
    }

    @Test
    public void testGetInputLayer() {
        assertEquals(inputLayer, neuralNetwork.getInputLayer());
    }

    @Test
    public void testGetOutputLayer() {
        assertEquals(outputLayer, neuralNetwork.getOutputLayer());
    }
}