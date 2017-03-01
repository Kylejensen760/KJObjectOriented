public class Builder
{
    private static Builder m_instance;

    public IDecision buildWizard()
    {
        IDecision snowboard = new Decision("Do you want to buy a snowboard?");
        IDecision boardBefore = new Decision("Have you snowboarded before?");
        IDecision boardExpert = new Decision("Are you an expert?");
        IDecision boardFast = new Decision("Do you like to go fast?");
        IDecision skis = new Decision("Do you want to buy downhill skis?");
        IDecision skiBefore = new Decision("Have you gone skiing before?");
        IDecision skiExpert = new Decision("Are you an expert?");
        IDecision skiJump = new Decision("Do you want to jump?");

        snowboard.setYes(boardBefore);
        snowboard.setNo(skis);

        boardBefore.setYes(boardExpert);
        boardBefore.setNoTerminal("Buy the XG100 model.");

        boardExpert.setYes(boardFast);
        boardExpert.setNoTerminal("Buy the XG200 model.");

        boardFast.setYesTerminal("Buy the XG300 model.");
        boardFast.setNoTerminal("Buy the XG200 model.");

        skis.setYes(skiBefore);
        skis.setNoTerminal("You should try skiing someday. Goodbye.");

        skiBefore.setYes(skiExpert);
        skiBefore.setNoTerminal("Buy the ZR100 model.");

        skiExpert.setYes(skiJump);
        skiExpert.setNoTerminal("Buy the ZR200 model.");

        skiJump.setYesTerminal("Buy the ZR300 model.");
        skiJump.setNoTerminal("Buy the ZR200 model.");

        return snowboard;
    }

    public static Builder getInstance()
    {
        if(m_instance == null)
            m_instance = new Builder();

        return m_instance;
    }
}



//Builds Flow chart, singleton (If yes go to X, if no go to y)
