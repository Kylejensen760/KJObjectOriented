public class Builder3 implements IBuilder {

	private static Builder3 m_instance;

	@Override
	public MrPotatoHead makePotatoHead()
	{
        return new MrPotatoHead(22, 12, new AngleHead(),
                new SmallEyes(), new SimpleNose(), new Happy());
	}

	public static Builder3 getPotatoHead()
	{
		if (m_instance == null)
			m_instance = new Builder3();

		return m_instance;
	}

	private Builder3()
	{}

}
