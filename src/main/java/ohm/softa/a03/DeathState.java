package ohm.softa.a03;

public class DeathState extends State{
    protected DeathState() {
        super(0,-1);
    }

    @Override
    State successor(Cat cat) {
        return this;
    }
}
