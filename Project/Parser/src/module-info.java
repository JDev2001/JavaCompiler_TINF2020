module Parser {
    requires DataClasses;
    requires antlr;
    exports generated;
    exports SyntaxTreeGenerator;
    exports adapter.GeneralAdapter;
    exports adapter.FieldAdapter;
    exports adapter.MethodAdapter;
}