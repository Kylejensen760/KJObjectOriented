public class CountAlg implements IDiffAlg
{
    private static CountAlg m_instance;
    public static CountAlg getInstance()
    {
        if(m_instance == null)
            m_instance = new CountAlg();
        return m_instance;
    }

    private CountAlg() {};

    public int difference(String seq1, String seq2)
    {
        int a = 0;
        int g = 0;
        int c = 0;
        int t = 0;
        int total = 0;
        String[] splitSeq1 = seq1.split("");
        String[] splitSeq2 = seq2.split("");

        for(int i = 0; i < splitSeq1.length; i++)
        {
            if(splitSeq1[i].equals(splitSeq2[i])
            {
                if(splitSeq1[i].equals("A"))
                    a++;
                else if(splitSeq1[i].equals("G"))
                    g++;
                else if(splitSeq1[i].equals("C"))
                    c++
                else if(splitSeq1[i].equals("T"))
                    t++;
            }
        }
        total = a + g + c + t;
        return total;
    }
}
