import java.util.List;
import java.util.Arrays;

public class MessageParser implements IMessageParser
{
    private List<String> m_words;
    private String m_msg;

    public MessageParser(String msg)
    { m_msg = msg; }

    @Override
    public int getCharCount()
    {
        int count = 0;

        String[] characters = m_msg.split("", -1);

        count = (characters.length - 1);

        return count;
    }

    @Override
    public int getWordCount()
    {
        int count = 0;

        String[] words = m_msg.split(" ", -1);
        for (String s : words)
            count++;

        return count;
    }

    @Override
    public char getChar(int i)
    {
        //m_msg.replaceAll("\\s", "");

        char c = m_msg.charAt(i);
        return c;
    }

    @Override
    public String getWord(int i)
    {
        String[] words = m_msg.split(" ", -1);
        for (String s : words)
        {
            m_words.add(s);
            System.out.println(s);
        }

        String word = m_words.get(i);
        return word;
    }
}
