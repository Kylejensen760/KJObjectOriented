public class BuilderMain
{
    public static void main(String[] args)
    {
    	IBuilder builder1 = new Builder1();
    	builder1.makePotatoHead().draw();

        IBuilder builder2 = new Builder2();
    	builder2.makePotatoHead().draw();

        //IBuilder builder3 = new Builder3();
    	//builder3.getInstance().makePotatoHead().draw();
        Builder3.getPotatoHead().makePotatoHead().draw();
    }
}
