public class Main
{
    public static void main (String[] args)
    {
        Main m = new Main();
        m.go();
    }
    public void go()
    {

    }

    public List<IStatAlg> AddAlgs()
    {
        List<IStatAlg> algs = new Arraylist<IStatAlg>();
        algs.add(new Sum(1,2,3));
        algs.add(new Average(1,2,3));
        algs.add(new MultiplyByTwo(3));
        //algs.add(new CompositeAlg)
    }

    public interface IStatAlg
    {
        public list<Double> process(List<Double>);

    }

    public class Sum implements IStatAlg
    {
        @Override
        public list<Double> process(List<Double>)
        {
            for(Double l : process)
            {
                total += t;
            }
        }

    }

    public class MultiplyByTwo implements IStatAlg
    {
        @Override
        public list<Double> process(List<Double>){
            List<Double> ret = new List<Double>;
		    for (double d : list)
		    {
			    ret.add(d*2)
		    }
		    return ret;
            }
    }

    public class CompositeAlg implements IStatAlg
    {
        CompositeAlg c = new CompositeAlg();
        @Override
        public list<Double> process(List<Double>)
        {

        }

        public void addAlg(iStatAlg alg)
        {

        }
    }

    public class Average implements IStatAlg
    {
        @override
        public List<Double> process(List <Double> list)
	    {
    		double sum = 0;
    		for(double d : list)
    			sum += i;
    		double result = sum/list.size();
    		List<Double> ret = new List<Double>();
		    ret.add(result);
		    return ret;
	    }
    }
}
