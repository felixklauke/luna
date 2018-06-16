package de.felixklauke.rebekah.network.function;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class IdentityActivationFunction implements ActivationFunction {

    /**
     * The constant derivative of an identity function is always 1.
     */
    private static final double DERIVATIVE = 1D;

    @Override
    public double processOutput(double totalInput) {
        return totalInput;
    }

    @Override
    public double calculateDerivative(double totalInput) {
        return DERIVATIVE;
    }
}
