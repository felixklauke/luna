package de.felixklauke.rebekah.network.function;

/**
 * Represents a differentiable function.
 *
 * @author Felix Klauke <info@felix-klauke.de>
 */
public interface DifferentiableFunction {

    /**
     * Process the total input.
     *
     * @param totalInput The total input.
     *
     * @return function's derivative calculated based on the total input
     */
    double calculateDerivative(double totalInput);
}
