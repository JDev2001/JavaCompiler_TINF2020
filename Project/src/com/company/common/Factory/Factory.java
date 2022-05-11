package com.company.common.Factory;

import SyntaxTreeGenerator.ISyntaxTreeGenerator;
import SyntaxTreeGenerator.SyntaxTreeGenerator;

public class Factory implements IFactory
{
    private Factory()
    {

    }

    public static Factory getFactory()
    {
        return new Factory();
    }

    public ISyntaxTreeGenerator getSyntaxTreeGenerator()
    {
        return new SyntaxTreeGenerator();
    }



}
