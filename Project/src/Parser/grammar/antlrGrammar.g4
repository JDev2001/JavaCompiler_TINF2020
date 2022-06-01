grammar antlrGrammar;

programm: Identifier? jClass+;

jClass: AccessModifier? 'class' Identifier classBody;

//Class
classBody: CurlyLBracket (methodDeclaration|fieldDeclaration|constructor)* CurlyRBracket;

//Class objects
constructor: AccessModifier? Identifier LBracket nMethodParameters RBracket block;
methodDeclaration: AccessModifier? methodType Identifier LBracket nMethodParameters RBracket block;
fieldDeclaration: AccessModifier?  type Identifier (Comma Identifier)* (Equal expression)? Semicolon;

//Method things
//Type
type: 'int'|'char'|'boolean'| Identifier;
methodType: 'void' | type;
//Methodparameters
nMethodParameters: (methodParameter)? | methodParameter (Comma methodParameter)+;
methodParameter: type Identifier;
//Method Block
block: CurlyLBracket (statement)* CurlyRBracket;

//Statements
statement: block | varDeclaration Semicolon | ifelse | jWhile | jReturn Semicolon | statementExpressions Semicolon;

//localVar
//varDeclaration : type Identifier (Comma Identifier)* expression;
varDeclaration: type Identifier (Comma Identifier)* ((Equal|PlusEqual|MinusEqual) expression)?; //-> Warum was soll das?

//something with if
//ifelse: jIf jElseIf* jElse?;
ifelse: jIf jElse?;
jIf: If LBracket expression RBracket block;
//jElseIf: Else If LBracket expression RBracket block; -> if else( ){ }
jElse: Else block;

//localVars
jWhile: 'while' LBracket expression RBracket block;
jReturn: 'return' expression;

//Statements
statementExpressions: assign | methodCall | jNew ;
instVar: (This Dot Identifier) | ((This Dot)? (Identifier Dot)+ Identifier);
this: This Dot;

//Statement Expressions
assign: (instVar | Identifier) assignOperator expression;
assignOperator: Equal | PlusEqual | MinusEqual;
methodCall: methodCallPrefix? (Identifier LBracket nArguments RBracket Dot)* (Identifier LBracket nArguments RBracket);
//methodCall: methodCallPrefix? (Identifier LBracket nArguments RBracket Dot)* (Identifier LBracket nArguments RBracket);
jNew: 'new' Identifier LBracket nArguments RBracket;

//Method Call
methodCallPrefix: (this|instVar|Identifier Dot); //this??
nArguments: expression? | expression (Comma expression)*; // | instVar

//In all other
expression:  basicexpressions | expression operators expression;

//Expressions
//binary: basicexpressions operators basicexpressions; -> so hats mal funktioniert
//binary: expression operators expression; versuch -> ist aber Linksrekursiv
//binary: basicexpressions (operators basicexpressions)+; -> mal schauen
basicexpressions: baseType | statementExpressions | unary | LBracket expression RBracket ;
//Hier war mal instvar

//Base
unary:  unaryOperator expression;
unaryOperator: NotOperator|OpIdentifier;
baseType: Identifier | type | JBoolean | JNull | This | JCharacter | Const | Super ; //JString = WS ??? Vorher stand bei ws JString
operators: LogicalOperator|Comperator|AddSubOperator|PointSlashOperator;

AccessModifier: 'public' | 'protected' | 'private';
JBoolean: 'true'|'false';
JNull: 'null';
Super: 'super';
This: 'this';
If: 'if';
Else: 'else';
Equal: '=';
PlusEqual: '+=';
MinusEqual: '-=';
Comperator: '=='|'!='|'>='|'<='|'>'|'<';
NotOperator: '!';
OpIdentifier: '++'|'--';
PointSlashOperator: '*'|'/';
AddSubOperator: '+'|'-'|'%';
LogicalOperator: '&&'|'||';
LBracket:'(';
RBracket:')';
CurlyLBracket:'{';
CurlyRBracket:'}';
Dot: '.';
Comma: ',';
Semicolon: ';';
Identifier: [A-Za-z][A-Za-z0-9]*;
JCharacter: '\'' [A-Za-z]'\'';
Const: [0-9]+;

WS: ([ \t\r\n]+) -> skip;
Comment: '/*' .*? '*/' -> skip;
LineComment: '//' ~[\r\n]* -> skip;
