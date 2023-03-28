package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class DigestingState extends State {

    private final int alreadyAwake;

    public DigestingState(int duration, int alreadyAwake) {
        super(duration);
        this.alreadyAwake = alreadyAwake;
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(cat.getAwake() - super.getTime() - alreadyAwake);
    }
}
