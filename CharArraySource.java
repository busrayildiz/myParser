package org.csystem.samples.myParser;

public class CharArraySource implements ISource {
    private char [] m_chars;
    private int m_index;


    public CharArraySource(String str)
    {
        this(str.toCharArray());
    }

    public CharArraySource(char  [] chars)
    {
        m_chars = chars;
    }

    @Override
    public int getNextChar()
    {
        return m_index==m_chars.length ? -1 : m_chars[m_index++];
    }

    @Override
    public void reset()
    {
        m_index = 0 ;
    }
}
