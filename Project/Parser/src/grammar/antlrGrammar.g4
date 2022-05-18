grammar antlrGrammar;

programm: Identifier? jClass+;

jClass: 'class' Identifier classBody;

//Class
classBody: CurlyLBracket (methodDeclaration|fieldDeclaration|constructor)* CurlyRBracket;

//Class objects
methodDeclaration: AccessModifier? methodType Identifier LBracket nMethodParameters RBracket block;
fieldDeclaration: AccessModifier?  type Identifier (Comma Identifier)* (Equal expression)? Semicolon;
constructor: AccessModifier? Identifier LBracket nMethodParameters RBracket block;

//Method

//Type
type: 'int'|'char'|'boolean'| Identifier;
methodType: 'void'|type;
//Methodparameters
nMethodParameters: (methodParameter)? | methodParameter (Comma methodParameter)+;
methodParameter: type Identifier;
//Method Block
block: CurlyLBracket (statement)* CurlyRBracket;



nArguments: expression? | expression (Comma expression)* | instVar;
expression:  basicexpressions | binary;
basicexpressions:  baseType | instVar | Identifier | statementExpressions | unary | LBracket expression RBracket ;
instVar:  This Dot Identifier|(This Dot)? (Identifier Dot)+ Identifier;

statementExpressions: assign | jNew | methodCall;

assign: (instVar | Identifier) (Equal|PlusEqual|MinusEqual) expression;


localVarDeclaration: type Identifier (Comma Identifier)* ((Equal|PlusEqual|MinusEqual) expression)?;
jNew: 'new' Identifier LBracket nArguments RBracket;
methodCall: methodCallPrefix? (Identifier LBracket nArguments RBracket Dot)*
(Identifier LBracket nArguments RBracket);
methodCallPrefix: (instVar|Identifier Dot);

statement: ifelse | localVarDeclaration Semicolon | jReturn Semicolon | jWhile | block
    | statementExpressions Semicolon;

ifelse: jIf jElseIf* jElse?;
jIf: If LBracket expression RBracket block;
jElseIf: Else If LBracket expression RBracket block;
jElse: Else block;
jWhile: 'while' LBracket expression RBracket block;
jReturn: 'return' expression;
unary:  NotOperator expression;
binary: basicexpressions (operators basicexpressions)+;
baseType: JBoolean | JNull | This | WS | JCharacter | JInteger | Super; //JString = WS ??? Vorher stand bei ws JString

operators: LogicalOperator|Comperator|AddSubOperator|PointOperator;

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
OpBeforeOrAfterIdentifier: '++'|'--';
PointOperator: '*'|'/';
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