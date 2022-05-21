package com.company.common.Factory;

import CodeGenerator.Factory.CodeGenerator;
import CodeGenerator.Factory.ICodeGenerator;
import Parser.Factory.ISyntaxTreeGenerator;
import Parser.Factory.SyntaxTreeGenerator;

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

    public ICodeGenerator getCodeGenerator() {return new CodeGenerator();}
}
