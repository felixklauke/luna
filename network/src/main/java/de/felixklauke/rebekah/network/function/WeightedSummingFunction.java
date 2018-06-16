package de.felixklauke.rebekah.network.function;

import de.felixklauke.rebekah.network.neuron.NeuronConnection;

import java.util.List;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class WeightedSummingFunction implements InputSummingFunction {

    @Override
    public double processOutput(List<NeuronConnection> connections) {
        return connections.stream()
                .mapToDouble(NeuronConnection::getWeightedInput)
                .sum();
    }
}
