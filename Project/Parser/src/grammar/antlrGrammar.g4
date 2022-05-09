grammar antlrGrammar;


//programm: jClass+;



/*
AccessModifier: 'public' | 'protected' | 'private';
JBoolean: 'true'|'false';
JNull: 'null';
Void: 'void';
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
*/

//WS: ([ \t\r\n]+) -> skip;
//Comment: '/*' .*? '*/' -> skip;
//LineComment: '//' ~[\r\n]* -> skip;

