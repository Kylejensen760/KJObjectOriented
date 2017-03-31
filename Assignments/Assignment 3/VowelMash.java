public class VowelMash implements ICrypto
{
    private static VowelMash m_instance;
    private VowelMash() {};

    public static VowelMash getInstance()
    {
        if(m_instance == null)
            m_instance = new VowelMash();
        return m_instance;
    }

    @Override
    public String encrypt(String message)
    {
        String encryptedMessage = "";

        Factory f = Factory.getInstance();
        IMessageParser parser = f.createParser(message);
        
        for(int i = 0; i < parser.getCharCount(); i++)
        {
            if(parser.getChar(i) == 'A')
            {
                encryptedMessage += "E";
            }
            else if(parser.getChar(i) =='E')
            {
                encryptedMessage += "I";
            }
            else if(parser.getChar(i) == 'I')
            {
                encryptedMessage += "O";
            }
            else if(parser.getChar(i) == 'O')
            {
                encryptedMessage += "U";
            }
            else if(parser.getChar(i) == 'U')
            {
                encryptedMessage += "A";
            }
            else
            {
                encryptedMessage += parser.getChar(i);
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

        for(int i = 0; i < parser.getCharCount(); i++)
        {
            if(parser.getChar(i) == 'A')
            {
                encryptedMessage += "U";
            }
            else if(parser.getChar(i) =='E')
            {
                encryptedMessage += "A";
            }
            else if(parser.getChar(i) == 'I')
            {
                encryptedMessage += "E";
            }
            else if(parser.getChar(i) == 'O')
            {
                encryptedMessage += "I";
            }
            else if(parser.getChar(i) == 'U')
            {
                encryptedMessage += "O";
            }
            else
            {
                encryptedMessage += parser.getChar(i);
            }
        }

        return encryptedMessage;
    }
}
