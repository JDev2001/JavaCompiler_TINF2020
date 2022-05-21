package com.company.common.Factory;


import CodeGenerator.Factory.ICodeGenerator;
import Parser.Factory.ISyntaxTreeGenerator;

public interface IFactory
{

    ISyntaxTreeGenerator getSyntaxTreeGenerator();

    ICodeGenerator getCodeGenerator();

}
