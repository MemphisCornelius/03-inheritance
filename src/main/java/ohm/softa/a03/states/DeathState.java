package ohm.softa.a03.states;

import ohm.softa.a03.Cat;
import ohm.softa.a03.State;

public class DeathState extends State {
    public DeathState() {
        super(Integer.MAX_VALUE);
    }

    @Override
    public State successor(Cat cat) {
        return this;
    }
}
