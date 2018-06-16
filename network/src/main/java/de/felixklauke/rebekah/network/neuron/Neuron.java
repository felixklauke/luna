package de.felixklauke.rebekah.network.neuron;

import de.felixklauke.rebekah.network.function.ActivationFunction;
import de.felixklauke.rebekah.network.function.InputSummingFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single neuron in the network.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class Neuron {

    /**
     * All connections pointing towards this neuron.
     */
    private final List<NeuronConnection> inputConnections = new ArrayList<>();

    /**
     * All connections from this neuron to another.
     */
    private final List<NeuronConnection> outputConnections = new ArrayList<>();

    /**
     * The functions the sums up the input of this neuron.
     */
    private final InputSummingFunction inputSummingFunction;

    /**
     * The activation function that will accept the total input on output calculation.
     */
    private final ActivationFunction activationFunction;

    /**
     * Create a new neuron by its underlying functions.
     *
     * @param inputSummingFunction The input summing function.
     * @param activationFunction   The activation function.
     */
    public Neuron(InputSummingFunction inputSummingFunction, ActivationFunction activationFunction) {
        this.inputSummingFunction = inputSummingFunction;
        this.activationFunction = activationFunction;
    }

    public double calculateOutput() {
        double totalInput = inputSummingFunction.processOutput(inputConnections);

        return activationFunction.processOutput(totalInput);
    }

    public void addOutputConnection(NeuronConnection neuronConnection) {
        if (neuronConnection.getSource() != this) {
            throw new IllegalStateException("Invalid connection, source didn't match.");
        }

        outputConnections.add(neuronConnection);
    }

    public void addInputConnection(NeuronConnection neuronConnection) {
        if (neuronConnection.getDestination() != this) {
            throw new IllegalStateException("Invalid connection, destination didn't match.");
        }

        inputConnections.add(neuronConnection);
    }
}
