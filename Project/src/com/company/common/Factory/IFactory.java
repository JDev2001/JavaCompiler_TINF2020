package com.company.common.Factory;


import CodeGenerator.Factory.ICodeGenerator;
import Parser.Factory.ISyntaxTreeGenerator;
import SemanticCheck.Factory.SemantikCheck;

public interface IFactory
{

    ISyntaxTreeGenerator getSyntaxTreeGenerator();

    SemantikCheck getSemantikCheck();

    ICodeGenerator getCodeGenerator();

}
