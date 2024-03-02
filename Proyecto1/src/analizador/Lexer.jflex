// ------------  Paquetes e importaciones ------------
package analizador; 

import java_cup.runtime.*;
import Error.ErrorManager;

ErrorManager errorManager = new ErrorManager();

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
decimal = [0-9]+\.[0-9]+
comentarios = "!"([^\n]*)?
comentarioMulti = "<!" [^<>]* ( <! [^<>]* )* "!>" 
cadena =  \"[^\"]*\"
Id =  (\_)*[a-zA-Z][a-zA-Z0-9\_]*
Id_arreglo = "@"{Id}



%%

// ------------  Reglas Lexicas -------------------

"Program"   {return new Symbol (sym.PROGRAM, yycolumn, yyline, yytext());}
"End"       {return new Symbol (sym.END, yycolumn, yyline, yytext());}
"char"      {return new Symbol (sym.CHAR1, yycolumn, yyline, yytext());}
"double"    {return new Symbol (sym.DOUBLE1, yycolumn, yyline, yytext());}
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

"console"   {return new Symbol (sym.CONSOLE, yycolumn, yyline, yytext());}

"graphPie"  {return new Symbol (sym.GraphPie, yycolumn, yyline, yytext());}
"graphBar"  {return new Symbol (sym.GraphBar, yycolumn, yyline, yytext());}
"graphLine" {return new Symbol (sym.GraphLine, yycolumn, yyline, yytext());}
"Histogram" {return new Symbol (sym.HISTOGRAM, yycolumn, yyline, yytext());}

"titulo"    {return new Symbol (sym.TITULO, yycolumn, yyline, yytext());}
"ejeX"      {return new Symbol (sym.E_X, yycolumn, yyline, yytext());}
"ejeY"      {return new Symbol (sym.E_Y, yycolumn, yyline, yytext());}
"tituloX"   {return new Symbol (sym.T_X, yycolumn, yyline, yytext());}
"tituloY"   {return new Symbol (sym.T_Y, yycolumn, yyline, yytext());}
"EXEC"      {return new Symbol (sym.EXEC, yycolumn, yyline, yytext());}
"label"     {return new Symbol (sym.LABEL, yycolumn, yyline, yytext());}
"values"    {return new Symbol (sym.VALUES, yycolumn, yyline, yytext());}

"print"     {return new Symbol (sym.PRINT, yycolumn, yyline, yytext());}
"column"    {return new Symbol (sym.COLUMNA, yycolumn, yyline, yytext());}

":"         {return new Symbol (sym.DOS_PUNTOS, yycolumn, yyline, yytext());}
";"         {return new Symbol (sym.PUNTO_COMA, yycolumn, yyline, yytext());}
","         {return new Symbol (sym.COMA, yycolumn, yyline, yytext());}
"."         {return new Symbol (sym.PUNTO, yycolumn, yyline, yytext());}
"!"         {return new Symbol (sym.S_EXCLAMACION, yycolumn, yyline, yytext());}
"<"         {return new Symbol (sym.MENOR_Q, yycolumn, yyline, yytext());}
">"         {return new Symbol (sym.MAYOR_Q, yycolumn, yyline, yytext());}
"["         {return new Symbol (sym.A_CORCHETE, yycolumn, yyline, yytext());}
"]"         {return new Symbol (sym.C_CORCHETE, yycolumn, yyline, yytext());}
"{"         {return new Symbol (sym.A_LLAVE, yycolumn, yyline, yytext());}
"}"         {return new Symbol (sym.C_LLAVE, yycolumn, yyline, yytext());}
"-"         {return new Symbol (sym.GUION, yycolumn, yyline, yytext());}
"@"         {return new Symbol (sym.ARROBA, yycolumn, yyline, yytext());}
"\""         {return new Symbol (sym.COMILLA, yycolumn, yyline, yytext());}
"("         {return new Symbol (sym.A_PARENTESIS, yycolumn, yyline, yytext());}
")"         {return new Symbol (sym.C_PARENTESIS, yycolumn, yyline, yytext());}
"="         {return new Symbol (sym.S_IGUAL, yycolumn, yyline, yytext());}

{entero}            { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext());}
{decimal}           { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext());}
{comentarios}       {}
{comentarioMulti}   {}
{cadena}            {return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}     
{Id}                {return new Symbol(sym.ID, yycolumn, yyline, yytext());}
{Id_arreglo}        {return new Symbol(sym.ID_ARREGLO, yycolumn, yyline, yytext());}


//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ //System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);
                   errorManager.addError("Léxico", "El carácter '" + yytext() + "' no pertenece al lenguaje", yyline, yycolumn); }
