// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/analizador/Lexer.jflex

// ------------  Paquetes e importaciones ------------
package analizador; 

import java_cup.runtime.*;
import Errores.ErroresTipo;
import java.util.ArrayList; 



@SuppressWarnings("fallthrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\1\22\0\1\1\1\4"+
    "\1\5\5\0\1\6\1\7\2\0\1\10\1\11\1\12"+
    "\1\0\12\13\1\14\1\15\1\16\1\17\1\20\1\0"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\27\1\34\1\35\1\36\1\37"+
    "\1\40\1\27\1\41\1\42\1\43\1\44\1\45\1\27"+
    "\1\46\1\47\1\50\1\51\1\0\1\52\1\0\1\53"+
    "\1\0\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\27\1\34\1\35\1\36\1\37"+
    "\1\40\1\27\1\41\1\42\1\43\1\44\1\45\1\27"+
    "\1\46\1\47\1\50\1\54\1\0\1\55\7\0\1\3"+
    "\252\0\2\56\115\0\1\57\u01a8\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\16\21\1\22\1\23\1\1\1\24\1\25\1\1"+
    "\1\26\1\0\1\27\2\0\1\30\1\0\5\21\1\0"+
    "\5\21\1\0\6\21\1\0\4\21\1\0\1\21\2\0"+
    "\1\31\2\0\1\32\3\21\1\33\1\21\1\33\1\21"+
    "\1\34\3\21\1\0\1\21\1\35\1\21\1\36\1\37"+
    "\1\40\1\36\2\21\1\0\2\41\1\42\1\21\1\0"+
    "\1\21\1\43\1\42\1\26\1\0\1\44\2\21\1\0"+
    "\1\21\1\45\1\46\1\47\2\21\1\0\2\21\1\0"+
    "\1\50\2\21\1\0\1\21\1\0\2\21\2\0\2\21"+
    "\1\0\3\21\1\0\1\51\2\52\1\53\1\21\1\53"+
    "\1\21\1\0\2\21\1\0\1\26\1\54\1\21\1\0"+
    "\1\55\4\21\1\0\1\21\1\0\1\21\2\56\2\57"+
    "\1\21\1\0\2\60\2\21\1\0\1\21\1\0\1\21"+
    "\1\0\2\61\1\62\1\63\1\64\1\63\1\64\1\21"+
    "\1\0\1\65\1\21\1\0\2\66\1\21\1\0\2\67"+
    "\2\70\2\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\60\0\140\0\220\0\60\0\60\0\60"+
    "\0\60\0\60\0\300\0\60\0\60\0\360\0\60\0\60"+
    "\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\60"+
    "\0\60\0\u03f0\0\60\0\60\0\u0420\0\140\0\220\0\60"+
    "\0\u0450\0\u0480\0\u04b0\0\u0120\0\u04e0\0\u0510\0\u0540\0\u0570"+
    "\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0"+
    "\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870"+
    "\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u03f0\0\u0990\0\u0450"+
    "\0\u09c0\0\u09f0\0\u0180\0\u0a20\0\u0a50\0\u0a80\0\u0180\0\u0ab0"+
    "\0\60\0\u0ae0\0\u0180\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0"+
    "\0\u0180\0\u0c00\0\u0180\0\u0c30\0\u0180\0\60\0\u0c60\0\u0c90"+
    "\0\u0cc0\0\u0180\0\60\0\u0180\0\u0cf0\0\u0d20\0\u0d50\0\u0d80"+
    "\0\60\0\60\0\u0db0\0\u0180\0\u0de0\0\u0e10\0\u0e40\0\u0e70"+
    "\0\u0180\0\u0180\0\u0180\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60"+
    "\0\u0f90\0\u0180\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\u10b0"+
    "\0\u10e0\0\u1110\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230"+
    "\0\u1260\0\u1290\0\u0180\0\u12c0\0\u12f0\0\u0180\0\u1320\0\60"+
    "\0\u1350\0\u1380\0\u13b0\0\u13e0\0\u1410\0\u0db0\0\u0180\0\u1440"+
    "\0\u1470\0\u0180\0\u14a0\0\u14d0\0\u1500\0\u1530\0\u1560\0\u1590"+
    "\0\u15c0\0\u15f0\0\u1620\0\u1650\0\u0180\0\60\0\u1680\0\u16b0"+
    "\0\u0180\0\60\0\u16e0\0\u1710\0\u1740\0\u1770\0\u17a0\0\u17d0"+
    "\0\u1800\0\u0180\0\60\0\u0180\0\u0180\0\u0180\0\60\0\60"+
    "\0\u1830\0\u1860\0\u0180\0\u1890\0\u18c0\0\u0180\0\60\0\u18f0"+
    "\0\u1920\0\u0180\0\60\0\u0180\0\60\0\u0180\0\60";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\23\1\27"+
    "\1\30\2\23\1\31\1\32\2\23\1\33\1\34\1\35"+
    "\1\36\1\23\1\37\3\23\1\40\1\41\1\42\1\43"+
    "\1\44\1\2\1\45\60\0\2\46\1\0\55\46\5\47"+
    "\1\50\52\47\12\0\1\51\1\13\50\0\1\52\75\0"+
    "\27\53\2\0\1\54\17\0\1\23\6\0\17\23\1\55"+
    "\7\23\2\0\1\23\17\0\1\23\6\0\27\23\2\0"+
    "\1\23\17\0\1\23\6\0\7\23\1\56\5\23\1\57"+
    "\11\23\2\0\1\23\17\0\1\23\6\0\10\23\1\60"+
    "\4\23\1\61\11\23\2\0\1\23\2\0\1\62\14\0"+
    "\1\23\6\0\11\23\1\63\2\23\1\64\7\23\1\65"+
    "\2\23\2\0\1\23\17\0\1\23\6\0\17\23\1\66"+
    "\7\23\2\0\1\23\17\0\1\23\6\0\10\23\1\67"+
    "\16\23\2\0\1\23\2\0\1\70\14\0\1\23\6\0"+
    "\1\71\26\23\2\0\1\23\17\0\1\23\6\0\1\72"+
    "\3\23\1\73\3\23\1\74\4\23\1\75\4\23\1\76"+
    "\4\23\2\0\1\23\2\0\1\77\14\0\1\23\6\0"+
    "\17\23\1\100\7\23\2\0\1\23\17\0\1\23\6\0"+
    "\4\23\1\101\22\23\2\0\1\23\17\0\1\23\6\0"+
    "\22\23\1\102\4\23\2\0\1\23\17\0\1\23\6\0"+
    "\10\23\1\103\16\23\2\0\1\23\2\0\1\104\14\0"+
    "\1\23\6\0\1\105\26\23\2\0\1\23\26\0\27\23"+
    "\2\0\1\106\50\0\1\107\26\0\1\110\44\0\4\52"+
    "\1\111\11\52\1\112\1\52\1\0\37\52\13\0\1\53"+
    "\6\0\27\53\2\0\1\53\17\0\1\23\6\0\17\23"+
    "\1\113\7\23\2\0\1\23\17\0\1\23\6\0\1\114"+
    "\26\23\2\0\1\23\17\0\1\23\6\0\12\23\1\115"+
    "\1\23\1\116\12\23\2\0\1\23\17\0\1\23\6\0"+
    "\23\23\1\117\3\23\2\0\1\23\17\0\1\23\6\0"+
    "\22\23\1\120\4\23\2\0\1\23\51\0\1\121\25\0"+
    "\1\23\6\0\4\23\1\122\22\23\2\0\1\23\17\0"+
    "\1\23\6\0\3\23\1\123\23\23\2\0\1\23\17\0"+
    "\1\23\6\0\4\23\1\124\22\23\2\0\1\23\17\0"+
    "\1\23\6\0\1\125\26\23\2\0\1\23\17\0\1\23"+
    "\6\0\20\23\1\126\6\23\2\0\1\23\3\0\1\127"+
    "\42\0\1\127\14\0\1\127\13\0\1\23\6\0\1\23"+
    "\1\130\25\23\2\0\1\23\17\0\1\23\6\0\24\23"+
    "\1\131\2\23\2\0\1\23\17\0\1\23\6\0\3\23"+
    "\1\132\23\23\2\0\1\23\17\0\1\23\6\0\14\23"+
    "\1\133\12\23\2\0\1\23\17\0\1\23\6\0\3\23"+
    "\1\134\23\23\2\0\1\23\17\0\1\23\6\0\12\23"+
    "\1\135\14\23\2\0\1\23\42\0\1\136\34\0\1\23"+
    "\6\0\10\23\1\137\4\23\1\140\11\23\2\0\1\23"+
    "\2\0\1\141\14\0\1\23\6\0\20\23\1\142\6\23"+
    "\2\0\1\23\3\0\1\143\13\0\1\23\6\0\13\23"+
    "\1\144\13\23\2\0\1\23\17\0\1\23\6\0\21\23"+
    "\1\145\5\23\2\0\1\23\47\0\1\146\27\0\1\23"+
    "\6\0\12\23\1\147\4\23\1\150\7\23\2\0\1\23"+
    "\41\0\1\151\22\0\4\52\1\111\11\52\1\112\1\52"+
    "\1\152\37\52\16\112\1\153\1\112\1\153\37\112\13\0"+
    "\1\23\6\0\17\23\1\154\7\23\2\0\1\23\17\0"+
    "\1\23\6\0\22\23\1\155\4\23\2\0\1\23\17\0"+
    "\1\23\6\0\20\23\1\156\6\23\2\0\1\23\3\0"+
    "\1\157\13\0\1\23\6\0\1\23\1\160\25\23\2\0"+
    "\1\23\17\0\1\23\6\0\24\23\1\161\1\162\1\23"+
    "\2\0\1\23\17\0\1\23\6\0\2\23\1\163\24\23"+
    "\2\0\1\23\17\0\1\23\6\0\16\23\1\164\10\23"+
    "\2\0\1\23\17\0\1\23\6\0\21\23\1\165\5\23"+
    "\2\0\1\23\47\0\1\166\27\0\1\23\6\0\4\23"+
    "\1\167\22\23\2\0\1\23\17\0\1\23\6\0\10\23"+
    "\1\170\16\23\2\0\1\23\2\0\1\171\14\0\1\23"+
    "\6\0\1\172\26\23\2\0\1\23\17\0\1\23\6\0"+
    "\14\23\1\173\12\23\2\0\1\23\17\0\1\23\6\0"+
    "\6\23\1\174\20\23\2\0\1\23\42\0\1\175\34\0"+
    "\1\23\6\0\22\23\1\176\4\23\2\0\1\23\50\0"+
    "\1\177\26\0\1\23\6\0\22\23\1\200\4\23\2\0"+
    "\1\23\17\0\1\23\6\0\10\23\1\201\16\23\2\0"+
    "\1\23\2\0\1\202\1\0\4\153\1\203\53\153\13\0"+
    "\1\23\6\0\13\23\1\204\13\23\2\0\1\23\17\0"+
    "\1\23\6\0\15\23\1\205\11\23\2\0\1\23\43\0"+
    "\1\206\33\0\1\23\6\0\12\23\1\207\14\23\2\0"+
    "\1\23\17\0\1\23\6\0\7\23\1\210\17\23\2\0"+
    "\1\23\17\0\1\23\6\0\15\23\1\211\11\23\2\0"+
    "\1\23\43\0\1\212\33\0\1\23\6\0\12\23\1\213"+
    "\14\23\2\0\1\23\17\0\1\23\6\0\1\214\26\23"+
    "\2\0\1\23\26\0\1\215\50\0\1\23\6\0\21\23"+
    "\1\216\5\23\2\0\1\23\17\0\1\23\6\0\17\23"+
    "\1\217\7\23\2\0\1\23\47\0\1\220\27\0\1\23"+
    "\6\0\12\23\1\221\14\23\2\0\1\23\40\0\1\222"+
    "\36\0\1\23\6\0\4\23\1\223\22\23\2\0\1\23"+
    "\17\0\1\23\6\0\1\224\26\23\2\0\1\23\26\0"+
    "\1\225\35\0\4\153\1\203\13\153\1\226\37\153\13\0"+
    "\1\23\6\0\14\23\1\227\12\23\2\0\1\23\17\0"+
    "\1\23\6\0\12\23\1\230\14\23\2\0\1\23\40\0"+
    "\1\231\36\0\1\23\6\0\4\23\1\232\22\23\2\0"+
    "\1\23\17\0\1\23\6\0\1\23\1\233\10\23\1\234"+
    "\3\23\1\235\10\23\2\0\1\23\17\0\1\23\6\0"+
    "\6\23\1\236\20\23\2\0\1\23\34\0\1\237\42\0"+
    "\1\23\6\0\14\23\1\240\12\23\2\0\1\23\42\0"+
    "\1\241\34\0\1\23\6\0\1\242\26\23\2\0\1\23"+
    "\17\0\1\23\6\0\15\23\1\243\11\23\2\0\1\23"+
    "\43\0\1\244\33\0\1\23\6\0\20\23\1\245\6\23"+
    "\2\0\1\23\3\0\1\246\13\0\1\23\6\0\14\23"+
    "\1\247\12\23\2\0\1\23\42\0\1\250\34\0\1\23"+
    "\6\0\4\23\1\251\22\23\2\0\1\23\32\0\1\252"+
    "\44\0\1\23\6\0\1\253\26\23\2\0\1\23\17\0"+
    "\1\23\6\0\10\23\1\254\16\23\2\0\1\23\2\0"+
    "\1\255\14\0\1\23\6\0\10\23\1\256\16\23\2\0"+
    "\1\23\2\0\1\257\14\0\1\23\6\0\17\23\1\260"+
    "\7\23\2\0\1\23\45\0\1\261\31\0\1\23\6\0"+
    "\1\262\26\23\2\0\1\23\26\0\1\263\50\0\1\23"+
    "\6\0\13\23\1\264\13\23\2\0\1\23\17\0\1\23"+
    "\6\0\24\23\1\265\1\266\1\23\2\0\1\23\52\0"+
    "\1\267\1\270\23\0\1\23\6\0\26\23\1\271\2\0"+
    "\1\23\54\0\1\272\22\0\1\23\6\0\17\23\1\273"+
    "\7\23\2\0\1\23\17\0\1\23\6\0\14\23\1\274"+
    "\12\23\2\0\1\23\42\0\1\275\34\0\1\23\6\0"+
    "\4\23\1\276\22\23\2\0\1\23\32\0\1\277\44\0"+
    "\1\23\6\0\1\300\26\23\2\0\1\23\26\0\1\301"+
    "\50\0\1\23\6\0\1\302\26\23\2\0\1\23\26\0"+
    "\1\303\50\0\1\23\6\0\4\23\1\304\22\23\2\0"+
    "\1\23\32\0\1\305\44\0\1\23\6\0\13\23\1\306"+
    "\13\23\2\0\1\23\41\0\1\307\22\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[6480];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\2\1\5\11\1\1\2\11\1\1\2\11"+
    "\17\1\2\11\1\1\2\11\2\1\1\0\1\11\2\0"+
    "\1\1\1\0\5\1\1\0\5\1\1\0\6\1\1\0"+
    "\4\1\1\0\1\1\2\0\1\1\2\0\6\1\1\11"+
    "\5\1\1\0\6\1\1\11\2\1\1\0\1\1\1\11"+
    "\2\1\1\0\2\1\2\11\1\0\3\1\1\0\6\1"+
    "\1\0\2\1\1\0\3\1\1\0\1\1\1\0\2\1"+
    "\2\0\2\1\1\0\3\1\1\0\5\1\1\11\1\1"+
    "\1\0\2\1\1\0\3\1\1\0\5\1\1\0\1\1"+
    "\1\0\4\1\1\11\1\1\1\0\1\1\1\11\2\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\11\3\1"+
    "\2\11\1\1\1\0\2\1\1\0\1\1\1\11\1\1"+
    "\1\0\1\1\1\11\1\1\1\11\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */

    public ArrayList<ErroresTipo> fails = new ArrayList();



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      yyline = 1;
    yycolumn =1;
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);
                  fails.add(new ErroresTipo("Léxico", "El carácter '" + yytext() + "' no pertenece al lenguaje", yyline+"", yycolumn+""));
            }
          // fall through
          case 58: break;
          case 2:
            { /* Espacios en blanco se ignoran */
            }
          // fall through
          case 59: break;
          case 3:
            { return new Symbol (sym.S_EXCLAMACION, yycolumn, yyline, yytext());
            }
          // fall through
          case 60: break;
          case 4:
            { return new Symbol (sym.COMILLA, yycolumn, yyline, yytext());
            }
          // fall through
          case 61: break;
          case 5:
            { return new Symbol (sym.A_PARENTESIS, yycolumn, yyline, yytext());
            }
          // fall through
          case 62: break;
          case 6:
            { return new Symbol (sym.C_PARENTESIS, yycolumn, yyline, yytext());
            }
          // fall through
          case 63: break;
          case 7:
            { return new Symbol (sym.COMA, yycolumn, yyline, yytext());
            }
          // fall through
          case 64: break;
          case 8:
            { return new Symbol (sym.GUION, yycolumn, yyline, yytext());
            }
          // fall through
          case 65: break;
          case 9:
            { return new Symbol (sym.PUNTO, yycolumn, yyline, yytext());
            }
          // fall through
          case 66: break;
          case 10:
            { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext());
            }
          // fall through
          case 67: break;
          case 11:
            { return new Symbol (sym.DOS_PUNTOS, yycolumn, yyline, yytext());
            }
          // fall through
          case 68: break;
          case 12:
            { return new Symbol (sym.PUNTO_COMA, yycolumn, yyline, yytext());
            }
          // fall through
          case 69: break;
          case 13:
            { return new Symbol (sym.MENOR_Q, yycolumn, yyline, yytext());
            }
          // fall through
          case 70: break;
          case 14:
            { return new Symbol (sym.S_IGUAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 71: break;
          case 15:
            { return new Symbol (sym.MAYOR_Q, yycolumn, yyline, yytext());
            }
          // fall through
          case 72: break;
          case 16:
            { return new Symbol (sym.ARROBA, yycolumn, yyline, yytext());
            }
          // fall through
          case 73: break;
          case 17:
            { return new Symbol(sym.ID, yycolumn, yyline, yytext());
            }
          // fall through
          case 74: break;
          case 18:
            { return new Symbol (sym.A_CORCHETE, yycolumn, yyline, yytext());
            }
          // fall through
          case 75: break;
          case 19:
            { return new Symbol (sym.C_CORCHETE, yycolumn, yyline, yytext());
            }
          // fall through
          case 76: break;
          case 20:
            { return new Symbol (sym.A_LLAVE, yycolumn, yyline, yytext());
            }
          // fall through
          case 77: break;
          case 21:
            { return new Symbol (sym.C_LLAVE, yycolumn, yyline, yytext());
            }
          // fall through
          case 78: break;
          case 22:
            { 
            }
          // fall through
          case 79: break;
          case 23:
            { return new Symbol(sym.CADENA, yycolumn, yyline, yytext());
            }
          // fall through
          case 80: break;
          case 24:
            { return new Symbol(sym.ID_ARREGLO, yycolumn, yyline, yytext());
            }
          // fall through
          case 81: break;
          case 25:
            { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 82: break;
          case 26:
            { return new Symbol (sym.ARR, yycolumn, yyline, yytext());
            }
          // fall through
          case 83: break;
          case 27:
            { return new Symbol (sym.DIV, yycolumn, yyline, yytext());
            }
          // fall through
          case 84: break;
          case 28:
            { return new Symbol (sym.END, yycolumn, yyline, yytext());
            }
          // fall through
          case 85: break;
          case 29:
            { return new Symbol (sym.MAX, yycolumn, yyline, yytext());
            }
          // fall through
          case 86: break;
          case 30:
            { return new Symbol (sym.MIN, yycolumn, yyline, yytext());
            }
          // fall through
          case 87: break;
          case 31:
            { return new Symbol (sym.MOD, yycolumn, yyline, yytext());
            }
          // fall through
          case 88: break;
          case 32:
            { return new Symbol (sym.MUL, yycolumn, yyline, yytext());
            }
          // fall through
          case 89: break;
          case 33:
            { return new Symbol (sym.RES, yycolumn, yyline, yytext());
            }
          // fall through
          case 90: break;
          case 34:
            { return new Symbol (sym.SUM, yycolumn, yyline, yytext());
            }
          // fall through
          case 91: break;
          case 35:
            { return new Symbol (sym.VAR, yycolumn, yyline, yytext());
            }
          // fall through
          case 92: break;
          case 36:
            { return new Symbol (sym.CHAR1, yycolumn, yyline, yytext());
            }
          // fall through
          case 93: break;
          case 37:
            { return new Symbol (sym.E_X, yycolumn, yyline, yytext());
            }
          // fall through
          case 94: break;
          case 38:
            { return new Symbol (sym.E_Y, yycolumn, yyline, yytext());
            }
          // fall through
          case 95: break;
          case 39:
            { return new Symbol (sym.EXEC, yycolumn, yyline, yytext());
            }
          // fall through
          case 96: break;
          case 40:
            { return new Symbol (sym.MODA, yycolumn, yyline, yytext());
            }
          // fall through
          case 97: break;
          case 41:
            { return new Symbol (sym.LABEL, yycolumn, yyline, yytext());
            }
          // fall through
          case 98: break;
          case 42:
            { return new Symbol (sym.MEDIA, yycolumn, yyline, yytext());
            }
          // fall through
          case 99: break;
          case 43:
            { return new Symbol (sym.PRINT, yycolumn, yyline, yytext());
            }
          // fall through
          case 100: break;
          case 44:
            { return new Symbol (sym.COLUMNA, yycolumn, yyline, yytext());
            }
          // fall through
          case 101: break;
          case 45:
            { return new Symbol (sym.DOUBLE1, yycolumn, yyline, yytext());
            }
          // fall through
          case 102: break;
          case 46:
            { return new Symbol (sym.TITULO, yycolumn, yyline, yytext());
            }
          // fall through
          case 103: break;
          case 47:
            { return new Symbol (sym.VALUES, yycolumn, yyline, yytext());
            }
          // fall through
          case 104: break;
          case 48:
            { return new Symbol (sym.CONSOLE, yycolumn, yyline, yytext());
            }
          // fall through
          case 105: break;
          case 49:
            { return new Symbol (sym.MEDIANA, yycolumn, yyline, yytext());
            }
          // fall through
          case 106: break;
          case 50:
            { return new Symbol (sym.PROGRAM, yycolumn, yyline, yytext());
            }
          // fall through
          case 107: break;
          case 51:
            { return new Symbol (sym.T_X, yycolumn, yyline, yytext());
            }
          // fall through
          case 108: break;
          case 52:
            { return new Symbol (sym.T_Y, yycolumn, yyline, yytext());
            }
          // fall through
          case 109: break;
          case 53:
            { return new Symbol (sym.GraphBar, yycolumn, yyline, yytext());
            }
          // fall through
          case 110: break;
          case 54:
            { return new Symbol (sym.GraphPie, yycolumn, yyline, yytext());
            }
          // fall through
          case 111: break;
          case 55:
            { return new Symbol (sym.VARIANZA, yycolumn, yyline, yytext());
            }
          // fall through
          case 112: break;
          case 56:
            { return new Symbol (sym.GraphLine, yycolumn, yyline, yytext());
            }
          // fall through
          case 113: break;
          case 57:
            { return new Symbol (sym.HISTOGRAM, yycolumn, yyline, yytext());
            }
          // fall through
          case 114: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
