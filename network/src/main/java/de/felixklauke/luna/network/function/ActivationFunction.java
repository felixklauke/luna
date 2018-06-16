package de.felixklauke.luna.network.function;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface ActivationFunction extends DifferentiableFunction {

    /**
     * Process the sum of the input neurons output.
     *
     * @param totalInput The total input.
     *
     * @return The result.
     */
    double processOutput(double totalInput);
}
