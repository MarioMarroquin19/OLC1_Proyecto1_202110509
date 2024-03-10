// ------------  Paquetes e importaciones ------------
package analizador; 

import java_cup.runtime.*;
import Errores.ErroresTipo;
import java.util.ArrayList; 
import Errores.Tokens;


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

%{

    public ArrayList<ErroresTipo> fails = new ArrayList();

    private ArrayList<Tokens> tokens = new ArrayList<>();

    public ArrayList<Tokens> obtenerTokens(){
        return tokens;
    }
    
%}

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

"Program"   {Tokens token = new Tokens(yytext(), "PROGRAM", yyline, yycolumn); tokens.add(token); return new Symbol (sym.PROGRAM, yycolumn, yyline, yytext());}
"End"       {Tokens token = new Tokens(yytext(), "END", yyline, yycolumn); tokens.add(token); return new Symbol (sym.END, yycolumn, yyline, yytext());}
"char"      {Tokens token = new Tokens(yytext(), "Char", yyline, yycolumn); tokens.add(token); return new Symbol (sym.CHAR1, yycolumn, yyline, yytext());}
"double"    {Tokens token = new Tokens(yytext(), "Double", yyline, yycolumn); tokens.add(token); return new Symbol (sym.DOUBLE1, yycolumn, yyline, yytext());}
"var"       {Tokens token = new Tokens(yytext(), "VAR", yyline, yycolumn); tokens.add(token); return new Symbol (sym.VAR, yycolumn, yyline, yytext());}
"arr"       {Tokens token = new Tokens(yytext(), "ARR", yyline, yycolumn); tokens.add(token); return new Symbol (sym.ARR, yycolumn, yyline, yytext());}

"SUM"       {Tokens token = new Tokens(yytext(), "SUM", yyline, yycolumn); tokens.add(token); return new Symbol (sym.SUM, yycolumn, yyline, yytext());}
"RES"       {Tokens token = new Tokens(yytext(), "RES", yyline, yycolumn); tokens.add(token); return new Symbol (sym.RES, yycolumn, yyline, yytext());}
"MUL"       {Tokens token = new Tokens(yytext(), "MUL", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MUL, yycolumn, yyline, yytext());}
"DIV"       {Tokens token = new Tokens(yytext(), "DIV", yyline, yycolumn); tokens.add(token); return new Symbol (sym.DIV, yycolumn, yyline, yytext());}
"MOD"       {Tokens token = new Tokens(yytext(), "MOD", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MOD, yycolumn, yyline, yytext());}

"Media"     {Tokens token = new Tokens(yytext(), "MEDIA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MEDIA, yycolumn, yyline, yytext());}
"Mediana"   {Tokens token = new Tokens(yytext(), "MEDIANA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MEDIANA, yycolumn, yyline, yytext());}
"Moda"      {Tokens token = new Tokens(yytext(), "MODA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MODA, yycolumn, yyline, yytext());}
"Varianza"  {Tokens token = new Tokens(yytext(), "VARIANZA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.VARIANZA, yycolumn, yyline, yytext());}
"Max"       {Tokens token = new Tokens(yytext(), "MAX", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MAX, yycolumn, yyline, yytext());}
"Min"       {Tokens token = new Tokens(yytext(), "MIN", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MIN, yycolumn, yyline, yytext());}

"console"   {Tokens token = new Tokens(yytext(), "CONSOLE", yyline, yycolumn); tokens.add(token); return new Symbol (sym.CONSOLE, yycolumn, yyline, yytext());}

"graphPie"  {Tokens token = new Tokens(yytext(), "GraphPie", yyline, yycolumn); tokens.add(token); return new Symbol (sym.GraphPie, yycolumn, yyline, yytext());}
"graphBar"  {Tokens token = new Tokens(yytext(), "GraphBar", yyline, yycolumn); tokens.add(token); return new Symbol (sym.GraphBar, yycolumn, yyline, yytext());}
"graphLine" {Tokens token = new Tokens(yytext(), "GraphLine", yyline, yycolumn); tokens.add(token); return new Symbol (sym.GraphLine, yycolumn, yyline, yytext());}
"Histogram" {Tokens token = new Tokens(yytext(), "HISTOGRAM", yyline, yycolumn); tokens.add(token); return new Symbol (sym.HISTOGRAM, yycolumn, yyline, yytext());}

"titulo"    {Tokens token = new Tokens(yytext(), "TITULO", yyline, yycolumn); tokens.add(token); return new Symbol (sym.TITULO, yycolumn, yyline, yytext());}
"ejeX"      {Tokens token = new Tokens(yytext(), "E_X", yyline, yycolumn); tokens.add(token); return new Symbol (sym.E_X, yycolumn, yyline, yytext());}
"ejeY"      {Tokens token = new Tokens(yytext(), "E_Y", yyline, yycolumn); tokens.add(token); return new Symbol (sym.E_Y, yycolumn, yyline, yytext());}
"tituloX"   {Tokens token = new Tokens(yytext(), "T_X", yyline, yycolumn); tokens.add(token); return new Symbol (sym.T_X, yycolumn, yyline, yytext());}
"tituloY"   {Tokens token = new Tokens(yytext(), "T_Y", yyline, yycolumn); tokens.add(token); return new Symbol (sym.T_Y, yycolumn, yyline, yytext());}
"EXEC"      {Tokens token = new Tokens(yytext(), "EXEC", yyline, yycolumn); tokens.add(token); return new Symbol (sym.EXEC, yycolumn, yyline, yytext());}
"label"     {Tokens token = new Tokens(yytext(), "LABEL", yyline, yycolumn); tokens.add(token); return new Symbol (sym.LABEL, yycolumn, yyline, yytext());}
"values"    {Tokens token = new Tokens(yytext(), "VALUES", yyline, yycolumn); tokens.add(token); return new Symbol (sym.VALUES, yycolumn, yyline, yytext());}

"print"     {Tokens token = new Tokens(yytext(), "PRINT", yyline, yycolumn); tokens.add(token); return new Symbol (sym.PRINT, yycolumn, yyline, yytext());}
"column"    {Tokens token = new Tokens(yytext(), "COLUMNA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.COLUMNA, yycolumn, yyline, yytext());}

":"         {Tokens token = new Tokens(yytext(), "DOS_PUNTOS", yyline, yycolumn); tokens.add(token); return new Symbol (sym.DOS_PUNTOS, yycolumn, yyline, yytext());}
";"         {Tokens token = new Tokens(yytext(), "PUNTO_COMA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.PUNTO_COMA, yycolumn, yyline, yytext());}
","         {Tokens token = new Tokens(yytext(), "COMA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.COMA, yycolumn, yyline, yytext());}
"."         {Tokens token = new Tokens(yytext(), "PUNTO", yyline, yycolumn); tokens.add(token); return new Symbol (sym.PUNTO, yycolumn, yyline, yytext());}
"!"         {Tokens token = new Tokens(yytext(), "S_EXCLAMACION", yyline, yycolumn); tokens.add(token); return new Symbol (sym.S_EXCLAMACION, yycolumn, yyline, yytext());}
"<"         {Tokens token = new Tokens(yytext(), "MENOR_Q", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MENOR_Q, yycolumn, yyline, yytext());}
">"         {Tokens token = new Tokens(yytext(), "MAYOR_Q", yyline, yycolumn); tokens.add(token); return new Symbol (sym.MAYOR_Q, yycolumn, yyline, yytext());}
"["         {Tokens token = new Tokens(yytext(), "A_CORCHETE", yyline, yycolumn); tokens.add(token); return new Symbol (sym.A_CORCHETE, yycolumn, yyline, yytext());}
"]"         {Tokens token = new Tokens(yytext(), "C_CORCHETE", yyline, yycolumn); tokens.add(token); return new Symbol (sym.C_CORCHETE, yycolumn, yyline, yytext());}
"{"         {Tokens token = new Tokens(yytext(), "A_LLAVE", yyline, yycolumn); tokens.add(token); return new Symbol (sym.A_LLAVE, yycolumn, yyline, yytext());}
"}"         {Tokens token = new Tokens(yytext(), "C_LLAVE", yyline, yycolumn); tokens.add(token); return new Symbol (sym.C_LLAVE, yycolumn, yyline, yytext());}
"-"         {Tokens token = new Tokens(yytext(), "GUION", yyline, yycolumn); tokens.add(token); return new Symbol (sym.GUION, yycolumn, yyline, yytext());}
"@"         {Tokens token = new Tokens(yytext(), "ARROBA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.ARROBA, yycolumn, yyline, yytext());}
"\""        {Tokens token = new Tokens(yytext(), "COMILLA", yyline, yycolumn); tokens.add(token); return new Symbol (sym.COMILLA, yycolumn, yyline, yytext());}
"("         {Tokens token = new Tokens(yytext(), "A_PARENTESIS", yyline, yycolumn); tokens.add(token); return new Symbol (sym.A_PARENTESIS, yycolumn, yyline, yytext());}
")"         {Tokens token = new Tokens(yytext(), "C_PARENTESIS", yyline, yycolumn); tokens.add(token); return new Symbol (sym.C_PARENTESIS, yycolumn, yyline, yytext());}
"="         {Tokens token = new Tokens(yytext(), "S_IGUAL", yyline, yycolumn); tokens.add(token); return new Symbol (sym.S_IGUAL, yycolumn, yyline, yytext());}

{entero}            {Tokens token = new Tokens(yytext(), "ENTERO", yyline, yycolumn); tokens.add(token);  return new Symbol(sym.ENTERO, yycolumn, yyline, yytext());}
{decimal}           {Tokens token = new Tokens(yytext(), "DECIMAL", yyline, yycolumn); tokens.add(token);  return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext());}
{comentarios}       {}
{comentarioMulti}   {}
{cadena}            {Tokens token = new Tokens(yytext(), "String", yyline, yycolumn); tokens.add(token); return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}     
{Id}                {Tokens token = new Tokens(yytext(), "ID", yyline, yycolumn); tokens.add(token); return new Symbol(sym.ID, yycolumn, yyline, yytext());}
{Id_arreglo}        {Tokens token = new Tokens(yytext(), "ID_ARREGLO", yyline, yycolumn); tokens.add(token); return new Symbol(sym.ID_ARREGLO, yycolumn, yyline, yytext());}


//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);
                  fails.add(new ErroresTipo("Léxico", "El carácter '" + yytext() + "' no pertenece al lenguaje", yyline+"", yycolumn+"")); }
