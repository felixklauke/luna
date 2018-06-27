package de.felixklauke.luna.network.function;

/**
 * A simple activation function that adds a constant bias to the total input.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class LinearCombinationActivationFunction implements ActivationFunction {

    /**
     * The bias that will be added to the total input.
     */
    private final double bias;

    /**
     * Create a new linear combination activation function by its bias.
     *
     * @param bias The bias.
     */
    public LinearCombinationActivationFunction(double bias) {
        this.bias = bias;
    }

    @Override
    public double processOutput(double totalInput) {
        return totalInput + bias;
    }

    @Override
    public double calculateDerivative(double totalInput) {
        return 0;
    }
}
