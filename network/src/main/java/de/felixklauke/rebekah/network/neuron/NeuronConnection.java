package de.felixklauke.rebekah.network.neuron;

/**
 * The connection between two neurons holding its weight.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class NeuronConnection {

    /**
     * The neuron where the connection is coming from.
     */
    private final Neuron source;

    /**
     * The neuron the connection is pointing at.
     */
    private final Neuron destination;

    /**
     * The weight of the connection.
     */
    private final double weight;

    /**
     * Create a new connection between two neurons with a given weight.
     *
     * @param source      The source neuron.
     * @param destination The destination neuron.
     * @param weight      The weight of the connection.
     */
    public NeuronConnection(Neuron source, Neuron destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    /**
     * Get the weight of the connection.
     *
     * @return The weight.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Get the neuron the connection is pointing at.
     *
     * @return The destination neuron.
     */
    public Neuron getDestination() {
        return destination;
    }

    /**
     * Get the neuron the connection is coming from.
     *
     * @return The source neuron.
     */
    public Neuron getSource() {
        return source;
    }
}
