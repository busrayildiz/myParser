package org.csystem.samples.myParser;

import java.util.Scanner;

public class KeyboardSource implements ISource {

    private StringSource m_stringSource;
    private Scanner m_kb;
    private String m_message;
    private Boolean m_reset;

    {
        m_kb = new Scanner(System.in);
    }

    private void getFromKeyboard()
    {
        System.out.println(m_message);
        m_stringSource = new StringSource(m_kb.nextLine());
    }

    public KeyboardSource () {this("input your text");}
    public KeyboardSource (String msg) {
        m_message = msg;
        this.getFromKeyboard();
    }


    @Override
    public int getNextChar()
    {
        return m_stringSource.getNextChar();
    }

    @Override
    public void reset()
    {
        if (m_reset)
            getFromKeyboard();

        m_reset=true;

    }
}
