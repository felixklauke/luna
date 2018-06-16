package de.felixklauke.rebekah.network;

import de.felixklauke.rebekah.network.layer.NeuralNetworkLayer;

import java.util.List;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class NeuralNetwork {

    /**
     * The overall input layer.
     */
    private final NeuralNetworkLayer inputLayer;

    /**
     * The internal hidden layers.
     */
    private final List<NeuralNetworkLayer> hiddenLayers;

    /**
     * The output layer.
     */
    private final NeuralNetworkLayer outputLayer;

    /**
     * Create a new neural network by its underlying layers.
     *
     * @param inputLayer   The input layer.
     * @param hiddenLayers The hidden layers.
     * @param outputLayer  The output layer.
     */
    public NeuralNetwork(NeuralNetworkLayer inputLayer, List<NeuralNetworkLayer> hiddenLayers, NeuralNetworkLayer outputLayer) {
        this.inputLayer = inputLayer;
        this.hiddenLayers = hiddenLayers;
        this.outputLayer = outputLayer;
    }

    /**
     * Get the hidden layers.
     *
     * @return The hidden layers.
     */
    public List<NeuralNetworkLayer> getHiddenLayers() {
        return hiddenLayers;
    }

    /**
     * Get the input layer.
     *
     * @return The input layer.
     */
    public NeuralNetworkLayer getInputLayer() {
        return inputLayer;
    }

    /**
     * Get the output layer.
     *
     * @return The output layer.
     */
    public NeuralNetworkLayer getOutputLayer() {
        return outputLayer;
    }
}
