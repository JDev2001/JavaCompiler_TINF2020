module Tests {
    requires DataClasses;
    requires antlr;
    requires Parser;
    requires org.testng;
    requires org.junit.jupiter.api;
    requires CodeGenerator;
    exports  ParserTests;
}