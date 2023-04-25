grammar Alf;

start               : (statement SEMICOLON NEWLINE*)*               #multilineProg
                    | statement SEMICOLON NEWLINE*                  #singlelineProg
                    ;

statement           : declaration                                   #declarationRule
                    | expression                                    #expressionRule
                    | attribution                                   #attributionRule
                    /* --- Exercice 5 --- */
                    | function                                      #functionRule
                    | return                                        #returnRule
                    /* --- */
                    ;

declaration         : type VARIABLE EQ expression                   #variableDeclaration
                    ;

type                : INT                                           #typeInt
                    | FLOAT                                         #typeFloat
                    | STRING                                        #typeString
                    /* --- Exercice 1 --- */
                    | BOOLEAN                                       #typeBoolean
                    /* --- */
                    /* --- Exercice 4 --- */
                    | LIST                                          #typeList
                    /* --- */
                    ;

value               : INT_NUMBER                                    #valueInt
                    | FLOAT_NUMBER                                  #valueFloat
                    | STRING_TEXT                                   #valueString
                    /* --- Exercice 1 --- */
                    | BOOLEAN_TEXT                                  #valueBoolean
                    /* --- */

                    /* --- Exercice 4 --- */
                    | list                                          #valueList
                    /* --- */
                    | VARIABLE                                      #valueVariable
                    ;

/* --- Exercice 4 --- */
list                : BRACKETS_L (value COLON?)* BRACKETS_R          #listValues
                    ;
/* --- */

expression          : left=expression op=MUL right=expression       #expressionMultiply
                    | left=expression op=DIV right=expression       #expressionDivision
                    | left=expression op=REM right=expression       #expressionRem
                    | left=expression op=ADD right=expression       #expressionAddition
                    | left=expression op=SUB right=expression       #expressionSubtraction
                    /* --- Exercice 1 --- */
                    | left=expression op=OR right=expression        #expressionOr
                    | left=expression op=AND right=expression       #expressionAnd
                    | op=NOT expression                             #expressionNot
                    /* --- */
                    | LP expression RP                              #expressionParanthesis
                    | value                                         #expressionValue
                    ;

/** TODO 1: Add the tokens (in the Lexer part) and the rules (with aliases) for boolean expressions
  * Operators: OR, AND, NOT
  * Values: true, false, variables
 */





attribution         : VARIABLE EQ expression                        #variableAttribution
                    ;


/** TODO 4: Add the tokens (in the Lexer part) and the rules (with aliases) for lists declaration
  * Keyword: list
  * Name: any variable name
  * Values: any value separated by comma
 */


/** TODO 5: Add the tokens (in the Lexer part) and the rules (with aliases) for functions declaration
  * Keyword: function
  * Name: any variable name
  * Parameters: any declaration separated by comma
  * Instructions: any statement separated by a semicolon and one or more new lines
  * Return: "return" keyword + any statement ending with a semicolon
 */
/* --- Exercice 5 --- */
function            : FUNCTION VARIABLE LP (declaration COLON?)* RP CURLYB_L (statement SEMICOLON?)+ return SEMICOLON CURLYB_R     #functionDefinition
                    ;

return              : RETURN expression                                     #returnValue
                    ;
/* --- */
/** BONUS: Add the tokens (in the Lexer part) and the rules (with aliases) for function calls
  * Function name: any variable name
  * Parameters: any value separated by comma
  * Add the function call to the variable declaration
 */


WS                  :   (' ')       -> skip;
NEWLINE             :   ([\r\n]+)   -> skip;
VARIABLE            :   ('_'[a-zA-Z0-9]+);
ADD                 :   '+';
SUB                 :   '-';
MUL                 :   '*';
DIV                 :   '/';
REM                 :   '%';
OR                  :   '||';
AND                 :   '&&';
NOT                 :   '!';
INT                 :   'int';
FLOAT               :   'float';
STRING              :   'String';
BOOLEAN             :   'bool';
LIST                :   'list';
FUNCTION            :   'function';
RETURN              :   'return';
LP                  :   '(';
RP                  :   ')';
BRACKETS_L          :   '[';
BRACKETS_R          :   ']';
CURLYB_L            :   '{';
CURLYB_R            :   '}';
EQ                  :   '=';
SEMICOLON           :   ';';
COLON               :   ',';
INT_NUMBER          :   ([0-9]+);
FLOAT_NUMBER        :   ([0-9]+'.'[0-9]+);
BOOLEAN_TEXT        :   'true'|'false';
STRING_TEXT         :   ('"'~["]+'"'|'\''~[']+'\'');