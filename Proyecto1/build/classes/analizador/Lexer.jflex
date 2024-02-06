// ------------  Paquetes e importaciones ------------
package analizador; 

import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%line
%column
%unicode
%ignorecase


%init{ 
    yyline = 1;
    yycolumn =1;
%init} 

// ------> Expresiones Regulares 

entero = [0-9]+


%%

// ------------  Reglas Lexicas -------------------


"Program"   {return new Symbol (sym.PROGRAM, yycolumn, yyline, yytext());}
"End"       {return new Symbol (sym.END, yycolumn, yyline, yytext());}
"char"      {return new Symbol (sym.CHAR, yycolumn, yyline, yytext());}
"double"    {return new Symbol (sym.DOUBLE, yycolumn, yyline, yytext());}
"var"       {return new Symbol (sym.VAR, yycolumn, yyline, yytext());}
"arr"       {return new Symbol (sym.ARR, yycolumn, yyline, yytext());}

"SUM"       {return new Symbol (sym.SUM, yycolumn, yyline, yytext());}
"RES"       {return new Symbol (sym.RES, yycolumn, yyline, yytext());}
"MUL"       {return new Symbol (sym.MUL, yycolumn, yyline, yytext());}
"DIV"       {return new Symbol (sym.DIV, yycolumn, yyline, yytext());}
"MOD"       {return new Symbol (sym.MOD, yycolumn, yyline, yytext());}

"Media"     {return new Symbol (sym.MEDIA, yycolumn, yyline, yytext());}
"Mediana"   {return new Symbol (sym.MEDIANA, yycolumn, yyline, yytext());}
"Moda"      {return new Symbol (sym.MODA, yycolumn, yyline, yytext());}
"Varianza"  {return new Symbol (sym.VARIANZA, yycolumn, yyline, yytext());}
"Max"       {return new Symbol (sym.MAX, yycolumn, yyline, yytext());}
"Min"       {return new Symbol (sym.MIN, yycolumn, yyline, yytext());}

"graphPie"
"graphBar"




"("        { return new Symbol(sym.PARENTESIS_A, yycolumn, yyline, yytext()); }
")"        { return new Symbol(sym.PARENTESIS_C, yycolumn, yyline, yytext()); }
"mostrar"    { return new Symbol(sym.PRINT, yycolumn, yyline, yytext()); } 

{entero}  { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }




//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext()); }
