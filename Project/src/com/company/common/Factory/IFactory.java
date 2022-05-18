package com.company.common.Factory;


import Parser.SyntaxTreeGenerator.ISyntaxTreeGenerator;

public interface IFactory
{

    ISyntaxTreeGenerator getSyntaxTreeGenerator();

}
