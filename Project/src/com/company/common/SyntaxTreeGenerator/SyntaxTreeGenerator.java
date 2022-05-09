package com.company.common.SyntaxTreeGenerator;

import Common.Program;
import java.io.InputStream;

public class SyntaxTreeGenerator implements ISyntaxTreeGenerator
{
    @Override
    public Program getSyntaxTree(InputStream stream)
    {
        return new Program();
    }
}
