package com.company.common.Factory;

import com.company.common.SyntaxTreeGenerator.SyntaxTreeGenerator;

public class Factory implements IFactory
{
    private Factory()
    {

    }

    public static Factory getFactory()
    {
        return new Factory();
    }

    public SyntaxTreeGenerator getSyntaxTreeGenerator()
    {
        return new SyntaxTreeGenerator();
    }


}