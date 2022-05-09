package com.company.common.SyntaxTreeGenerator;

import Common.Program;
import java.io.InputStream;

public interface ISyntaxTreeGenerator
{

    Program getSyntaxTree(InputStream stream);

}
