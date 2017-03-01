public class FactoryMain
{
    public static void main(String[] args)
    {
        //IBodyPartFactory factory = new HappyHeadFactory();
        IBodyPartFactory factory = new SadHeadFactory();
        MrPotatoHead fred = new MrPotatoHead(22, 12,
                factory.createHead(),
                factory.createEyes(),
                factory.createNose(),
                factory.createMouth());
        fred.draw();

        IBodyPartFactory testFactory = new TestHeadFactory();
        MrPotatoHead tom = new MrPotatoHead(22,12,
                testFactory.createHead(),
                testFactory.createEyes(),
                testFactory.createNose(),
                testFactory.createMouth());
        tom.draw();
    }
}
