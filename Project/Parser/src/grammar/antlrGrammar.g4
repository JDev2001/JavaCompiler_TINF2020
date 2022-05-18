grammar antlrGrammar;

programm: Identifier? jClass+;

jClass: 'class' Identifier classBody;

//Class
classBody: CurlyLBracket (methodDeclaration|fieldDeclaration|constructor)* CurlyRBracket;

//Class objects
constructor: AccessModifier? Identifier LBracket nMethodParameters RBracket block;
methodDeclaration: AccessModifier? methodType Identifier LBracket nMethodParameters RBracket block;
fieldDeclaration: AccessModifier?  type Identifier (Comma Identifier)* (Equal expression)? Semicolon;

//Method things
//Type
type: 'int'|'char'|'boolean'| Identifier;
methodType: 'void'|type;
//Methodparameters
nMethodParameters: (methodParameter)? | methodParameter (Comma methodParameter)+;
methodParameter: type Identifier;
//Method Block
block: CurlyLBracket (statement)* CurlyRBracket;

//Statements
statement: block | varDeclaration Semicolon | ifelse | jWhile | jReturn Semicolon | statementExpressions Semicolon;

//localVar
varDeclaration: type Identifier (Comma Identifier)* ((Equal|PlusEqual|MinusEqual) expression)?;

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

//Statement Expressions
assign: (instVar | Identifier) (Equal|PlusEqual|MinusEqual) expression;
methodCall: methodCallPrefix? (Identifier LBracket nArguments RBracket Dot)* (Identifier LBracket nArguments RBracket);
jNew: 'new' Identifier LBracket nArguments RBracket;

//Method Call
methodCallPrefix: (instVar|Identifier Dot);
nArguments: expression? | expression (Comma expression)* | instVar;

//In all other
expression:  basicexpressions | binary;

//Expressions
binary: basicexpressions (operators basicexpressions)+;
basicexpressions:  baseType | instVar | Identifier | statementExpressions | unary | LBracket expression RBracket ;
instVar:  (This Dot Identifier) | ((This Dot)? (Identifier Dot)+ Identifier); //Hier geändert -> passt????

//Base
unary:  NotOperator expression;
baseType: JBoolean | JNull | This | WS | JCharacter | JInteger | Super; //JString = WS ??? Vorher stand bei ws JString
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
JInteger: [0-9]+;

WS: ([ \t\r\n]+) -> skip;
Comment: '/*' .*? '*/' -> skip;
LineComment: '//' ~[\r\n]* -> skip;
