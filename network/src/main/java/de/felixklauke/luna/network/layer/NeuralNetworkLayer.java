package de.felixklauke.luna.network.layer;

import de.felixklauke.luna.network.neuron.Neuron;

import java.util.ArrayList;
import java.util.List;

/**
 * The object representing a single network layer in a multi layer architecture that contains a number of neurons.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class NeuralNetworkLayer {

    /**
     * The neurons of this layer.
     */
    private final List<Neuron> neurons = new ArrayList<>();

    /**
     * Get all neurons of the layer.
     *
     * @return The neurons.
     */
    public List<Neuron> getNeurons() {
        return neurons;
    }

    /**
     * Add a neuron to this layer.
     *
     * @param neuron The neuron.
     *
     * @return If the neuron could be added successfully.
     */
    public boolean addNeuron(Neuron neuron) {
        return neurons.add(neuron);
    }
}
