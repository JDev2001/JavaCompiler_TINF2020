module CodeGenerator {
    requires DataClasses;
    requires org.objectweb.asm;
    requires SemantikCheck;
    exports BytecodeGenerator;
}