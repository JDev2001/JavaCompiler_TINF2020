package com.company.common.Factory;

import CodeGenerator.Factory.CodeGenerator;
import CodeGenerator.Factory.ICodeGenerator;
import Parser.Factory.ISyntaxTreeGenerator;
import Parser.Factory.SyntaxTreeGenerator;
import SemanticCheck.Factory.SemantikCheck;
import SemanticCheck.Factory.SemantikCheckImpl;

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

    @Override
    public SemantikCheck getSemantikCheck() {
        return new SemantikCheckImpl();
    }

    public ICodeGenerator getCodeGenerator() {return new CodeGenerator();}
}
