public class TestHeadFactory implements IBodyPartFactory
{
    @Override
    public IBodyPart createEyes()
    {
        return new SmallEyes();
    }

    @Override
    public IBodyPart createNose()
    {
        return new SimpleNose();
    }

    @Override
    public IBodyPart createMouth()
    {
        return new Happy();
    }

    @Override
    public IBodyPart createHead()
    {
        return new AngleHead();
    }

}
