package de.felixklauke.rebekah.network.function;

import de.felixklauke.rebekah.network.neuron.Neuron;
import de.felixklauke.rebekah.network.neuron.NeuronConnection;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class InputSummingFunctionTest {

    private final ActivationFunction activationFunction = new IdentityActivationFunction();
    private final InputSummingFunction summingFunction;
    private List<NeuronConnection> neuronConnections = new ArrayList<>();

    public InputSummingFunctionTest(InputSummingFunction summingFunction) {
        this.summingFunction = summingFunction;
    }

    @Before
    public void setUp() {
        Neuron neuron = new Neuron(summingFunction, activationFunction);
        Neuron neuron1 = new Neuron(summingFunction, activationFunction);

        NeuronConnection neuronConnection = new NeuronConnection(neuron, neuron1, 10);
        neuron.addOutputConnection(neuronConnection);
        neuron1.addInputConnection(neuronConnection);

        Neuron neuron2 = new Neuron(summingFunction, activationFunction);
        Neuron neuron3 = new Neuron(summingFunction, activationFunction);

        NeuronConnection neuronConnection1 = new NeuronConnection(neuron, neuron2, 3);
        neuron.addOutputConnection(neuronConnection1);
        neuron2.addInputConnection(neuronConnection1);

        NeuronConnection neuronConnection2 = new NeuronConnection(neuron1, neuron2, 4);
        neuron1.addOutputConnection(neuronConnection2);
        neuron2.addInputConnection(neuronConnection2);

        NeuronConnection neuronConnection3 = new NeuronConnection(neuron2, neuron3, 3);
        neuron2.addOutputConnection(neuronConnection3);
        neuron3.addInputConnection(neuronConnection3);

        neuronConnections = Arrays.asList(neuronConnection, neuronConnection1, neuronConnection2, neuronConnection3);
    }

    public List<NeuronConnection> getNeuronConnections() {
        return neuronConnections;
    }
}
