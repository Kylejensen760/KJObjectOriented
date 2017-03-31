public class Mean implements IGrader
{
    protected int[] m_grades;
    protected IFilter m_filter;

    public Mean(int[] grades, IFilter filter)
    {
        m_grades = grades;
        m_filter = filter;
    }

    @Override
    public double grade()
    {
        return average();
    }

    protected double average()
    {
        if (m_filter != null)
        {
            IFilter filter = m_filter;
            m_grades = filter.filter(m_grades);
        }

        double sum = 0.0;
        for (int i : m_grades)
            sum += i;
        return sum/m_grades.length;
    }
}
