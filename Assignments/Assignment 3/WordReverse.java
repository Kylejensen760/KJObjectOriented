public class WordReverse implements ICrypto
{
    private static WordReverse m_instance;
    private WordReverse() {};

    public static WordReverse getInstance()
    {
        if(m_instance == null)
            m_instance = new WordReverse();
        return m_instance;
    }

    @Override
    public String encrypt(String message)
    {
        String encryptedMessage = "";

        Factory f = Factory.getInstance();
        IMessageParser parser = f.createParser(message);

        for(int i = 0; i < parser.getWordCount(); i++)
        {
            for(int j = parser.getWord(i).length(); j > parser.getWord(i).length(); j--)
            {
                encryptedMessage += parser.getChar(j);
            }
        }

        return encryptedMessage;
    }

    @Override
    public String decrypt(String message)
    {
        String encryptedMessage = "";

        Factory f = Factory.getInstance();
        IMessageParser parser = f.createParser(message);

        for(int i = 0; i < parser.getWordCount(); i++)
        {
            parser.getWord(i);
            /*for(int j = word.length(); j >= parser.getWord(i).length(); j--)
            {
                System.out.println(j);
                encryptedMessage += parser.getChar(j);
            }*/
        }

        return encryptedMessage;
    }
}
