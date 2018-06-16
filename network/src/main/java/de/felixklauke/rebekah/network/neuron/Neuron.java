package de.felixklauke.rebekah.network.neuron;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents a single neuron in the network.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class Neuron {

    /**
     * All connections pointing towards this neuron.
     */
    private final Set<NeuronConnection> inputConnections = new HashSet<>();

    /**
     * All connections from this neuron to another.
     */
    private final Set<NeuronConnection> outputConnections = new HashSet<>();
}
