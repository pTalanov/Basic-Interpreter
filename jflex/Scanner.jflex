package basicinterp.gen;

import java_cup.runtime.SymbolFactory;
%%
%cup
%line
%class Scanner
%{
	public Scanner(java.io.InputStream r, SymbolFactory sf){
		this(r);
		this.sf=sf;
	}
	private SymbolFactory sf;

    // buffer for parsing string constants
    StringBuffer string = new StringBuffer();
%}
%eofval{
    return sf.newSymbol("EOF",sym.EOF);
%eofval}

LineTerminator = \r|\n|\r\n
WhiteSpace     = [ \t\f]
InputCharacter = [^\r\n]
DecIntegerLiteral = 0 | ([1-9][0-9]*)
IntegralVariableName = [:jletter:] [:jletterdigit:]*
StringVariableName = \$ [:jletter:] [:jletterdigit:]*

%state STRING

%%

<YYINITIAL> {
    // arithmetic symbols
    "+" { return sf.newSymbol("Plus", sym.PLUS); }
    "-" { return sf.newSymbol("Minus", sym.MINUS); }
    "*" { return sf.newSymbol("Times", sym.TIMES); }
    "/" { return sf.newSymbol("Divide", sym.DIVIDE); }
    "%" { return sf.newSymbol("Modulus", sym.MOD); }
    "(" { return sf.newSymbol("Left Bracket", sym.LPAREN); }
    ")" { return sf.newSymbol("Right Bracket", sym.RPAREN); }

    // comparison symbols
    "<" { return sf.newSymbol("Less Than", sym.LESS_THAN); }
    "<=" { return sf.newSymbol("Less Than or Equals", sym.LESS_THAN_OR_EQUALS); }
    ">" { return sf.newSymbol("Greater Than", sym.GREATER_THAN); }
    ">=" { return sf.newSymbol("Greater Than or Equals", sym.GREATER_THAN_OR_EQUALS); }
    "=" { return sf.newSymbol("Equals Sign", sym.EQUALS); }

    // keywords
    "PRINT" { return sf.newSymbol("Keyword Print", sym.PRINT); }
    "INPUT" { return sf.newSymbol("Keyword Input", sym.INPUT); }
    "IF"    { return sf.newSymbol("Keyword If", sym.IF); }
    "THEN"  { return sf.newSymbol("Keyword Then", sym.THEN); }

    // begin parsing a string constant
    \"      { string.setLength(0); yybegin(STRING); }

    //

    {DecIntegerLiteral} { return sf.newSymbol("Integral Constant", sym.INTEGRAL_CONSTANT, new Integer(yytext())); }
    {StringVariableName} { return sf.newSymbol("String Variable Name", sym.STRING_VARIABLE_NAME, new String(yytext())); }
    {IntegralVariableName} { return sf.newSymbol("Integral Variable Name", sym.INTEGRAL_VARIABLE_NAME, new String(yytext())); }

    [ \t\r\n\f] { /* ignore white space. */ }
}

<STRING> {
      \" {
          yybegin(YYINITIAL);
          return sf.newSymbol("String Constant", sym.STRING_CONSTANT, string.toString());
      }
      [^\"]+ {
          //System.out.println(yytext());
          string.append(yytext());
      }

}

. { System.err.println("Illegal character: "+yytext()); }
