package com.company.common.SyntaxTreeGenerator;

import Common.Program;
import org.antlr.v4.runtime.CharStream;

import java.io.IOException;
import java.io.InputStream;

public interface ISyntaxTreeGenerator
{

    Program getSyntaxTree(CharStream inputstream) throws IOException;

}
