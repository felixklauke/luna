package de.felixklauke.rebekah.network.function;

import de.felixklauke.rebekah.network.neuron.NeuronConnection;

import java.util.List;

/**
 * The signal collector of a neuron.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface InputSummingFunction {

    /**
     * Process the output of the input neurons.
     *
     * @param connections The neutrons input connections.
     *
     * @return The resulting input.
     */
    double processOutput(List<NeuronConnection> connections);
}
