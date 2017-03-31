public abstract class AbstractOrderAlg implements IDiffAlg
{
    public int difference(String seq1, String seq2)
    {
        int penalty = 0;
        String[] splitSeq1 = seq1.split("");
        String[] splitSeq2 = seq2.split("");

        for(int i = 0; i < splitSeq1.length; i++)
        {
            if(splitSeq1[i].equals(splitSeq2[i]))
                penalty += 0;
            else
                penalty += 1;
        }
        return penalty;
    }

    abstract protected int getPenalty(char ch1);
}
