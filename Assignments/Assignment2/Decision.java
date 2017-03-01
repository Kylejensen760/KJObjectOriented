import java.util.Scanner;

public class Decision implements IDecision
{
    private String m_question;
    private IDecision m_yes;
    private IDecision m_no;
    private String m_yesTerminal;
    private String m_noTerminal;

    public Decision(String question)
    {
        m_question = question;
    }

    @Override
    public void setYes(IDecision yes)
    {
        m_yes = yes;
    }

    @Override
    public void setNo(IDecision no)
    {
        m_no = no;
    }

    @Override
    public void setYesTerminal(String terminal)
    {
        m_yesTerminal = terminal;
    }

    @Override
    public void setNoTerminal(String terminal)
    {
        m_noTerminal = terminal;
    }

    @Override
    public IDecision ask()
    {
        System.out.printf("%n%s ", m_question);
        String input = "";
        Scanner in = new Scanner(System.in);

        input = in.next();

        if(input.equals("yes"))
        {
            if(m_yes != null)
                return m_yes;
            else
            {
                System.out.printf("%s%n", m_yesTerminal);
                return null;
            }
        }
        else if (input.equals("no"))
        {
            if(m_no != null)
                return m_no;
            else
            {
                System.out.printf("%n%s%n", m_noTerminal);
                return null;
            }
        }
        else
        {
            System.out.println("Invalid answer. Goodbye. " + input);
            return null;
        }
    }
}
