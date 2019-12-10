package org.csystem.samples.myParser;

import org.csystem.util.StringUtil;

public class Parser {
    private ISource m_ISource;

    private String getString(){
        String str = "";

        int ch;

        while((ch=m_ISource.getNextChar())!=-1)
            str += (char)ch;

        return str;
    }

    public Parser ( ISource ISource) {m_ISource = ISource;}

    public ISource getISource(){return m_ISource;}

    public void setSource (ISource ISource) {m_ISource = ISource;}

    public Boolean isPangramTR(){
        m_ISource.reset();
        return StringUtil.isPangramTR(getString());
    }

    public Boolean isPangramEN(){
        m_ISource.reset();
        return StringUtil.isPangramEN(getString());
    }
}
