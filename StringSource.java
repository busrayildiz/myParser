package org.csystem.samples.myParser;

public class StringSource implements ISource {

    private String m_str;
    private int m_index;

    public StringSource (String str){ m_str = str;}

    @Override
    public int getNextChar()
    {
        return m_index == m_str.length() ? -1 : m_str.charAt(m_index++);
    }

    @Override
    public void reset()
    {
        m_index = 0;
    }
}
