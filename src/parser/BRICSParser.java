// Generated from G:/My Drive/PhD/Regex Research/RegexAnalyzer/src/parser\BRICS.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BRICSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Letter=1, Quoted=2, BlockQuoted=3, BellChar=4, ControlChar=5, EscapeChar=6, 
		FormFeed=7, NewLine=8, CarriageReturn=9, Tab=10, Backslash=11, HexChar=12, 
		Dot=13, OneDataUnit=14, DecimalDigit=15, NotDecimalDigit=16, HorizontalWhiteSpace=17, 
		NotHorizontalWhiteSpace=18, NotNewLine=19, CharWithProperty=20, CharWithoutProperty=21, 
		NewLineSequence=22, WhiteSpace=23, NotWhiteSpace=24, VerticalWhiteSpace=25, 
		NotVerticalWhiteSpace=26, WordChar=27, NotWordChar=28, ExtendedUnicodeChar=29, 
		CharacterClassStart=30, CharacterClassEnd=31, Caret=32, Hyphen=33, POSIXNamedSet=34, 
		POSIXNegatedNamedSet=35, QuestionMark=36, Plus=37, Star=38, OpenBrace=39, 
		CloseBrace=40, Comma=41, WordBoundary=42, NonWordBoundary=43, StartOfSubject=44, 
		EndOfSubjectOrLine=45, EndOfSubjectOrLineEndOfSubject=46, EndOfSubject=47, 
		PreviousMatchInSubject=48, ResetStartMatch=49, SubroutineOrNamedReferenceStartG=50, 
		NamedReferenceStartK=51, Pipe=52, OpenParen=53, CloseParen=54, LessThan=55, 
		GreaterThan=56, SingleQuote=57, Underscore=58, Colon=59, Hash=60, Equals=61, 
		Exclamation=62, Ampersand=63, ALC=64, BLC=65, CLC=66, DLC=67, ELC=68, 
		FLC=69, GLC=70, HLC=71, ILC=72, JLC=73, KLC=74, LLC=75, MLC=76, NLC=77, 
		OLC=78, PLC=79, QLC=80, RLC=81, SLC=82, TLC=83, ULC=84, VLC=85, WLC=86, 
		XLC=87, YLC=88, ZLC=89, AUC=90, BUC=91, CUC=92, DUC=93, EUC=94, FUC=95, 
		GUC=96, HUC=97, IUC=98, JUC=99, KUC=100, LUC=101, MUC=102, NUC=103, OUC=104, 
		PUC=105, QUC=106, RUC=107, SUC=108, TUC=109, UUC=110, VUC=111, WUC=112, 
		XUC=113, YUC=114, ZUC=115, D1=116, D2=117, D3=118, D4=119, D5=120, D6=121, 
		D7=122, D8=123, D9=124, D0=125, OtherChar=126;
	public static final int
		RULE_regexp = 0, RULE_unionexp = 1, RULE_interexp = 2, RULE_concatexp = 3, 
		RULE_repeatexp = 4, RULE_quantifier = 5, RULE_quantifier_type = 6, RULE_character_class = 7, 
		RULE_backreference = 8, RULE_backreference_or_octal = 9, RULE_capture = 10, 
		RULE_non_capture = 11, RULE_comment = 12, RULE_option = 13, RULE_option_flags = 14, 
		RULE_option_flag = 15, RULE_look_around = 16, RULE_subroutine_reference = 17, 
		RULE_conditional = 18, RULE_backtrack_control = 19, RULE_newline_convention = 20, 
		RULE_callout = 21, RULE_atom = 22, RULE_cc_atom = 23, RULE_shared_atom = 24, 
		RULE_shared_atom2 = 25, RULE_literal = 26, RULE_cc_literal = 27, RULE_shared_literal = 28, 
		RULE_number = 29, RULE_octal_char = 30, RULE_octal_digit = 31, RULE_digits = 32, 
		RULE_digit = 33, RULE_name = 34, RULE_alpha_nums = 35, RULE_non_close_parens = 36, 
		RULE_non_close_paren = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"regexp", "unionexp", "interexp", "concatexp", "repeatexp", "quantifier", 
			"quantifier_type", "character_class", "backreference", "backreference_or_octal", 
			"capture", "non_capture", "comment", "option", "option_flags", "option_flag", 
			"look_around", "subroutine_reference", "conditional", "backtrack_control", 
			"newline_convention", "callout", "atom", "cc_atom", "shared_atom", "shared_atom2", 
			"literal", "cc_literal", "shared_literal", "number", "octal_char", "octal_digit", 
			"digits", "digit", "name", "alpha_nums", "non_close_parens", "non_close_paren"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'\\a'", null, "'\\e'", "'\\f'", "'\\n'", "'\\r'", 
			"'\\t'", "'\\'", null, "'.'", "'\\C'", "'\\d'", "'\\D'", "'\\h'", "'\\H'", 
			"'\\N'", null, null, "'\\R'", "'\\s'", "'\\S'", "'\\v'", "'\\V'", "'\\w'", 
			"'\\W'", "'\\X'", "'['", "']'", "'^'", "'-'", null, null, "'?'", "'+'", 
			"'*'", "'{'", "'}'", "','", "'\\b'", "'\\B'", "'\\A'", "'$'", "'\\Z'", 
			"'\\z'", "'\\G'", "'\\K'", "'\\g'", "'\\k'", "'|'", "'('", "')'", "'<'", 
			"'>'", "'''", "'_'", "':'", "'#'", "'='", "'!'", "'&'", "'a'", "'b'", 
			"'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", "'j'", "'k'", "'l'", 
			"'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", "'t'", "'u'", "'v'", 
			"'w'", "'x'", "'y'", "'z'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", 
			"'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", "'P'", 
			"'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", "'Z'", 
			"'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Letter", "Quoted", "BlockQuoted", "BellChar", "ControlChar", "EscapeChar", 
			"FormFeed", "NewLine", "CarriageReturn", "Tab", "Backslash", "HexChar", 
			"Dot", "OneDataUnit", "DecimalDigit", "NotDecimalDigit", "HorizontalWhiteSpace", 
			"NotHorizontalWhiteSpace", "NotNewLine", "CharWithProperty", "CharWithoutProperty", 
			"NewLineSequence", "WhiteSpace", "NotWhiteSpace", "VerticalWhiteSpace", 
			"NotVerticalWhiteSpace", "WordChar", "NotWordChar", "ExtendedUnicodeChar", 
			"CharacterClassStart", "CharacterClassEnd", "Caret", "Hyphen", "POSIXNamedSet", 
			"POSIXNegatedNamedSet", "QuestionMark", "Plus", "Star", "OpenBrace", 
			"CloseBrace", "Comma", "WordBoundary", "NonWordBoundary", "StartOfSubject", 
			"EndOfSubjectOrLine", "EndOfSubjectOrLineEndOfSubject", "EndOfSubject", 
			"PreviousMatchInSubject", "ResetStartMatch", "SubroutineOrNamedReferenceStartG", 
			"NamedReferenceStartK", "Pipe", "OpenParen", "CloseParen", "LessThan", 
			"GreaterThan", "SingleQuote", "Underscore", "Colon", "Hash", "Equals", 
			"Exclamation", "Ampersand", "ALC", "BLC", "CLC", "DLC", "ELC", "FLC", 
			"GLC", "HLC", "ILC", "JLC", "KLC", "LLC", "MLC", "NLC", "OLC", "PLC", 
			"QLC", "RLC", "SLC", "TLC", "ULC", "VLC", "WLC", "XLC", "YLC", "ZLC", 
			"AUC", "BUC", "CUC", "DUC", "EUC", "FUC", "GUC", "HUC", "IUC", "JUC", 
			"KUC", "LUC", "MUC", "NUC", "OUC", "PUC", "QUC", "RUC", "SUC", "TUC", 
			"UUC", "VUC", "WUC", "XUC", "YUC", "ZUC", "D1", "D2", "D3", "D4", "D5", 
			"D6", "D7", "D8", "D9", "D0", "OtherChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BRICS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BRICSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RegexpContext extends ParserRuleContext {
		public UnionexpContext unionexp() {
			return getRuleContext(UnionexpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BRICSParser.EOF, 0); }
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			unionexp();
			setState(77);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionexpContext extends ParserRuleContext {
		public InterexpContext interexp() {
			return getRuleContext(InterexpContext.class,0);
		}
		public List<TerminalNode> Pipe() { return getTokens(BRICSParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(BRICSParser.Pipe, i);
		}
		public List<UnionexpContext> unionexp() {
			return getRuleContexts(UnionexpContext.class);
		}
		public UnionexpContext unionexp(int i) {
			return getRuleContext(UnionexpContext.class,i);
		}
		public UnionexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterUnionexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitUnionexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitUnionexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionexpContext unionexp() throws RecognitionException {
		UnionexpContext _localctx = new UnionexpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unionexp);
		try {
			int _alt;
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				interexp();
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80);
						match(Pipe);
						setState(81);
						unionexp();
						}
						} 
					}
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				interexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterexpContext extends ParserRuleContext {
		public ConcatexpContext concatexp() {
			return getRuleContext(ConcatexpContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(BRICSParser.Ampersand, 0); }
		public InterexpContext interexp() {
			return getRuleContext(InterexpContext.class,0);
		}
		public InterexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterInterexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitInterexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitInterexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterexpContext interexp() throws RecognitionException {
		InterexpContext _localctx = new InterexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interexp);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				concatexp();
				setState(91);
				match(Ampersand);
				setState(92);
				interexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				concatexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatexpContext extends ParserRuleContext {
		public RepeatexpContext repeatexp() {
			return getRuleContext(RepeatexpContext.class,0);
		}
		public ConcatexpContext concatexp() {
			return getRuleContext(ConcatexpContext.class,0);
		}
		public ConcatexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterConcatexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitConcatexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitConcatexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatexpContext concatexp() throws RecognitionException {
		ConcatexpContext _localctx = new ConcatexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_concatexp);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				repeatexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				repeatexp();
				setState(99);
				concatexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatexpContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public RepeatexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterRepeatexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitRepeatexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitRepeatexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatexpContext repeatexp() throws RecognitionException {
		RepeatexpContext _localctx = new RepeatexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeatexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			atom();
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(104);
				quantifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public Quantifier_typeContext quantifier_type() {
			return getRuleContext(Quantifier_typeContext.class,0);
		}
		public TerminalNode Plus() { return getToken(BRICSParser.Plus, 0); }
		public TerminalNode Star() { return getToken(BRICSParser.Star, 0); }
		public TerminalNode OpenBrace() { return getToken(BRICSParser.OpenBrace, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(BRICSParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(BRICSParser.Comma, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_quantifier);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(QuestionMark);
				setState(108);
				quantifier_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(Plus);
				setState(110);
				quantifier_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(Star);
				setState(112);
				quantifier_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(OpenBrace);
				setState(114);
				number();
				setState(115);
				match(CloseBrace);
				setState(116);
				quantifier_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(OpenBrace);
				setState(119);
				number();
				setState(120);
				match(Comma);
				setState(121);
				match(CloseBrace);
				setState(122);
				quantifier_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(OpenBrace);
				setState(125);
				number();
				setState(126);
				match(Comma);
				setState(127);
				number();
				setState(128);
				match(CloseBrace);
				setState(129);
				quantifier_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier_typeContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(BRICSParser.Plus, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public Quantifier_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterQuantifier_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitQuantifier_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitQuantifier_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_typeContext quantifier_type() throws RecognitionException {
		Quantifier_typeContext _localctx = new Quantifier_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quantifier_type);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(Plus);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(QuestionMark);
				}
				break;
			case EOF:
			case Letter:
			case Quoted:
			case BlockQuoted:
			case BellChar:
			case ControlChar:
			case EscapeChar:
			case FormFeed:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case HexChar:
			case Dot:
			case OneDataUnit:
			case DecimalDigit:
			case NotDecimalDigit:
			case HorizontalWhiteSpace:
			case NotHorizontalWhiteSpace:
			case NotNewLine:
			case CharWithProperty:
			case CharWithoutProperty:
			case NewLineSequence:
			case WhiteSpace:
			case NotWhiteSpace:
			case VerticalWhiteSpace:
			case NotVerticalWhiteSpace:
			case WordChar:
			case NotWordChar:
			case ExtendedUnicodeChar:
			case CharacterClassStart:
			case CharacterClassEnd:
			case Caret:
			case Hyphen:
			case POSIXNamedSet:
			case POSIXNegatedNamedSet:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case WordBoundary:
			case NonWordBoundary:
			case StartOfSubject:
			case EndOfSubjectOrLine:
			case EndOfSubjectOrLineEndOfSubject:
			case EndOfSubject:
			case PreviousMatchInSubject:
			case ResetStartMatch:
			case SubroutineOrNamedReferenceStartG:
			case NamedReferenceStartK:
			case Pipe:
			case OpenParen:
			case CloseParen:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
			case OtherChar:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_classContext extends ParserRuleContext {
		public TerminalNode CharacterClassStart() { return getToken(BRICSParser.CharacterClassStart, 0); }
		public TerminalNode Caret() { return getToken(BRICSParser.Caret, 0); }
		public List<TerminalNode> CharacterClassEnd() { return getTokens(BRICSParser.CharacterClassEnd); }
		public TerminalNode CharacterClassEnd(int i) {
			return getToken(BRICSParser.CharacterClassEnd, i);
		}
		public TerminalNode Hyphen() { return getToken(BRICSParser.Hyphen, 0); }
		public List<Cc_atomContext> cc_atom() {
			return getRuleContexts(Cc_atomContext.class);
		}
		public Cc_atomContext cc_atom(int i) {
			return getRuleContext(Cc_atomContext.class,i);
		}
		public Character_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterCharacter_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitCharacter_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitCharacter_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_classContext character_class() throws RecognitionException {
		Character_classContext _localctx = new Character_classContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_character_class);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(CharacterClassStart);
				setState(139);
				match(Caret);
				setState(140);
				match(CharacterClassEnd);
				setState(141);
				match(Hyphen);
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					cc_atom();
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Quoted) | (1L << BlockQuoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << HexChar) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D8 - 116)) | (1L << (D9 - 116)) | (1L << (D0 - 116)) | (1L << (OtherChar - 116)))) != 0) );
				setState(147);
				match(CharacterClassEnd);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(CharacterClassStart);
				setState(150);
				match(Caret);
				setState(151);
				match(CharacterClassEnd);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Quoted) | (1L << BlockQuoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << HexChar) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D8 - 116)) | (1L << (D9 - 116)) | (1L << (D0 - 116)) | (1L << (OtherChar - 116)))) != 0)) {
					{
					{
					setState(152);
					cc_atom();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(CharacterClassEnd);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(CharacterClassStart);
				setState(160);
				match(Caret);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					cc_atom();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Quoted) | (1L << BlockQuoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << HexChar) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D8 - 116)) | (1L << (D9 - 116)) | (1L << (D0 - 116)) | (1L << (OtherChar - 116)))) != 0) );
				setState(166);
				match(CharacterClassEnd);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(CharacterClassStart);
				setState(169);
				match(CharacterClassEnd);
				setState(170);
				match(Hyphen);
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					cc_atom();
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Quoted) | (1L << BlockQuoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << HexChar) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D8 - 116)) | (1L << (D9 - 116)) | (1L << (D0 - 116)) | (1L << (OtherChar - 116)))) != 0) );
				setState(176);
				match(CharacterClassEnd);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(CharacterClassStart);
				setState(179);
				match(CharacterClassEnd);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Quoted) | (1L << BlockQuoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << HexChar) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D8 - 116)) | (1L << (D9 - 116)) | (1L << (D0 - 116)) | (1L << (OtherChar - 116)))) != 0)) {
					{
					{
					setState(180);
					cc_atom();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(CharacterClassEnd);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(CharacterClassStart);
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					cc_atom();
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Quoted) | (1L << BlockQuoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << HexChar) | (1L << Dot) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << CharacterClassStart) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << EndOfSubjectOrLine) | (1L << Pipe) | (1L << OpenParen) | (1L << CloseParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D8 - 116)) | (1L << (D9 - 116)) | (1L << (D0 - 116)) | (1L << (OtherChar - 116)))) != 0) );
				setState(193);
				match(CharacterClassEnd);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BackreferenceContext extends ParserRuleContext {
		public Backreference_or_octalContext backreference_or_octal() {
			return getRuleContext(Backreference_or_octalContext.class,0);
		}
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(BRICSParser.SubroutineOrNamedReferenceStartG, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(BRICSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BRICSParser.CloseBrace, 0); }
		public TerminalNode Hyphen() { return getToken(BRICSParser.Hyphen, 0); }
		public TerminalNode NamedReferenceStartK() { return getToken(BRICSParser.NamedReferenceStartK, 0); }
		public TerminalNode LessThan() { return getToken(BRICSParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(BRICSParser.GreaterThan, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(BRICSParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(BRICSParser.SingleQuote, i);
		}
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public TerminalNode PUC() { return getToken(BRICSParser.PUC, 0); }
		public TerminalNode Equals() { return getToken(BRICSParser.Equals, 0); }
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public BackreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backreference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterBackreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitBackreference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitBackreference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackreferenceContext backreference() throws RecognitionException {
		BackreferenceContext _localctx = new BackreferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_backreference);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				backreference_or_octal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(SubroutineOrNamedReferenceStartG);
				setState(199);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(SubroutineOrNamedReferenceStartG);
				setState(201);
				match(OpenBrace);
				setState(202);
				number();
				setState(203);
				match(CloseBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(SubroutineOrNamedReferenceStartG);
				setState(206);
				match(OpenBrace);
				setState(207);
				match(Hyphen);
				setState(208);
				number();
				setState(209);
				match(CloseBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				match(NamedReferenceStartK);
				setState(212);
				match(LessThan);
				setState(213);
				name();
				setState(214);
				match(GreaterThan);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(NamedReferenceStartK);
				setState(217);
				match(SingleQuote);
				setState(218);
				name();
				setState(219);
				match(SingleQuote);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				match(SubroutineOrNamedReferenceStartG);
				setState(222);
				match(OpenBrace);
				setState(223);
				name();
				setState(224);
				match(CloseBrace);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				match(NamedReferenceStartK);
				setState(227);
				match(OpenBrace);
				setState(228);
				name();
				setState(229);
				match(CloseBrace);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(231);
				match(OpenParen);
				setState(232);
				match(QuestionMark);
				setState(233);
				match(PUC);
				setState(234);
				match(Equals);
				setState(235);
				name();
				setState(236);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Backreference_or_octalContext extends ParserRuleContext {
		public Octal_charContext octal_char() {
			return getRuleContext(Octal_charContext.class,0);
		}
		public TerminalNode Backslash() { return getToken(BRICSParser.Backslash, 0); }
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Backreference_or_octalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backreference_or_octal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterBackreference_or_octal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitBackreference_or_octal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitBackreference_or_octal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backreference_or_octalContext backreference_or_octal() throws RecognitionException {
		Backreference_or_octalContext _localctx = new Backreference_or_octalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_backreference_or_octal);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				octal_char();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(Backslash);
				setState(242);
				digit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public TerminalNode LessThan() { return getToken(BRICSParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(BRICSParser.GreaterThan, 0); }
		public UnionexpContext unionexp() {
			return getRuleContext(UnionexpContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(BRICSParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(BRICSParser.SingleQuote, i);
		}
		public TerminalNode PUC() { return getToken(BRICSParser.PUC, 0); }
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_capture);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(OpenParen);
				setState(246);
				match(QuestionMark);
				setState(247);
				match(LessThan);
				setState(248);
				name();
				setState(249);
				match(GreaterThan);
				setState(250);
				unionexp();
				setState(251);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(OpenParen);
				setState(254);
				match(QuestionMark);
				setState(255);
				match(SingleQuote);
				setState(256);
				name();
				setState(257);
				match(SingleQuote);
				setState(258);
				unionexp();
				setState(259);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(OpenParen);
				setState(262);
				match(QuestionMark);
				setState(263);
				match(PUC);
				setState(264);
				match(LessThan);
				setState(265);
				name();
				setState(266);
				match(GreaterThan);
				setState(267);
				unionexp();
				setState(268);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(OpenParen);
				setState(271);
				unionexp();
				setState(272);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_captureContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(BRICSParser.Colon, 0); }
		public UnionexpContext unionexp() {
			return getRuleContext(UnionexpContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public TerminalNode Pipe() { return getToken(BRICSParser.Pipe, 0); }
		public TerminalNode GreaterThan() { return getToken(BRICSParser.GreaterThan, 0); }
		public Non_captureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterNon_capture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitNon_capture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitNon_capture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_captureContext non_capture() throws RecognitionException {
		Non_captureContext _localctx = new Non_captureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_non_capture);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(OpenParen);
				setState(277);
				match(QuestionMark);
				setState(278);
				match(Colon);
				setState(279);
				unionexp();
				setState(280);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(OpenParen);
				setState(283);
				match(QuestionMark);
				setState(284);
				match(Pipe);
				setState(285);
				unionexp();
				setState(286);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(OpenParen);
				setState(289);
				match(QuestionMark);
				setState(290);
				match(GreaterThan);
				setState(291);
				unionexp();
				setState(292);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public TerminalNode Hash() { return getToken(BRICSParser.Hash, 0); }
		public Non_close_parensContext non_close_parens() {
			return getRuleContext(Non_close_parensContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(OpenParen);
			setState(297);
			match(QuestionMark);
			setState(298);
			match(Hash);
			setState(299);
			non_close_parens();
			setState(300);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public List<Option_flagsContext> option_flags() {
			return getRuleContexts(Option_flagsContext.class);
		}
		public Option_flagsContext option_flags(int i) {
			return getRuleContext(Option_flagsContext.class,i);
		}
		public TerminalNode Hyphen() { return getToken(BRICSParser.Hyphen, 0); }
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public TerminalNode Star() { return getToken(BRICSParser.Star, 0); }
		public TerminalNode NUC() { return getToken(BRICSParser.NUC, 0); }
		public List<TerminalNode> OUC() { return getTokens(BRICSParser.OUC); }
		public TerminalNode OUC(int i) {
			return getToken(BRICSParser.OUC, i);
		}
		public List<TerminalNode> Underscore() { return getTokens(BRICSParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(BRICSParser.Underscore, i);
		}
		public TerminalNode SUC() { return getToken(BRICSParser.SUC, 0); }
		public List<TerminalNode> TUC() { return getTokens(BRICSParser.TUC); }
		public TerminalNode TUC(int i) {
			return getToken(BRICSParser.TUC, i);
		}
		public TerminalNode AUC() { return getToken(BRICSParser.AUC, 0); }
		public TerminalNode RUC() { return getToken(BRICSParser.RUC, 0); }
		public TerminalNode PUC() { return getToken(BRICSParser.PUC, 0); }
		public TerminalNode UUC() { return getToken(BRICSParser.UUC, 0); }
		public TerminalNode FUC() { return getToken(BRICSParser.FUC, 0); }
		public TerminalNode D8() { return getToken(BRICSParser.D8, 0); }
		public TerminalNode D1() { return getToken(BRICSParser.D1, 0); }
		public TerminalNode D6() { return getToken(BRICSParser.D6, 0); }
		public TerminalNode CUC() { return getToken(BRICSParser.CUC, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_option);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(OpenParen);
				setState(303);
				match(QuestionMark);
				setState(304);
				option_flags();
				setState(305);
				match(Hyphen);
				setState(306);
				option_flags();
				setState(307);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(OpenParen);
				setState(310);
				match(QuestionMark);
				setState(311);
				option_flags();
				setState(312);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(OpenParen);
				setState(315);
				match(QuestionMark);
				setState(316);
				match(Hyphen);
				setState(317);
				option_flags();
				setState(318);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(OpenParen);
				setState(321);
				match(Star);
				setState(322);
				match(NUC);
				setState(323);
				match(OUC);
				setState(324);
				match(Underscore);
				setState(325);
				match(SUC);
				setState(326);
				match(TUC);
				setState(327);
				match(AUC);
				setState(328);
				match(RUC);
				setState(329);
				match(TUC);
				setState(330);
				match(Underscore);
				setState(331);
				match(OUC);
				setState(332);
				match(PUC);
				setState(333);
				match(TUC);
				setState(334);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				match(OpenParen);
				setState(336);
				match(Star);
				setState(337);
				match(UUC);
				setState(338);
				match(TUC);
				setState(339);
				match(FUC);
				setState(340);
				match(D8);
				setState(341);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				match(OpenParen);
				setState(343);
				match(Star);
				setState(344);
				match(UUC);
				setState(345);
				match(TUC);
				setState(346);
				match(FUC);
				setState(347);
				match(D1);
				setState(348);
				match(D6);
				setState(349);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(350);
				match(OpenParen);
				setState(351);
				match(Star);
				setState(352);
				match(UUC);
				setState(353);
				match(CUC);
				setState(354);
				match(PUC);
				setState(355);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_flagsContext extends ParserRuleContext {
		public List<Option_flagContext> option_flag() {
			return getRuleContexts(Option_flagContext.class);
		}
		public Option_flagContext option_flag(int i) {
			return getRuleContext(Option_flagContext.class,i);
		}
		public Option_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterOption_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitOption_flags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitOption_flags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_flagsContext option_flags() throws RecognitionException {
		Option_flagsContext _localctx = new Option_flagsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_option_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358);
				option_flag();
				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ILC - 72)) | (1L << (MLC - 72)) | (1L << (SLC - 72)) | (1L << (XLC - 72)) | (1L << (JUC - 72)) | (1L << (UUC - 72)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Option_flagContext extends ParserRuleContext {
		public TerminalNode ILC() { return getToken(BRICSParser.ILC, 0); }
		public TerminalNode JUC() { return getToken(BRICSParser.JUC, 0); }
		public TerminalNode MLC() { return getToken(BRICSParser.MLC, 0); }
		public TerminalNode SLC() { return getToken(BRICSParser.SLC, 0); }
		public TerminalNode UUC() { return getToken(BRICSParser.UUC, 0); }
		public TerminalNode XLC() { return getToken(BRICSParser.XLC, 0); }
		public Option_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterOption_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitOption_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitOption_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Option_flagContext option_flag() throws RecognitionException {
		Option_flagContext _localctx = new Option_flagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_option_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (ILC - 72)) | (1L << (MLC - 72)) | (1L << (SLC - 72)) | (1L << (XLC - 72)) | (1L << (JUC - 72)) | (1L << (UUC - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Look_aroundContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public TerminalNode Equals() { return getToken(BRICSParser.Equals, 0); }
		public UnionexpContext unionexp() {
			return getRuleContext(UnionexpContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public TerminalNode Exclamation() { return getToken(BRICSParser.Exclamation, 0); }
		public TerminalNode LessThan() { return getToken(BRICSParser.LessThan, 0); }
		public Look_aroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_look_around; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterLook_around(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitLook_around(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitLook_around(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Look_aroundContext look_around() throws RecognitionException {
		Look_aroundContext _localctx = new Look_aroundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_look_around);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(OpenParen);
				setState(366);
				match(QuestionMark);
				setState(367);
				match(Equals);
				setState(368);
				unionexp();
				setState(369);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(OpenParen);
				setState(372);
				match(QuestionMark);
				setState(373);
				match(Exclamation);
				setState(374);
				unionexp();
				setState(375);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(OpenParen);
				setState(378);
				match(QuestionMark);
				setState(379);
				match(LessThan);
				setState(380);
				match(Equals);
				setState(381);
				unionexp();
				setState(382);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				match(OpenParen);
				setState(385);
				match(QuestionMark);
				setState(386);
				match(LessThan);
				setState(387);
				match(Exclamation);
				setState(388);
				unionexp();
				setState(389);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subroutine_referenceContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public TerminalNode RUC() { return getToken(BRICSParser.RUC, 0); }
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Plus() { return getToken(BRICSParser.Plus, 0); }
		public TerminalNode Hyphen() { return getToken(BRICSParser.Hyphen, 0); }
		public TerminalNode Ampersand() { return getToken(BRICSParser.Ampersand, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PUC() { return getToken(BRICSParser.PUC, 0); }
		public TerminalNode GreaterThan() { return getToken(BRICSParser.GreaterThan, 0); }
		public TerminalNode SubroutineOrNamedReferenceStartG() { return getToken(BRICSParser.SubroutineOrNamedReferenceStartG, 0); }
		public TerminalNode LessThan() { return getToken(BRICSParser.LessThan, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(BRICSParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(BRICSParser.SingleQuote, i);
		}
		public Subroutine_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterSubroutine_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitSubroutine_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitSubroutine_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subroutine_referenceContext subroutine_reference() throws RecognitionException {
		Subroutine_referenceContext _localctx = new Subroutine_referenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_subroutine_reference);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(OpenParen);
				setState(394);
				match(QuestionMark);
				setState(395);
				match(RUC);
				setState(396);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(OpenParen);
				setState(398);
				match(QuestionMark);
				setState(399);
				number();
				setState(400);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(OpenParen);
				setState(403);
				match(QuestionMark);
				setState(404);
				match(Plus);
				setState(405);
				number();
				setState(406);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(OpenParen);
				setState(409);
				match(QuestionMark);
				setState(410);
				match(Hyphen);
				setState(411);
				number();
				setState(412);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				match(OpenParen);
				setState(415);
				match(QuestionMark);
				setState(416);
				match(Ampersand);
				setState(417);
				name();
				setState(418);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				match(OpenParen);
				setState(421);
				match(QuestionMark);
				setState(422);
				match(PUC);
				setState(423);
				match(GreaterThan);
				setState(424);
				name();
				setState(425);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				match(SubroutineOrNamedReferenceStartG);
				setState(428);
				match(LessThan);
				setState(429);
				name();
				setState(430);
				match(GreaterThan);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				match(SubroutineOrNamedReferenceStartG);
				setState(433);
				match(SingleQuote);
				setState(434);
				name();
				setState(435);
				match(SingleQuote);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(437);
				match(SubroutineOrNamedReferenceStartG);
				setState(438);
				match(LessThan);
				setState(439);
				number();
				setState(440);
				match(GreaterThan);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(442);
				match(SubroutineOrNamedReferenceStartG);
				setState(443);
				match(SingleQuote);
				setState(444);
				number();
				setState(445);
				match(SingleQuote);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(447);
				match(SubroutineOrNamedReferenceStartG);
				setState(448);
				match(LessThan);
				setState(449);
				match(Plus);
				setState(450);
				number();
				setState(451);
				match(GreaterThan);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(453);
				match(SubroutineOrNamedReferenceStartG);
				setState(454);
				match(SingleQuote);
				setState(455);
				match(Plus);
				setState(456);
				number();
				setState(457);
				match(SingleQuote);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(459);
				match(SubroutineOrNamedReferenceStartG);
				setState(460);
				match(LessThan);
				setState(461);
				match(Hyphen);
				setState(462);
				number();
				setState(463);
				match(GreaterThan);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(465);
				match(SubroutineOrNamedReferenceStartG);
				setState(466);
				match(SingleQuote);
				setState(467);
				match(Hyphen);
				setState(468);
				number();
				setState(469);
				match(SingleQuote);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public List<TerminalNode> OpenParen() { return getTokens(BRICSParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(BRICSParser.OpenParen, i);
		}
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> CloseParen() { return getTokens(BRICSParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(BRICSParser.CloseParen, i);
		}
		public List<UnionexpContext> unionexp() {
			return getRuleContexts(UnionexpContext.class);
		}
		public UnionexpContext unionexp(int i) {
			return getRuleContext(UnionexpContext.class,i);
		}
		public TerminalNode Pipe() { return getToken(BRICSParser.Pipe, 0); }
		public TerminalNode Plus() { return getToken(BRICSParser.Plus, 0); }
		public TerminalNode Hyphen() { return getToken(BRICSParser.Hyphen, 0); }
		public TerminalNode LessThan() { return getToken(BRICSParser.LessThan, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode GreaterThan() { return getToken(BRICSParser.GreaterThan, 0); }
		public List<TerminalNode> SingleQuote() { return getTokens(BRICSParser.SingleQuote); }
		public TerminalNode SingleQuote(int i) {
			return getToken(BRICSParser.SingleQuote, i);
		}
		public TerminalNode RUC() { return getToken(BRICSParser.RUC, 0); }
		public TerminalNode Ampersand() { return getToken(BRICSParser.Ampersand, 0); }
		public TerminalNode DUC() { return getToken(BRICSParser.DUC, 0); }
		public List<TerminalNode> EUC() { return getTokens(BRICSParser.EUC); }
		public TerminalNode EUC(int i) {
			return getToken(BRICSParser.EUC, i);
		}
		public TerminalNode FUC() { return getToken(BRICSParser.FUC, 0); }
		public TerminalNode IUC() { return getToken(BRICSParser.IUC, 0); }
		public TerminalNode NUC() { return getToken(BRICSParser.NUC, 0); }
		public TerminalNode ALC() { return getToken(BRICSParser.ALC, 0); }
		public List<TerminalNode> SLC() { return getTokens(BRICSParser.SLC); }
		public TerminalNode SLC(int i) {
			return getToken(BRICSParser.SLC, i);
		}
		public TerminalNode ELC() { return getToken(BRICSParser.ELC, 0); }
		public TerminalNode RLC() { return getToken(BRICSParser.RLC, 0); }
		public TerminalNode TLC() { return getToken(BRICSParser.TLC, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional);
		int _la;
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(OpenParen);
				setState(474);
				match(QuestionMark);
				setState(475);
				match(OpenParen);
				setState(476);
				number();
				setState(477);
				match(CloseParen);
				setState(478);
				unionexp();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(479);
					match(Pipe);
					setState(480);
					unionexp();
					}
				}

				setState(483);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(OpenParen);
				setState(486);
				match(QuestionMark);
				setState(487);
				match(OpenParen);
				setState(488);
				match(Plus);
				setState(489);
				number();
				setState(490);
				match(CloseParen);
				setState(491);
				unionexp();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(492);
					match(Pipe);
					setState(493);
					unionexp();
					}
				}

				setState(496);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				match(OpenParen);
				setState(499);
				match(QuestionMark);
				setState(500);
				match(OpenParen);
				setState(501);
				match(Hyphen);
				setState(502);
				number();
				setState(503);
				match(CloseParen);
				setState(504);
				unionexp();
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(505);
					match(Pipe);
					setState(506);
					unionexp();
					}
				}

				setState(509);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(OpenParen);
				setState(512);
				match(QuestionMark);
				setState(513);
				match(OpenParen);
				setState(514);
				match(LessThan);
				setState(515);
				name();
				setState(516);
				match(GreaterThan);
				setState(517);
				match(CloseParen);
				setState(518);
				unionexp();
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(519);
					match(Pipe);
					setState(520);
					unionexp();
					}
				}

				setState(523);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(525);
				match(OpenParen);
				setState(526);
				match(QuestionMark);
				setState(527);
				match(OpenParen);
				setState(528);
				match(SingleQuote);
				setState(529);
				name();
				setState(530);
				match(SingleQuote);
				setState(531);
				match(CloseParen);
				setState(532);
				unionexp();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(533);
					match(Pipe);
					setState(534);
					unionexp();
					}
				}

				setState(537);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(539);
				match(OpenParen);
				setState(540);
				match(QuestionMark);
				setState(541);
				match(OpenParen);
				setState(542);
				match(RUC);
				setState(543);
				number();
				setState(544);
				match(CloseParen);
				setState(545);
				unionexp();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(546);
					match(Pipe);
					setState(547);
					unionexp();
					}
				}

				setState(550);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
				match(OpenParen);
				setState(553);
				match(QuestionMark);
				setState(554);
				match(OpenParen);
				setState(555);
				match(RUC);
				setState(556);
				match(CloseParen);
				setState(557);
				unionexp();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(558);
					match(Pipe);
					setState(559);
					unionexp();
					}
				}

				setState(562);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(564);
				match(OpenParen);
				setState(565);
				match(QuestionMark);
				setState(566);
				match(OpenParen);
				setState(567);
				match(RUC);
				setState(568);
				match(Ampersand);
				setState(569);
				name();
				setState(570);
				match(CloseParen);
				setState(571);
				unionexp();
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(572);
					match(Pipe);
					setState(573);
					unionexp();
					}
				}

				setState(576);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(578);
				match(OpenParen);
				setState(579);
				match(QuestionMark);
				setState(580);
				match(OpenParen);
				setState(581);
				match(DUC);
				setState(582);
				match(EUC);
				setState(583);
				match(FUC);
				setState(584);
				match(IUC);
				setState(585);
				match(NUC);
				setState(586);
				match(EUC);
				setState(587);
				match(CloseParen);
				setState(588);
				unionexp();
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(589);
					match(Pipe);
					setState(590);
					unionexp();
					}
				}

				setState(593);
				match(CloseParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(595);
				match(OpenParen);
				setState(596);
				match(QuestionMark);
				setState(597);
				match(OpenParen);
				setState(598);
				match(ALC);
				setState(599);
				match(SLC);
				setState(600);
				match(SLC);
				setState(601);
				match(ELC);
				setState(602);
				match(RLC);
				setState(603);
				match(TLC);
				setState(604);
				match(CloseParen);
				setState(605);
				unionexp();
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(606);
					match(Pipe);
					setState(607);
					unionexp();
					}
				}

				setState(610);
				match(CloseParen);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(612);
				match(OpenParen);
				setState(613);
				match(QuestionMark);
				setState(614);
				match(OpenParen);
				setState(615);
				name();
				setState(616);
				match(CloseParen);
				setState(617);
				unionexp();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Pipe) {
					{
					setState(618);
					match(Pipe);
					setState(619);
					unionexp();
					}
				}

				setState(622);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Backtrack_controlContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode Star() { return getToken(BRICSParser.Star, 0); }
		public List<TerminalNode> AUC() { return getTokens(BRICSParser.AUC); }
		public TerminalNode AUC(int i) {
			return getToken(BRICSParser.AUC, i);
		}
		public List<TerminalNode> CUC() { return getTokens(BRICSParser.CUC); }
		public TerminalNode CUC(int i) {
			return getToken(BRICSParser.CUC, i);
		}
		public List<TerminalNode> EUC() { return getTokens(BRICSParser.EUC); }
		public TerminalNode EUC(int i) {
			return getToken(BRICSParser.EUC, i);
		}
		public TerminalNode PUC() { return getToken(BRICSParser.PUC, 0); }
		public TerminalNode TUC() { return getToken(BRICSParser.TUC, 0); }
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public TerminalNode FUC() { return getToken(BRICSParser.FUC, 0); }
		public TerminalNode IUC() { return getToken(BRICSParser.IUC, 0); }
		public TerminalNode LUC() { return getToken(BRICSParser.LUC, 0); }
		public TerminalNode Colon() { return getToken(BRICSParser.Colon, 0); }
		public List<TerminalNode> NUC() { return getTokens(BRICSParser.NUC); }
		public TerminalNode NUC(int i) {
			return getToken(BRICSParser.NUC, i);
		}
		public List<TerminalNode> MUC() { return getTokens(BRICSParser.MUC); }
		public TerminalNode MUC(int i) {
			return getToken(BRICSParser.MUC, i);
		}
		public TerminalNode RUC() { return getToken(BRICSParser.RUC, 0); }
		public TerminalNode KUC() { return getToken(BRICSParser.KUC, 0); }
		public TerminalNode OUC() { return getToken(BRICSParser.OUC, 0); }
		public TerminalNode UUC() { return getToken(BRICSParser.UUC, 0); }
		public TerminalNode SUC() { return getToken(BRICSParser.SUC, 0); }
		public TerminalNode HUC() { return getToken(BRICSParser.HUC, 0); }
		public Backtrack_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backtrack_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterBacktrack_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitBacktrack_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitBacktrack_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backtrack_controlContext backtrack_control() throws RecognitionException {
		Backtrack_controlContext _localctx = new Backtrack_controlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_backtrack_control);
		int _la;
		try {
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(OpenParen);
				setState(627);
				match(Star);
				setState(628);
				match(AUC);
				setState(629);
				match(CUC);
				setState(630);
				match(CUC);
				setState(631);
				match(EUC);
				setState(632);
				match(PUC);
				setState(633);
				match(TUC);
				setState(634);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(OpenParen);
				setState(636);
				match(Star);
				setState(637);
				match(FUC);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUC) {
					{
					setState(638);
					match(AUC);
					setState(639);
					match(IUC);
					setState(640);
					match(LUC);
					}
				}

				setState(643);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				match(OpenParen);
				setState(645);
				match(Star);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUC) {
					{
					setState(646);
					match(MUC);
					setState(647);
					match(AUC);
					setState(648);
					match(RUC);
					setState(649);
					match(KUC);
					}
				}

				setState(652);
				match(Colon);
				setState(653);
				match(NUC);
				setState(654);
				match(AUC);
				setState(655);
				match(MUC);
				setState(656);
				match(EUC);
				setState(657);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(658);
				match(OpenParen);
				setState(659);
				match(Star);
				setState(660);
				match(CUC);
				setState(661);
				match(OUC);
				setState(662);
				match(MUC);
				setState(663);
				match(MUC);
				setState(664);
				match(IUC);
				setState(665);
				match(TUC);
				setState(666);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(667);
				match(OpenParen);
				setState(668);
				match(Star);
				setState(669);
				match(PUC);
				setState(670);
				match(RUC);
				setState(671);
				match(UUC);
				setState(672);
				match(NUC);
				setState(673);
				match(EUC);
				setState(674);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(675);
				match(OpenParen);
				setState(676);
				match(Star);
				setState(677);
				match(PUC);
				setState(678);
				match(RUC);
				setState(679);
				match(UUC);
				setState(680);
				match(NUC);
				setState(681);
				match(EUC);
				setState(682);
				match(Colon);
				setState(683);
				match(NUC);
				setState(684);
				match(AUC);
				setState(685);
				match(MUC);
				setState(686);
				match(EUC);
				setState(687);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(688);
				match(OpenParen);
				setState(689);
				match(Star);
				setState(690);
				match(SUC);
				setState(691);
				match(KUC);
				setState(692);
				match(IUC);
				setState(693);
				match(PUC);
				setState(694);
				match(CloseParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(695);
				match(OpenParen);
				setState(696);
				match(Star);
				setState(697);
				match(SUC);
				setState(698);
				match(KUC);
				setState(699);
				match(IUC);
				setState(700);
				match(PUC);
				setState(701);
				match(Colon);
				setState(702);
				match(NUC);
				setState(703);
				match(AUC);
				setState(704);
				match(MUC);
				setState(705);
				match(EUC);
				setState(706);
				match(CloseParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(707);
				match(OpenParen);
				setState(708);
				match(Star);
				setState(709);
				match(TUC);
				setState(710);
				match(HUC);
				setState(711);
				match(EUC);
				setState(712);
				match(NUC);
				setState(713);
				match(CloseParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(714);
				match(OpenParen);
				setState(715);
				match(Star);
				setState(716);
				match(TUC);
				setState(717);
				match(HUC);
				setState(718);
				match(EUC);
				setState(719);
				match(NUC);
				setState(720);
				match(Colon);
				setState(721);
				match(NUC);
				setState(722);
				match(AUC);
				setState(723);
				match(MUC);
				setState(724);
				match(EUC);
				setState(725);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Newline_conventionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode Star() { return getToken(BRICSParser.Star, 0); }
		public TerminalNode CUC() { return getToken(BRICSParser.CUC, 0); }
		public List<TerminalNode> RUC() { return getTokens(BRICSParser.RUC); }
		public TerminalNode RUC(int i) {
			return getToken(BRICSParser.RUC, i);
		}
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public TerminalNode LUC() { return getToken(BRICSParser.LUC, 0); }
		public TerminalNode FUC() { return getToken(BRICSParser.FUC, 0); }
		public TerminalNode AUC() { return getToken(BRICSParser.AUC, 0); }
		public TerminalNode NUC() { return getToken(BRICSParser.NUC, 0); }
		public TerminalNode YUC() { return getToken(BRICSParser.YUC, 0); }
		public TerminalNode BUC() { return getToken(BRICSParser.BUC, 0); }
		public TerminalNode SUC() { return getToken(BRICSParser.SUC, 0); }
		public TerminalNode Underscore() { return getToken(BRICSParser.Underscore, 0); }
		public TerminalNode UUC() { return getToken(BRICSParser.UUC, 0); }
		public TerminalNode IUC() { return getToken(BRICSParser.IUC, 0); }
		public TerminalNode OUC() { return getToken(BRICSParser.OUC, 0); }
		public TerminalNode DUC() { return getToken(BRICSParser.DUC, 0); }
		public TerminalNode EUC() { return getToken(BRICSParser.EUC, 0); }
		public Newline_conventionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline_convention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterNewline_convention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitNewline_convention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitNewline_convention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Newline_conventionContext newline_convention() throws RecognitionException {
		Newline_conventionContext _localctx = new Newline_conventionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_newline_convention);
		try {
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(OpenParen);
				setState(729);
				match(Star);
				setState(730);
				match(CUC);
				setState(731);
				match(RUC);
				setState(732);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				match(OpenParen);
				setState(734);
				match(Star);
				setState(735);
				match(LUC);
				setState(736);
				match(FUC);
				setState(737);
				match(CloseParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(738);
				match(OpenParen);
				setState(739);
				match(Star);
				setState(740);
				match(CUC);
				setState(741);
				match(RUC);
				setState(742);
				match(LUC);
				setState(743);
				match(FUC);
				setState(744);
				match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				match(OpenParen);
				setState(746);
				match(Star);
				setState(747);
				match(AUC);
				setState(748);
				match(NUC);
				setState(749);
				match(YUC);
				setState(750);
				match(CUC);
				setState(751);
				match(RUC);
				setState(752);
				match(LUC);
				setState(753);
				match(FUC);
				setState(754);
				match(CloseParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(755);
				match(OpenParen);
				setState(756);
				match(Star);
				setState(757);
				match(AUC);
				setState(758);
				match(NUC);
				setState(759);
				match(YUC);
				setState(760);
				match(CloseParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(761);
				match(OpenParen);
				setState(762);
				match(Star);
				setState(763);
				match(BUC);
				setState(764);
				match(SUC);
				setState(765);
				match(RUC);
				setState(766);
				match(Underscore);
				setState(767);
				match(AUC);
				setState(768);
				match(NUC);
				setState(769);
				match(YUC);
				setState(770);
				match(CUC);
				setState(771);
				match(RUC);
				setState(772);
				match(LUC);
				setState(773);
				match(FUC);
				setState(774);
				match(CloseParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(775);
				match(OpenParen);
				setState(776);
				match(Star);
				setState(777);
				match(BUC);
				setState(778);
				match(SUC);
				setState(779);
				match(RUC);
				setState(780);
				match(Underscore);
				setState(781);
				match(UUC);
				setState(782);
				match(NUC);
				setState(783);
				match(IUC);
				setState(784);
				match(CUC);
				setState(785);
				match(OUC);
				setState(786);
				match(DUC);
				setState(787);
				match(EUC);
				setState(788);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalloutContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public TerminalNode CUC() { return getToken(BRICSParser.CUC, 0); }
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CalloutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterCallout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitCallout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitCallout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalloutContext callout() throws RecognitionException {
		CalloutContext _localctx = new CalloutContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_callout);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(OpenParen);
				setState(792);
				match(QuestionMark);
				setState(793);
				match(CUC);
				setState(794);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(OpenParen);
				setState(796);
				match(QuestionMark);
				setState(797);
				match(CUC);
				setState(798);
				number();
				setState(799);
				match(CloseParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Subroutine_referenceContext subroutine_reference() {
			return getRuleContext(Subroutine_referenceContext.class,0);
		}
		public Shared_atomContext shared_atom() {
			return getRuleContext(Shared_atomContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Character_classContext character_class() {
			return getRuleContext(Character_classContext.class,0);
		}
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public Non_captureContext non_capture() {
			return getRuleContext(Non_captureContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public Look_aroundContext look_around() {
			return getRuleContext(Look_aroundContext.class,0);
		}
		public BackreferenceContext backreference() {
			return getRuleContext(BackreferenceContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Backtrack_controlContext backtrack_control() {
			return getRuleContext(Backtrack_controlContext.class,0);
		}
		public Newline_conventionContext newline_convention() {
			return getRuleContext(Newline_conventionContext.class,0);
		}
		public CalloutContext callout() {
			return getRuleContext(CalloutContext.class,0);
		}
		public TerminalNode Dot() { return getToken(BRICSParser.Dot, 0); }
		public TerminalNode Caret() { return getToken(BRICSParser.Caret, 0); }
		public TerminalNode StartOfSubject() { return getToken(BRICSParser.StartOfSubject, 0); }
		public TerminalNode WordBoundary() { return getToken(BRICSParser.WordBoundary, 0); }
		public TerminalNode NonWordBoundary() { return getToken(BRICSParser.NonWordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(BRICSParser.EndOfSubjectOrLine, 0); }
		public TerminalNode EndOfSubjectOrLineEndOfSubject() { return getToken(BRICSParser.EndOfSubjectOrLineEndOfSubject, 0); }
		public TerminalNode EndOfSubject() { return getToken(BRICSParser.EndOfSubject, 0); }
		public TerminalNode PreviousMatchInSubject() { return getToken(BRICSParser.PreviousMatchInSubject, 0); }
		public TerminalNode ResetStartMatch() { return getToken(BRICSParser.ResetStartMatch, 0); }
		public TerminalNode OneDataUnit() { return getToken(BRICSParser.OneDataUnit, 0); }
		public TerminalNode ExtendedUnicodeChar() { return getToken(BRICSParser.ExtendedUnicodeChar, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				subroutine_reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				shared_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				character_class();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(807);
				capture();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(808);
				non_capture();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(809);
				comment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(810);
				option();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(811);
				look_around();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(812);
				backreference();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(813);
				conditional();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(814);
				backtrack_control();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(815);
				newline_convention();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(816);
				callout();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(817);
				match(Dot);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(818);
				match(Caret);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(819);
				match(StartOfSubject);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(820);
				match(WordBoundary);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(821);
				match(NonWordBoundary);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(822);
				match(EndOfSubjectOrLine);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(823);
				match(EndOfSubjectOrLineEndOfSubject);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(824);
				match(EndOfSubject);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(825);
				match(PreviousMatchInSubject);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(826);
				match(ResetStartMatch);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(827);
				match(OneDataUnit);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(828);
				match(ExtendedUnicodeChar);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cc_atomContext extends ParserRuleContext {
		public List<Cc_literalContext> cc_literal() {
			return getRuleContexts(Cc_literalContext.class);
		}
		public Cc_literalContext cc_literal(int i) {
			return getRuleContext(Cc_literalContext.class,i);
		}
		public TerminalNode Hyphen() { return getToken(BRICSParser.Hyphen, 0); }
		public Shared_atom2Context shared_atom2() {
			return getRuleContext(Shared_atom2Context.class,0);
		}
		public Backreference_or_octalContext backreference_or_octal() {
			return getRuleContext(Backreference_or_octalContext.class,0);
		}
		public Cc_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterCc_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitCc_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitCc_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cc_atomContext cc_atom() throws RecognitionException {
		Cc_atomContext _localctx = new Cc_atomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cc_atom);
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				cc_literal();
				setState(832);
				match(Hyphen);
				setState(833);
				cc_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				shared_atom2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				cc_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(837);
				backreference_or_octal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shared_atomContext extends ParserRuleContext {
		public TerminalNode POSIXNamedSet() { return getToken(BRICSParser.POSIXNamedSet, 0); }
		public TerminalNode POSIXNegatedNamedSet() { return getToken(BRICSParser.POSIXNegatedNamedSet, 0); }
		public TerminalNode ControlChar() { return getToken(BRICSParser.ControlChar, 0); }
		public TerminalNode DecimalDigit() { return getToken(BRICSParser.DecimalDigit, 0); }
		public TerminalNode NotDecimalDigit() { return getToken(BRICSParser.NotDecimalDigit, 0); }
		public TerminalNode HorizontalWhiteSpace() { return getToken(BRICSParser.HorizontalWhiteSpace, 0); }
		public TerminalNode NotHorizontalWhiteSpace() { return getToken(BRICSParser.NotHorizontalWhiteSpace, 0); }
		public TerminalNode NotNewLine() { return getToken(BRICSParser.NotNewLine, 0); }
		public TerminalNode CharWithProperty() { return getToken(BRICSParser.CharWithProperty, 0); }
		public TerminalNode CharWithoutProperty() { return getToken(BRICSParser.CharWithoutProperty, 0); }
		public TerminalNode NewLineSequence() { return getToken(BRICSParser.NewLineSequence, 0); }
		public TerminalNode WhiteSpace() { return getToken(BRICSParser.WhiteSpace, 0); }
		public TerminalNode NotWhiteSpace() { return getToken(BRICSParser.NotWhiteSpace, 0); }
		public TerminalNode VerticalWhiteSpace() { return getToken(BRICSParser.VerticalWhiteSpace, 0); }
		public TerminalNode NotVerticalWhiteSpace() { return getToken(BRICSParser.NotVerticalWhiteSpace, 0); }
		public TerminalNode WordChar() { return getToken(BRICSParser.WordChar, 0); }
		public TerminalNode NotWordChar() { return getToken(BRICSParser.NotWordChar, 0); }
		public Shared_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterShared_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitShared_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitShared_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shared_atomContext shared_atom() throws RecognitionException {
		Shared_atomContext _localctx = new Shared_atomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_shared_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ControlChar) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shared_atom2Context extends ParserRuleContext {
		public TerminalNode POSIXNamedSet() { return getToken(BRICSParser.POSIXNamedSet, 0); }
		public TerminalNode POSIXNegatedNamedSet() { return getToken(BRICSParser.POSIXNegatedNamedSet, 0); }
		public TerminalNode ControlChar() { return getToken(BRICSParser.ControlChar, 0); }
		public TerminalNode DecimalDigit() { return getToken(BRICSParser.DecimalDigit, 0); }
		public TerminalNode NotDecimalDigit() { return getToken(BRICSParser.NotDecimalDigit, 0); }
		public TerminalNode HorizontalWhiteSpace() { return getToken(BRICSParser.HorizontalWhiteSpace, 0); }
		public TerminalNode NotHorizontalWhiteSpace() { return getToken(BRICSParser.NotHorizontalWhiteSpace, 0); }
		public TerminalNode NotNewLine() { return getToken(BRICSParser.NotNewLine, 0); }
		public TerminalNode CharWithProperty() { return getToken(BRICSParser.CharWithProperty, 0); }
		public TerminalNode CharWithoutProperty() { return getToken(BRICSParser.CharWithoutProperty, 0); }
		public TerminalNode NewLineSequence() { return getToken(BRICSParser.NewLineSequence, 0); }
		public TerminalNode WhiteSpace() { return getToken(BRICSParser.WhiteSpace, 0); }
		public TerminalNode NotWhiteSpace() { return getToken(BRICSParser.NotWhiteSpace, 0); }
		public TerminalNode VerticalWhiteSpace() { return getToken(BRICSParser.VerticalWhiteSpace, 0); }
		public TerminalNode NotVerticalWhiteSpace() { return getToken(BRICSParser.NotVerticalWhiteSpace, 0); }
		public TerminalNode WordChar() { return getToken(BRICSParser.WordChar, 0); }
		public TerminalNode NotWordChar() { return getToken(BRICSParser.NotWordChar, 0); }
		public Shared_atom2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_atom2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterShared_atom2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitShared_atom2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitShared_atom2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shared_atom2Context shared_atom2() throws RecognitionException {
		Shared_atom2Context _localctx = new Shared_atom2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_shared_atom2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ControlChar) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Shared_literalContext shared_literal() {
			return getRuleContext(Shared_literalContext.class,0);
		}
		public TerminalNode CharacterClassEnd() { return getToken(BRICSParser.CharacterClassEnd, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		try {
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Quoted:
			case BlockQuoted:
			case BellChar:
			case EscapeChar:
			case FormFeed:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case HexChar:
			case Hyphen:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
			case OtherChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				shared_literal();
				}
				break;
			case CharacterClassEnd:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(CharacterClassEnd);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cc_literalContext extends ParserRuleContext {
		public Shared_literalContext shared_literal() {
			return getRuleContext(Shared_literalContext.class,0);
		}
		public TerminalNode Dot() { return getToken(BRICSParser.Dot, 0); }
		public TerminalNode CharacterClassStart() { return getToken(BRICSParser.CharacterClassStart, 0); }
		public TerminalNode Caret() { return getToken(BRICSParser.Caret, 0); }
		public TerminalNode QuestionMark() { return getToken(BRICSParser.QuestionMark, 0); }
		public TerminalNode Plus() { return getToken(BRICSParser.Plus, 0); }
		public TerminalNode Star() { return getToken(BRICSParser.Star, 0); }
		public TerminalNode WordBoundary() { return getToken(BRICSParser.WordBoundary, 0); }
		public TerminalNode EndOfSubjectOrLine() { return getToken(BRICSParser.EndOfSubjectOrLine, 0); }
		public TerminalNode Pipe() { return getToken(BRICSParser.Pipe, 0); }
		public TerminalNode OpenParen() { return getToken(BRICSParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public Cc_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterCc_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitCc_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitCc_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cc_literalContext cc_literal() throws RecognitionException {
		Cc_literalContext _localctx = new Cc_literalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cc_literal);
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Letter:
			case Quoted:
			case BlockQuoted:
			case BellChar:
			case EscapeChar:
			case FormFeed:
			case NewLine:
			case CarriageReturn:
			case Tab:
			case Backslash:
			case HexChar:
			case Hyphen:
			case OpenBrace:
			case CloseBrace:
			case Comma:
			case LessThan:
			case GreaterThan:
			case SingleQuote:
			case Underscore:
			case Colon:
			case Hash:
			case Equals:
			case Exclamation:
			case Ampersand:
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
			case OtherChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				shared_literal();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				match(Dot);
				}
				break;
			case CharacterClassStart:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				match(CharacterClassStart);
				}
				break;
			case Caret:
				enterOuterAlt(_localctx, 4);
				{
				setState(851);
				match(Caret);
				}
				break;
			case QuestionMark:
				enterOuterAlt(_localctx, 5);
				{
				setState(852);
				match(QuestionMark);
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 7);
				{
				setState(854);
				match(Star);
				}
				break;
			case WordBoundary:
				enterOuterAlt(_localctx, 8);
				{
				setState(855);
				match(WordBoundary);
				}
				break;
			case EndOfSubjectOrLine:
				enterOuterAlt(_localctx, 9);
				{
				setState(856);
				match(EndOfSubjectOrLine);
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 10);
				{
				setState(857);
				match(Pipe);
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 11);
				{
				setState(858);
				match(OpenParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 12);
				{
				setState(859);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shared_literalContext extends ParserRuleContext {
		public Octal_charContext octal_char() {
			return getRuleContext(Octal_charContext.class,0);
		}
		public TerminalNode Letter() { return getToken(BRICSParser.Letter, 0); }
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode BellChar() { return getToken(BRICSParser.BellChar, 0); }
		public TerminalNode EscapeChar() { return getToken(BRICSParser.EscapeChar, 0); }
		public TerminalNode FormFeed() { return getToken(BRICSParser.FormFeed, 0); }
		public TerminalNode NewLine() { return getToken(BRICSParser.NewLine, 0); }
		public TerminalNode CarriageReturn() { return getToken(BRICSParser.CarriageReturn, 0); }
		public TerminalNode Tab() { return getToken(BRICSParser.Tab, 0); }
		public TerminalNode HexChar() { return getToken(BRICSParser.HexChar, 0); }
		public TerminalNode Quoted() { return getToken(BRICSParser.Quoted, 0); }
		public TerminalNode BlockQuoted() { return getToken(BRICSParser.BlockQuoted, 0); }
		public TerminalNode OpenBrace() { return getToken(BRICSParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(BRICSParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(BRICSParser.Comma, 0); }
		public TerminalNode Hyphen() { return getToken(BRICSParser.Hyphen, 0); }
		public TerminalNode LessThan() { return getToken(BRICSParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(BRICSParser.GreaterThan, 0); }
		public TerminalNode SingleQuote() { return getToken(BRICSParser.SingleQuote, 0); }
		public TerminalNode Underscore() { return getToken(BRICSParser.Underscore, 0); }
		public TerminalNode Colon() { return getToken(BRICSParser.Colon, 0); }
		public TerminalNode Hash() { return getToken(BRICSParser.Hash, 0); }
		public TerminalNode Equals() { return getToken(BRICSParser.Equals, 0); }
		public TerminalNode Exclamation() { return getToken(BRICSParser.Exclamation, 0); }
		public TerminalNode Ampersand() { return getToken(BRICSParser.Ampersand, 0); }
		public TerminalNode OtherChar() { return getToken(BRICSParser.OtherChar, 0); }
		public Shared_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterShared_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitShared_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitShared_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shared_literalContext shared_literal() throws RecognitionException {
		Shared_literalContext _localctx = new Shared_literalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shared_literal);
		try {
			setState(888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Backslash:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				octal_char();
				}
				break;
			case Letter:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				match(Letter);
				}
				break;
			case D1:
			case D2:
			case D3:
			case D4:
			case D5:
			case D6:
			case D7:
			case D8:
			case D9:
			case D0:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				digit();
				}
				break;
			case BellChar:
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
				match(BellChar);
				}
				break;
			case EscapeChar:
				enterOuterAlt(_localctx, 5);
				{
				setState(866);
				match(EscapeChar);
				}
				break;
			case FormFeed:
				enterOuterAlt(_localctx, 6);
				{
				setState(867);
				match(FormFeed);
				}
				break;
			case NewLine:
				enterOuterAlt(_localctx, 7);
				{
				setState(868);
				match(NewLine);
				}
				break;
			case CarriageReturn:
				enterOuterAlt(_localctx, 8);
				{
				setState(869);
				match(CarriageReturn);
				}
				break;
			case Tab:
				enterOuterAlt(_localctx, 9);
				{
				setState(870);
				match(Tab);
				}
				break;
			case HexChar:
				enterOuterAlt(_localctx, 10);
				{
				setState(871);
				match(HexChar);
				}
				break;
			case Quoted:
				enterOuterAlt(_localctx, 11);
				{
				setState(872);
				match(Quoted);
				}
				break;
			case BlockQuoted:
				enterOuterAlt(_localctx, 12);
				{
				setState(873);
				match(BlockQuoted);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 13);
				{
				setState(874);
				match(OpenBrace);
				}
				break;
			case CloseBrace:
				enterOuterAlt(_localctx, 14);
				{
				setState(875);
				match(CloseBrace);
				}
				break;
			case Comma:
				enterOuterAlt(_localctx, 15);
				{
				setState(876);
				match(Comma);
				}
				break;
			case Hyphen:
				enterOuterAlt(_localctx, 16);
				{
				setState(877);
				match(Hyphen);
				}
				break;
			case LessThan:
				enterOuterAlt(_localctx, 17);
				{
				setState(878);
				match(LessThan);
				}
				break;
			case GreaterThan:
				enterOuterAlt(_localctx, 18);
				{
				setState(879);
				match(GreaterThan);
				}
				break;
			case SingleQuote:
				enterOuterAlt(_localctx, 19);
				{
				setState(880);
				match(SingleQuote);
				}
				break;
			case Underscore:
				enterOuterAlt(_localctx, 20);
				{
				setState(881);
				match(Underscore);
				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 21);
				{
				setState(882);
				match(Colon);
				}
				break;
			case Hash:
				enterOuterAlt(_localctx, 22);
				{
				setState(883);
				match(Hash);
				}
				break;
			case Equals:
				enterOuterAlt(_localctx, 23);
				{
				setState(884);
				match(Equals);
				}
				break;
			case Exclamation:
				enterOuterAlt(_localctx, 24);
				{
				setState(885);
				match(Exclamation);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 25);
				{
				setState(886);
				match(Ampersand);
				}
				break;
			case OtherChar:
				enterOuterAlt(_localctx, 26);
				{
				setState(887);
				match(OtherChar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public DigitsContext digits() {
			return getRuleContext(DigitsContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			digits();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Octal_charContext extends ParserRuleContext {
		public TerminalNode Backslash() { return getToken(BRICSParser.Backslash, 0); }
		public List<Octal_digitContext> octal_digit() {
			return getRuleContexts(Octal_digitContext.class);
		}
		public Octal_digitContext octal_digit(int i) {
			return getRuleContext(Octal_digitContext.class,i);
		}
		public TerminalNode D0() { return getToken(BRICSParser.D0, 0); }
		public TerminalNode D1() { return getToken(BRICSParser.D1, 0); }
		public TerminalNode D2() { return getToken(BRICSParser.D2, 0); }
		public TerminalNode D3() { return getToken(BRICSParser.D3, 0); }
		public Octal_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterOctal_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitOctal_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitOctal_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_charContext octal_char() throws RecognitionException {
		Octal_charContext _localctx = new Octal_charContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_octal_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(892);
				match(Backslash);
				setState(893);
				_la = _input.LA(1);
				if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D0 - 116)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(894);
				octal_digit();
				setState(895);
				octal_digit();
				}
				break;
			case 2:
				{
				setState(897);
				match(Backslash);
				setState(898);
				octal_digit();
				setState(899);
				octal_digit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Octal_digitContext extends ParserRuleContext {
		public TerminalNode D0() { return getToken(BRICSParser.D0, 0); }
		public TerminalNode D1() { return getToken(BRICSParser.D1, 0); }
		public TerminalNode D2() { return getToken(BRICSParser.D2, 0); }
		public TerminalNode D3() { return getToken(BRICSParser.D3, 0); }
		public TerminalNode D4() { return getToken(BRICSParser.D4, 0); }
		public TerminalNode D5() { return getToken(BRICSParser.D5, 0); }
		public TerminalNode D6() { return getToken(BRICSParser.D6, 0); }
		public TerminalNode D7() { return getToken(BRICSParser.D7, 0); }
		public Octal_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octal_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterOctal_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitOctal_digit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitOctal_digit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octal_digitContext octal_digit() throws RecognitionException {
		Octal_digitContext _localctx = new Octal_digitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_octal_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D0 - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitsContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public DigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitDigits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitDigits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitsContext digits() throws RecognitionException {
		DigitsContext _localctx = new DigitsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_digits);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(906); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(905);
					digit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(908); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode D0() { return getToken(BRICSParser.D0, 0); }
		public TerminalNode D1() { return getToken(BRICSParser.D1, 0); }
		public TerminalNode D2() { return getToken(BRICSParser.D2, 0); }
		public TerminalNode D3() { return getToken(BRICSParser.D3, 0); }
		public TerminalNode D4() { return getToken(BRICSParser.D4, 0); }
		public TerminalNode D5() { return getToken(BRICSParser.D5, 0); }
		public TerminalNode D6() { return getToken(BRICSParser.D6, 0); }
		public TerminalNode D7() { return getToken(BRICSParser.D7, 0); }
		public TerminalNode D8() { return getToken(BRICSParser.D8, 0); }
		public TerminalNode D9() { return getToken(BRICSParser.D9, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D8 - 116)) | (1L << (D9 - 116)) | (1L << (D0 - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Alpha_numsContext alpha_nums() {
			return getRuleContext(Alpha_numsContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			alpha_nums();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alpha_numsContext extends ParserRuleContext {
		public List<TerminalNode> Letter() { return getTokens(BRICSParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(BRICSParser.Letter, i);
		}
		public List<TerminalNode> Underscore() { return getTokens(BRICSParser.Underscore); }
		public TerminalNode Underscore(int i) {
			return getToken(BRICSParser.Underscore, i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Alpha_numsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_nums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterAlpha_nums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitAlpha_nums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitAlpha_nums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alpha_numsContext alpha_nums() throws RecognitionException {
		Alpha_numsContext _localctx = new Alpha_numsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alpha_nums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_la = _input.LA(1);
			if ( !(_la==Letter || _la==Underscore) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Letter || _la==Underscore || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (D1 - 116)) | (1L << (D2 - 116)) | (1L << (D3 - 116)) | (1L << (D4 - 116)) | (1L << (D5 - 116)) | (1L << (D6 - 116)) | (1L << (D7 - 116)) | (1L << (D8 - 116)) | (1L << (D9 - 116)) | (1L << (D0 - 116)))) != 0)) {
				{
				setState(918);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Letter:
					{
					setState(915);
					match(Letter);
					}
					break;
				case Underscore:
					{
					setState(916);
					match(Underscore);
					}
					break;
				case D1:
				case D2:
				case D3:
				case D4:
				case D5:
				case D6:
				case D7:
				case D8:
				case D9:
				case D0:
					{
					setState(917);
					digit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_close_parensContext extends ParserRuleContext {
		public List<Non_close_parenContext> non_close_paren() {
			return getRuleContexts(Non_close_parenContext.class);
		}
		public Non_close_parenContext non_close_paren(int i) {
			return getRuleContext(Non_close_parenContext.class,i);
		}
		public Non_close_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_close_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterNon_close_parens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitNon_close_parens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitNon_close_parens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_close_parensContext non_close_parens() throws RecognitionException {
		Non_close_parensContext _localctx = new Non_close_parensContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_non_close_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(923);
				non_close_paren();
				}
				}
				setState(926); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Letter) | (1L << Quoted) | (1L << BlockQuoted) | (1L << BellChar) | (1L << ControlChar) | (1L << EscapeChar) | (1L << FormFeed) | (1L << NewLine) | (1L << CarriageReturn) | (1L << Tab) | (1L << Backslash) | (1L << HexChar) | (1L << Dot) | (1L << OneDataUnit) | (1L << DecimalDigit) | (1L << NotDecimalDigit) | (1L << HorizontalWhiteSpace) | (1L << NotHorizontalWhiteSpace) | (1L << NotNewLine) | (1L << CharWithProperty) | (1L << CharWithoutProperty) | (1L << NewLineSequence) | (1L << WhiteSpace) | (1L << NotWhiteSpace) | (1L << VerticalWhiteSpace) | (1L << NotVerticalWhiteSpace) | (1L << WordChar) | (1L << NotWordChar) | (1L << ExtendedUnicodeChar) | (1L << CharacterClassStart) | (1L << CharacterClassEnd) | (1L << Caret) | (1L << Hyphen) | (1L << POSIXNamedSet) | (1L << POSIXNegatedNamedSet) | (1L << QuestionMark) | (1L << Plus) | (1L << Star) | (1L << OpenBrace) | (1L << CloseBrace) | (1L << Comma) | (1L << WordBoundary) | (1L << NonWordBoundary) | (1L << StartOfSubject) | (1L << EndOfSubjectOrLine) | (1L << EndOfSubjectOrLineEndOfSubject) | (1L << EndOfSubject) | (1L << PreviousMatchInSubject) | (1L << ResetStartMatch) | (1L << SubroutineOrNamedReferenceStartG) | (1L << NamedReferenceStartK) | (1L << Pipe) | (1L << OpenParen) | (1L << LessThan) | (1L << GreaterThan) | (1L << SingleQuote) | (1L << Underscore) | (1L << Colon) | (1L << Hash) | (1L << Equals) | (1L << Exclamation) | (1L << Ampersand))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ALC - 64)) | (1L << (BLC - 64)) | (1L << (CLC - 64)) | (1L << (DLC - 64)) | (1L << (ELC - 64)) | (1L << (FLC - 64)) | (1L << (GLC - 64)) | (1L << (HLC - 64)) | (1L << (ILC - 64)) | (1L << (JLC - 64)) | (1L << (KLC - 64)) | (1L << (LLC - 64)) | (1L << (MLC - 64)) | (1L << (NLC - 64)) | (1L << (OLC - 64)) | (1L << (PLC - 64)) | (1L << (QLC - 64)) | (1L << (RLC - 64)) | (1L << (SLC - 64)) | (1L << (TLC - 64)) | (1L << (ULC - 64)) | (1L << (VLC - 64)) | (1L << (WLC - 64)) | (1L << (XLC - 64)) | (1L << (YLC - 64)) | (1L << (ZLC - 64)) | (1L << (AUC - 64)) | (1L << (BUC - 64)) | (1L << (CUC - 64)) | (1L << (DUC - 64)) | (1L << (EUC - 64)) | (1L << (FUC - 64)) | (1L << (GUC - 64)) | (1L << (HUC - 64)) | (1L << (IUC - 64)) | (1L << (JUC - 64)) | (1L << (KUC - 64)) | (1L << (LUC - 64)) | (1L << (MUC - 64)) | (1L << (NUC - 64)) | (1L << (OUC - 64)) | (1L << (PUC - 64)) | (1L << (QUC - 64)) | (1L << (RUC - 64)) | (1L << (SUC - 64)) | (1L << (TUC - 64)) | (1L << (UUC - 64)) | (1L << (VUC - 64)) | (1L << (WUC - 64)) | (1L << (XUC - 64)) | (1L << (YUC - 64)) | (1L << (ZUC - 64)) | (1L << (D1 - 64)) | (1L << (D2 - 64)) | (1L << (D3 - 64)) | (1L << (D4 - 64)) | (1L << (D5 - 64)) | (1L << (D6 - 64)) | (1L << (D7 - 64)) | (1L << (D8 - 64)) | (1L << (D9 - 64)) | (1L << (D0 - 64)) | (1L << (OtherChar - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_close_parenContext extends ParserRuleContext {
		public TerminalNode CloseParen() { return getToken(BRICSParser.CloseParen, 0); }
		public Non_close_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_close_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).enterNon_close_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BRICSListener ) ((BRICSListener)listener).exitNon_close_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BRICSVisitor ) return ((BRICSVisitor<? extends T>)visitor).visitNon_close_paren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_close_parenContext non_close_paren() throws RecognitionException {
		Non_close_parenContext _localctx = new Non_close_parenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_non_close_paren);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==CloseParen) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0080\u03a5\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\7"+
		"\3U\n\3\f\3\16\3X\13\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4\5\4b\n\4\3\5\3"+
		"\5\3\5\3\5\5\5h\n\5\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0086"+
		"\n\7\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\t\3\t\3\t\6\t\u0092\n\t\r\t\16"+
		"\t\u0093\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009c\n\t\f\t\16\t\u009f\13\t\3\t"+
		"\3\t\3\t\3\t\6\t\u00a5\n\t\r\t\16\t\u00a6\3\t\3\t\3\t\3\t\3\t\3\t\6\t"+
		"\u00af\n\t\r\t\16\t\u00b0\3\t\3\t\3\t\3\t\3\t\7\t\u00b8\n\t\f\t\16\t\u00bb"+
		"\13\t\3\t\3\t\3\t\6\t\u00c0\n\t\r\t\16\t\u00c1\3\t\3\t\5\t\u00c6\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f1\n\n\3\13\3\13\3\13\5\13\u00f6\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0115\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0129"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0167\n\17\3\20\6\20\u016a\n\20\r\20\16"+
		"\20\u016b\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u018a\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u01da\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01e4\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01f1\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01fe\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u020c"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u021a\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0227\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0233"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0241\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0252\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0263\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u026f\n\24\3\24\3\24\5\24\u0273\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0284\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u028d"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u02d9\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0318\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0324"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0340\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0349\n\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\5\34\u0351\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u035f\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u037b\n\36\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \5 \u0388\n \3!\3!\3\"\6\"\u038d\n\"\r\"\16\"\u038e"+
		"\3#\3#\3$\3$\3%\3%\3%\3%\7%\u0399\n%\f%\16%\u039c\13%\3&\6&\u039f\n&\r"+
		"&\16&\u03a0\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJL\2\t\b\2JJNNTTYYeepp\5\2\7\7\21\36$%\4\2"+
		"vx\177\177\4\2v|\177\177\3\2v\177\4\2\3\3<<\3\288\2\u0428\2N\3\2\2\2\4"+
		"Z\3\2\2\2\6a\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\f\u0085\3\2\2\2\16\u008a\3"+
		"\2\2\2\20\u00c5\3\2\2\2\22\u00f0\3\2\2\2\24\u00f5\3\2\2\2\26\u0114\3\2"+
		"\2\2\30\u0128\3\2\2\2\32\u012a\3\2\2\2\34\u0166\3\2\2\2\36\u0169\3\2\2"+
		"\2 \u016d\3\2\2\2\"\u0189\3\2\2\2$\u01d9\3\2\2\2&\u0272\3\2\2\2(\u02d8"+
		"\3\2\2\2*\u0317\3\2\2\2,\u0323\3\2\2\2.\u033f\3\2\2\2\60\u0348\3\2\2\2"+
		"\62\u034a\3\2\2\2\64\u034c\3\2\2\2\66\u0350\3\2\2\28\u035e\3\2\2\2:\u037a"+
		"\3\2\2\2<\u037c\3\2\2\2>\u0387\3\2\2\2@\u0389\3\2\2\2B\u038c\3\2\2\2D"+
		"\u0390\3\2\2\2F\u0392\3\2\2\2H\u0394\3\2\2\2J\u039e\3\2\2\2L\u03a2\3\2"+
		"\2\2NO\5\4\3\2OP\7\2\2\3P\3\3\2\2\2QV\5\6\4\2RS\7\66\2\2SU\5\4\3\2TR\3"+
		"\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W[\3\2\2\2XV\3\2\2\2Y[\5\6\4\2ZQ\3"+
		"\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\]\5\b\5\2]^\7A\2\2^_\5\6\4\2_b\3\2\2\2`b"+
		"\5\b\5\2a\\\3\2\2\2a`\3\2\2\2b\7\3\2\2\2ch\5\n\6\2de\5\n\6\2ef\5\b\5\2"+
		"fh\3\2\2\2gc\3\2\2\2gd\3\2\2\2h\t\3\2\2\2ik\5.\30\2jl\5\f\7\2kj\3\2\2"+
		"\2kl\3\2\2\2l\13\3\2\2\2mn\7&\2\2n\u0086\5\16\b\2op\7\'\2\2p\u0086\5\16"+
		"\b\2qr\7(\2\2r\u0086\5\16\b\2st\7)\2\2tu\5<\37\2uv\7*\2\2vw\5\16\b\2w"+
		"\u0086\3\2\2\2xy\7)\2\2yz\5<\37\2z{\7+\2\2{|\7*\2\2|}\5\16\b\2}\u0086"+
		"\3\2\2\2~\177\7)\2\2\177\u0080\5<\37\2\u0080\u0081\7+\2\2\u0081\u0082"+
		"\5<\37\2\u0082\u0083\7*\2\2\u0083\u0084\5\16\b\2\u0084\u0086\3\2\2\2\u0085"+
		"m\3\2\2\2\u0085o\3\2\2\2\u0085q\3\2\2\2\u0085s\3\2\2\2\u0085x\3\2\2\2"+
		"\u0085~\3\2\2\2\u0086\r\3\2\2\2\u0087\u008b\7\'\2\2\u0088\u008b\7&\2\2"+
		"\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\17\3\2\2\2\u008c\u008d\7 \2\2\u008d\u008e\7\"\2\2\u008e"+
		"\u008f\7!\2\2\u008f\u0091\7#\2\2\u0090\u0092\5\60\31\2\u0091\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7!\2\2\u0096\u00c6\3\2\2\2\u0097\u0098\7 \2"+
		"\2\u0098\u0099\7\"\2\2\u0099\u009d\7!\2\2\u009a\u009c\5\60\31\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00c6\7!\2\2\u00a1"+
		"\u00a2\7 \2\2\u00a2\u00a4\7\"\2\2\u00a3\u00a5\5\60\31\2\u00a4\u00a3\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\7!\2\2\u00a9\u00c6\3\2\2\2\u00aa\u00ab\7 \2"+
		"\2\u00ab\u00ac\7!\2\2\u00ac\u00ae\7#\2\2\u00ad\u00af\5\60\31\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\7!\2\2\u00b3\u00c6\3\2\2\2\u00b4\u00b5\7 \2"+
		"\2\u00b5\u00b9\7!\2\2\u00b6\u00b8\5\60\31\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c6\7!\2\2\u00bd\u00bf\7 \2\2\u00be\u00c0"+
		"\5\60\31\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7!\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u008c\3\2\2\2\u00c5\u0097\3\2\2\2\u00c5\u00a1\3\2\2\2\u00c5"+
		"\u00aa\3\2\2\2\u00c5\u00b4\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c6\21\3\2\2"+
		"\2\u00c7\u00f1\5\24\13\2\u00c8\u00c9\7\64\2\2\u00c9\u00f1\5<\37\2\u00ca"+
		"\u00cb\7\64\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd\5<\37\2\u00cd\u00ce\7*"+
		"\2\2\u00ce\u00f1\3\2\2\2\u00cf\u00d0\7\64\2\2\u00d0\u00d1\7)\2\2\u00d1"+
		"\u00d2\7#\2\2\u00d2\u00d3\5<\37\2\u00d3\u00d4\7*\2\2\u00d4\u00f1\3\2\2"+
		"\2\u00d5\u00d6\7\65\2\2\u00d6\u00d7\79\2\2\u00d7\u00d8\5F$\2\u00d8\u00d9"+
		"\7:\2\2\u00d9\u00f1\3\2\2\2\u00da\u00db\7\65\2\2\u00db\u00dc\7;\2\2\u00dc"+
		"\u00dd\5F$\2\u00dd\u00de\7;\2\2\u00de\u00f1\3\2\2\2\u00df\u00e0\7\64\2"+
		"\2\u00e0\u00e1\7)\2\2\u00e1\u00e2\5F$\2\u00e2\u00e3\7*\2\2\u00e3\u00f1"+
		"\3\2\2\2\u00e4\u00e5\7\65\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e7\5F$\2\u00e7"+
		"\u00e8\7*\2\2\u00e8\u00f1\3\2\2\2\u00e9\u00ea\7\67\2\2\u00ea\u00eb\7&"+
		"\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7?\2\2\u00ed\u00ee\5F$\2\u00ee\u00ef"+
		"\78\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00c7\3\2\2\2\u00f0\u00c8\3\2\2\2\u00f0"+
		"\u00ca\3\2\2\2\u00f0\u00cf\3\2\2\2\u00f0\u00d5\3\2\2\2\u00f0\u00da\3\2"+
		"\2\2\u00f0\u00df\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f1"+
		"\23\3\2\2\2\u00f2\u00f6\5> \2\u00f3\u00f4\7\r\2\2\u00f4\u00f6\5D#\2\u00f5"+
		"\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\25\3\2\2\2\u00f7\u00f8\7\67\2"+
		"\2\u00f8\u00f9\7&\2\2\u00f9\u00fa\79\2\2\u00fa\u00fb\5F$\2\u00fb\u00fc"+
		"\7:\2\2\u00fc\u00fd\5\4\3\2\u00fd\u00fe\78\2\2\u00fe\u0115\3\2\2\2\u00ff"+
		"\u0100\7\67\2\2\u0100\u0101\7&\2\2\u0101\u0102\7;\2\2\u0102\u0103\5F$"+
		"\2\u0103\u0104\7;\2\2\u0104\u0105\5\4\3\2\u0105\u0106\78\2\2\u0106\u0115"+
		"\3\2\2\2\u0107\u0108\7\67\2\2\u0108\u0109\7&\2\2\u0109\u010a\7k\2\2\u010a"+
		"\u010b\79\2\2\u010b\u010c\5F$\2\u010c\u010d\7:\2\2\u010d\u010e\5\4\3\2"+
		"\u010e\u010f\78\2\2\u010f\u0115\3\2\2\2\u0110\u0111\7\67\2\2\u0111\u0112"+
		"\5\4\3\2\u0112\u0113\78\2\2\u0113\u0115\3\2\2\2\u0114\u00f7\3\2\2\2\u0114"+
		"\u00ff\3\2\2\2\u0114\u0107\3\2\2\2\u0114\u0110\3\2\2\2\u0115\27\3\2\2"+
		"\2\u0116\u0117\7\67\2\2\u0117\u0118\7&\2\2\u0118\u0119\7=\2\2\u0119\u011a"+
		"\5\4\3\2\u011a\u011b\78\2\2\u011b\u0129\3\2\2\2\u011c\u011d\7\67\2\2\u011d"+
		"\u011e\7&\2\2\u011e\u011f\7\66\2\2\u011f\u0120\5\4\3\2\u0120\u0121\78"+
		"\2\2\u0121\u0129\3\2\2\2\u0122\u0123\7\67\2\2\u0123\u0124\7&\2\2\u0124"+
		"\u0125\7:\2\2\u0125\u0126\5\4\3\2\u0126\u0127\78\2\2\u0127\u0129\3\2\2"+
		"\2\u0128\u0116\3\2\2\2\u0128\u011c\3\2\2\2\u0128\u0122\3\2\2\2\u0129\31"+
		"\3\2\2\2\u012a\u012b\7\67\2\2\u012b\u012c\7&\2\2\u012c\u012d\7>\2\2\u012d"+
		"\u012e\5J&\2\u012e\u012f\78\2\2\u012f\33\3\2\2\2\u0130\u0131\7\67\2\2"+
		"\u0131\u0132\7&\2\2\u0132\u0133\5\36\20\2\u0133\u0134\7#\2\2\u0134\u0135"+
		"\5\36\20\2\u0135\u0136\78\2\2\u0136\u0167\3\2\2\2\u0137\u0138\7\67\2\2"+
		"\u0138\u0139\7&\2\2\u0139\u013a\5\36\20\2\u013a\u013b\78\2\2\u013b\u0167"+
		"\3\2\2\2\u013c\u013d\7\67\2\2\u013d\u013e\7&\2\2\u013e\u013f\7#\2\2\u013f"+
		"\u0140\5\36\20\2\u0140\u0141\78\2\2\u0141\u0167\3\2\2\2\u0142\u0143\7"+
		"\67\2\2\u0143\u0144\7(\2\2\u0144\u0145\7i\2\2\u0145\u0146\7j\2\2\u0146"+
		"\u0147\7<\2\2\u0147\u0148\7n\2\2\u0148\u0149\7o\2\2\u0149\u014a\7\\\2"+
		"\2\u014a\u014b\7m\2\2\u014b\u014c\7o\2\2\u014c\u014d\7<\2\2\u014d\u014e"+
		"\7j\2\2\u014e\u014f\7k\2\2\u014f\u0150\7o\2\2\u0150\u0167\78\2\2\u0151"+
		"\u0152\7\67\2\2\u0152\u0153\7(\2\2\u0153\u0154\7p\2\2\u0154\u0155\7o\2"+
		"\2\u0155\u0156\7a\2\2\u0156\u0157\7}\2\2\u0157\u0167\78\2\2\u0158\u0159"+
		"\7\67\2\2\u0159\u015a\7(\2\2\u015a\u015b\7p\2\2\u015b\u015c\7o\2\2\u015c"+
		"\u015d\7a\2\2\u015d\u015e\7v\2\2\u015e\u015f\7{\2\2\u015f\u0167\78\2\2"+
		"\u0160\u0161\7\67\2\2\u0161\u0162\7(\2\2\u0162\u0163\7p\2\2\u0163\u0164"+
		"\7^\2\2\u0164\u0165\7k\2\2\u0165\u0167\78\2\2\u0166\u0130\3\2\2\2\u0166"+
		"\u0137\3\2\2\2\u0166\u013c\3\2\2\2\u0166\u0142\3\2\2\2\u0166\u0151\3\2"+
		"\2\2\u0166\u0158\3\2\2\2\u0166\u0160\3\2\2\2\u0167\35\3\2\2\2\u0168\u016a"+
		"\5 \21\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\37\3\2\2\2\u016d\u016e\t\2\2\2\u016e!\3\2\2\2\u016f"+
		"\u0170\7\67\2\2\u0170\u0171\7&\2\2\u0171\u0172\7?\2\2\u0172\u0173\5\4"+
		"\3\2\u0173\u0174\78\2\2\u0174\u018a\3\2\2\2\u0175\u0176\7\67\2\2\u0176"+
		"\u0177\7&\2\2\u0177\u0178\7@\2\2\u0178\u0179\5\4\3\2\u0179\u017a\78\2"+
		"\2\u017a\u018a\3\2\2\2\u017b\u017c\7\67\2\2\u017c\u017d\7&\2\2\u017d\u017e"+
		"\79\2\2\u017e\u017f\7?\2\2\u017f\u0180\5\4\3\2\u0180\u0181\78\2\2\u0181"+
		"\u018a\3\2\2\2\u0182\u0183\7\67\2\2\u0183\u0184\7&\2\2\u0184\u0185\79"+
		"\2\2\u0185\u0186\7@\2\2\u0186\u0187\5\4\3\2\u0187\u0188\78\2\2\u0188\u018a"+
		"\3\2\2\2\u0189\u016f\3\2\2\2\u0189\u0175\3\2\2\2\u0189\u017b\3\2\2\2\u0189"+
		"\u0182\3\2\2\2\u018a#\3\2\2\2\u018b\u018c\7\67\2\2\u018c\u018d\7&\2\2"+
		"\u018d\u018e\7m\2\2\u018e\u01da\78\2\2\u018f\u0190\7\67\2\2\u0190\u0191"+
		"\7&\2\2\u0191\u0192\5<\37\2\u0192\u0193\78\2\2\u0193\u01da\3\2\2\2\u0194"+
		"\u0195\7\67\2\2\u0195\u0196\7&\2\2\u0196\u0197\7\'\2\2\u0197\u0198\5<"+
		"\37\2\u0198\u0199\78\2\2\u0199\u01da\3\2\2\2\u019a\u019b\7\67\2\2\u019b"+
		"\u019c\7&\2\2\u019c\u019d\7#\2\2\u019d\u019e\5<\37\2\u019e\u019f\78\2"+
		"\2\u019f\u01da\3\2\2\2\u01a0\u01a1\7\67\2\2\u01a1\u01a2\7&\2\2\u01a2\u01a3"+
		"\7A\2\2\u01a3\u01a4\5F$\2\u01a4\u01a5\78\2\2\u01a5\u01da\3\2\2\2\u01a6"+
		"\u01a7\7\67\2\2\u01a7\u01a8\7&\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7:\2"+
		"\2\u01aa\u01ab\5F$\2\u01ab\u01ac\78\2\2\u01ac\u01da\3\2\2\2\u01ad\u01ae"+
		"\7\64\2\2\u01ae\u01af\79\2\2\u01af\u01b0\5F$\2\u01b0\u01b1\7:\2\2\u01b1"+
		"\u01da\3\2\2\2\u01b2\u01b3\7\64\2\2\u01b3\u01b4\7;\2\2\u01b4\u01b5\5F"+
		"$\2\u01b5\u01b6\7;\2\2\u01b6\u01da\3\2\2\2\u01b7\u01b8\7\64\2\2\u01b8"+
		"\u01b9\79\2\2\u01b9\u01ba\5<\37\2\u01ba\u01bb\7:\2\2\u01bb\u01da\3\2\2"+
		"\2\u01bc\u01bd\7\64\2\2\u01bd\u01be\7;\2\2\u01be\u01bf\5<\37\2\u01bf\u01c0"+
		"\7;\2\2\u01c0\u01da\3\2\2\2\u01c1\u01c2\7\64\2\2\u01c2\u01c3\79\2\2\u01c3"+
		"\u01c4\7\'\2\2\u01c4\u01c5\5<\37\2\u01c5\u01c6\7:\2\2\u01c6\u01da\3\2"+
		"\2\2\u01c7\u01c8\7\64\2\2\u01c8\u01c9\7;\2\2\u01c9\u01ca\7\'\2\2\u01ca"+
		"\u01cb\5<\37\2\u01cb\u01cc\7;\2\2\u01cc\u01da\3\2\2\2\u01cd\u01ce\7\64"+
		"\2\2\u01ce\u01cf\79\2\2\u01cf\u01d0\7#\2\2\u01d0\u01d1\5<\37\2\u01d1\u01d2"+
		"\7:\2\2\u01d2\u01da\3\2\2\2\u01d3\u01d4\7\64\2\2\u01d4\u01d5\7;\2\2\u01d5"+
		"\u01d6\7#\2\2\u01d6\u01d7\5<\37\2\u01d7\u01d8\7;\2\2\u01d8\u01da\3\2\2"+
		"\2\u01d9\u018b\3\2\2\2\u01d9\u018f\3\2\2\2\u01d9\u0194\3\2\2\2\u01d9\u019a"+
		"\3\2\2\2\u01d9\u01a0\3\2\2\2\u01d9\u01a6\3\2\2\2\u01d9\u01ad\3\2\2\2\u01d9"+
		"\u01b2\3\2\2\2\u01d9\u01b7\3\2\2\2\u01d9\u01bc\3\2\2\2\u01d9\u01c1\3\2"+
		"\2\2\u01d9\u01c7\3\2\2\2\u01d9\u01cd\3\2\2\2\u01d9\u01d3\3\2\2\2\u01da"+
		"%\3\2\2\2\u01db\u01dc\7\67\2\2\u01dc\u01dd\7&\2\2\u01dd\u01de\7\67\2\2"+
		"\u01de\u01df\5<\37\2\u01df\u01e0\78\2\2\u01e0\u01e3\5\4\3\2\u01e1\u01e2"+
		"\7\66\2\2\u01e2\u01e4\5\4\3\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2"+
		"\u01e4\u01e5\3\2\2\2\u01e5\u01e6\78\2\2\u01e6\u0273\3\2\2\2\u01e7\u01e8"+
		"\7\67\2\2\u01e8\u01e9\7&\2\2\u01e9\u01ea\7\67\2\2\u01ea\u01eb\7\'\2\2"+
		"\u01eb\u01ec\5<\37\2\u01ec\u01ed\78\2\2\u01ed\u01f0\5\4\3\2\u01ee\u01ef"+
		"\7\66\2\2\u01ef\u01f1\5\4\3\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2"+
		"\u01f1\u01f2\3\2\2\2\u01f2\u01f3\78\2\2\u01f3\u0273\3\2\2\2\u01f4\u01f5"+
		"\7\67\2\2\u01f5\u01f6\7&\2\2\u01f6\u01f7\7\67\2\2\u01f7\u01f8\7#\2\2\u01f8"+
		"\u01f9\5<\37\2\u01f9\u01fa\78\2\2\u01fa\u01fd\5\4\3\2\u01fb\u01fc\7\66"+
		"\2\2\u01fc\u01fe\5\4\3\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\78\2\2\u0200\u0273\3\2\2\2\u0201\u0202\7\67"+
		"\2\2\u0202\u0203\7&\2\2\u0203\u0204\7\67\2\2\u0204\u0205\79\2\2\u0205"+
		"\u0206\5F$\2\u0206\u0207\7:\2\2\u0207\u0208\78\2\2\u0208\u020b\5\4\3\2"+
		"\u0209\u020a\7\66\2\2\u020a\u020c\5\4\3\2\u020b\u0209\3\2\2\2\u020b\u020c"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\78\2\2\u020e\u0273\3\2\2\2\u020f"+
		"\u0210\7\67\2\2\u0210\u0211\7&\2\2\u0211\u0212\7\67\2\2\u0212\u0213\7"+
		";\2\2\u0213\u0214\5F$\2\u0214\u0215\7;\2\2\u0215\u0216\78\2\2\u0216\u0219"+
		"\5\4\3\2\u0217\u0218\7\66\2\2\u0218\u021a\5\4\3\2\u0219\u0217\3\2\2\2"+
		"\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\78\2\2\u021c\u0273"+
		"\3\2\2\2\u021d\u021e\7\67\2\2\u021e\u021f\7&\2\2\u021f\u0220\7\67\2\2"+
		"\u0220\u0221\7m\2\2\u0221\u0222\5<\37\2\u0222\u0223\78\2\2\u0223\u0226"+
		"\5\4\3\2\u0224\u0225\7\66\2\2\u0225\u0227\5\4\3\2\u0226\u0224\3\2\2\2"+
		"\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\78\2\2\u0229\u0273"+
		"\3\2\2\2\u022a\u022b\7\67\2\2\u022b\u022c\7&\2\2\u022c\u022d\7\67\2\2"+
		"\u022d\u022e\7m\2\2\u022e\u022f\78\2\2\u022f\u0232\5\4\3\2\u0230\u0231"+
		"\7\66\2\2\u0231\u0233\5\4\3\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2"+
		"\u0233\u0234\3\2\2\2\u0234\u0235\78\2\2\u0235\u0273\3\2\2\2\u0236\u0237"+
		"\7\67\2\2\u0237\u0238\7&\2\2\u0238\u0239\7\67\2\2\u0239\u023a\7m\2\2\u023a"+
		"\u023b\7A\2\2\u023b\u023c\5F$\2\u023c\u023d\78\2\2\u023d\u0240\5\4\3\2"+
		"\u023e\u023f\7\66\2\2\u023f\u0241\5\4\3\2\u0240\u023e\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\78\2\2\u0243\u0273\3\2\2\2\u0244"+
		"\u0245\7\67\2\2\u0245\u0246\7&\2\2\u0246\u0247\7\67\2\2\u0247\u0248\7"+
		"_\2\2\u0248\u0249\7`\2\2\u0249\u024a\7a\2\2\u024a\u024b\7d\2\2\u024b\u024c"+
		"\7i\2\2\u024c\u024d\7`\2\2\u024d\u024e\78\2\2\u024e\u0251\5\4\3\2\u024f"+
		"\u0250\7\66\2\2\u0250\u0252\5\4\3\2\u0251\u024f\3\2\2\2\u0251\u0252\3"+
		"\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\78\2\2\u0254\u0273\3\2\2\2\u0255"+
		"\u0256\7\67\2\2\u0256\u0257\7&\2\2\u0257\u0258\7\67\2\2\u0258\u0259\7"+
		"B\2\2\u0259\u025a\7T\2\2\u025a\u025b\7T\2\2\u025b\u025c\7F\2\2\u025c\u025d"+
		"\7S\2\2\u025d\u025e\7U\2\2\u025e\u025f\78\2\2\u025f\u0262\5\4\3\2\u0260"+
		"\u0261\7\66\2\2\u0261\u0263\5\4\3\2\u0262\u0260\3\2\2\2\u0262\u0263\3"+
		"\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\78\2\2\u0265\u0273\3\2\2\2\u0266"+
		"\u0267\7\67\2\2\u0267\u0268\7&\2\2\u0268\u0269\7\67\2\2\u0269\u026a\5"+
		"F$\2\u026a\u026b\78\2\2\u026b\u026e\5\4\3\2\u026c\u026d\7\66\2\2\u026d"+
		"\u026f\5\4\3\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2"+
		"\2\2\u0270\u0271\78\2\2\u0271\u0273\3\2\2\2\u0272\u01db\3\2\2\2\u0272"+
		"\u01e7\3\2\2\2\u0272\u01f4\3\2\2\2\u0272\u0201\3\2\2\2\u0272\u020f\3\2"+
		"\2\2\u0272\u021d\3\2\2\2\u0272\u022a\3\2\2\2\u0272\u0236\3\2\2\2\u0272"+
		"\u0244\3\2\2\2\u0272\u0255\3\2\2\2\u0272\u0266\3\2\2\2\u0273\'\3\2\2\2"+
		"\u0274\u0275\7\67\2\2\u0275\u0276\7(\2\2\u0276\u0277\7\\\2\2\u0277\u0278"+
		"\7^\2\2\u0278\u0279\7^\2\2\u0279\u027a\7`\2\2\u027a\u027b\7k\2\2\u027b"+
		"\u027c\7o\2\2\u027c\u02d9\78\2\2\u027d\u027e\7\67\2\2\u027e\u027f\7(\2"+
		"\2\u027f\u0283\7a\2\2\u0280\u0281\7\\\2\2\u0281\u0282\7d\2\2\u0282\u0284"+
		"\7g\2\2\u0283\u0280\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u02d9\78\2\2\u0286\u0287\7\67\2\2\u0287\u028c\7(\2\2\u0288\u0289\7h\2"+
		"\2\u0289\u028a\7\\\2\2\u028a\u028b\7m\2\2\u028b\u028d\7f\2\2\u028c\u0288"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\7=\2\2\u028f"+
		"\u0290\7i\2\2\u0290\u0291\7\\\2\2\u0291\u0292\7h\2\2\u0292\u0293\7`\2"+
		"\2\u0293\u02d9\78\2\2\u0294\u0295\7\67\2\2\u0295\u0296\7(\2\2\u0296\u0297"+
		"\7^\2\2\u0297\u0298\7j\2\2\u0298\u0299\7h\2\2\u0299\u029a\7h\2\2\u029a"+
		"\u029b\7d\2\2\u029b\u029c\7o\2\2\u029c\u02d9\78\2\2\u029d\u029e\7\67\2"+
		"\2\u029e\u029f\7(\2\2\u029f\u02a0\7k\2\2\u02a0\u02a1\7m\2\2\u02a1\u02a2"+
		"\7p\2\2\u02a2\u02a3\7i\2\2\u02a3\u02a4\7`\2\2\u02a4\u02d9\78\2\2\u02a5"+
		"\u02a6\7\67\2\2\u02a6\u02a7\7(\2\2\u02a7\u02a8\7k\2\2\u02a8\u02a9\7m\2"+
		"\2\u02a9\u02aa\7p\2\2\u02aa\u02ab\7i\2\2\u02ab\u02ac\7`\2\2\u02ac\u02ad"+
		"\7=\2\2\u02ad\u02ae\7i\2\2\u02ae\u02af\7\\\2\2\u02af\u02b0\7h\2\2\u02b0"+
		"\u02b1\7`\2\2\u02b1\u02d9\78\2\2\u02b2\u02b3\7\67\2\2\u02b3\u02b4\7(\2"+
		"\2\u02b4\u02b5\7n\2\2\u02b5\u02b6\7f\2\2\u02b6\u02b7\7d\2\2\u02b7\u02b8"+
		"\7k\2\2\u02b8\u02d9\78\2\2\u02b9\u02ba\7\67\2\2\u02ba\u02bb\7(\2\2\u02bb"+
		"\u02bc\7n\2\2\u02bc\u02bd\7f\2\2\u02bd\u02be\7d\2\2\u02be\u02bf\7k\2\2"+
		"\u02bf\u02c0\7=\2\2\u02c0\u02c1\7i\2\2\u02c1\u02c2\7\\\2\2\u02c2\u02c3"+
		"\7h\2\2\u02c3\u02c4\7`\2\2\u02c4\u02d9\78\2\2\u02c5\u02c6\7\67\2\2\u02c6"+
		"\u02c7\7(\2\2\u02c7\u02c8\7o\2\2\u02c8\u02c9\7c\2\2\u02c9\u02ca\7`\2\2"+
		"\u02ca\u02cb\7i\2\2\u02cb\u02d9\78\2\2\u02cc\u02cd\7\67\2\2\u02cd\u02ce"+
		"\7(\2\2\u02ce\u02cf\7o\2\2\u02cf\u02d0\7c\2\2\u02d0\u02d1\7`\2\2\u02d1"+
		"\u02d2\7i\2\2\u02d2\u02d3\7=\2\2\u02d3\u02d4\7i\2\2\u02d4\u02d5\7\\\2"+
		"\2\u02d5\u02d6\7h\2\2\u02d6\u02d7\7`\2\2\u02d7\u02d9\78\2\2\u02d8\u0274"+
		"\3\2\2\2\u02d8\u027d\3\2\2\2\u02d8\u0286\3\2\2\2\u02d8\u0294\3\2\2\2\u02d8"+
		"\u029d\3\2\2\2\u02d8\u02a5\3\2\2\2\u02d8\u02b2\3\2\2\2\u02d8\u02b9\3\2"+
		"\2\2\u02d8\u02c5\3\2\2\2\u02d8\u02cc\3\2\2\2\u02d9)\3\2\2\2\u02da\u02db"+
		"\7\67\2\2\u02db\u02dc\7(\2\2\u02dc\u02dd\7^\2\2\u02dd\u02de\7m\2\2\u02de"+
		"\u0318\78\2\2\u02df\u02e0\7\67\2\2\u02e0\u02e1\7(\2\2\u02e1\u02e2\7g\2"+
		"\2\u02e2\u02e3\7a\2\2\u02e3\u0318\78\2\2\u02e4\u02e5\7\67\2\2\u02e5\u02e6"+
		"\7(\2\2\u02e6\u02e7\7^\2\2\u02e7\u02e8\7m\2\2\u02e8\u02e9\7g\2\2\u02e9"+
		"\u02ea\7a\2\2\u02ea\u0318\78\2\2\u02eb\u02ec\7\67\2\2\u02ec\u02ed\7(\2"+
		"\2\u02ed\u02ee\7\\\2\2\u02ee\u02ef\7i\2\2\u02ef\u02f0\7t\2\2\u02f0\u02f1"+
		"\7^\2\2\u02f1\u02f2\7m\2\2\u02f2\u02f3\7g\2\2\u02f3\u02f4\7a\2\2\u02f4"+
		"\u0318\78\2\2\u02f5\u02f6\7\67\2\2\u02f6\u02f7\7(\2\2\u02f7\u02f8\7\\"+
		"\2\2\u02f8\u02f9\7i\2\2\u02f9\u02fa\7t\2\2\u02fa\u0318\78\2\2\u02fb\u02fc"+
		"\7\67\2\2\u02fc\u02fd\7(\2\2\u02fd\u02fe\7]\2\2\u02fe\u02ff\7n\2\2\u02ff"+
		"\u0300\7m\2\2\u0300\u0301\7<\2\2\u0301\u0302\7\\\2\2\u0302\u0303\7i\2"+
		"\2\u0303\u0304\7t\2\2\u0304\u0305\7^\2\2\u0305\u0306\7m\2\2\u0306\u0307"+
		"\7g\2\2\u0307\u0308\7a\2\2\u0308\u0318\78\2\2\u0309\u030a\7\67\2\2\u030a"+
		"\u030b\7(\2\2\u030b\u030c\7]\2\2\u030c\u030d\7n\2\2\u030d\u030e\7m\2\2"+
		"\u030e\u030f\7<\2\2\u030f\u0310\7p\2\2\u0310\u0311\7i\2\2\u0311\u0312"+
		"\7d\2\2\u0312\u0313\7^\2\2\u0313\u0314\7j\2\2\u0314\u0315\7_\2\2\u0315"+
		"\u0316\7`\2\2\u0316\u0318\78\2\2\u0317\u02da\3\2\2\2\u0317\u02df\3\2\2"+
		"\2\u0317\u02e4\3\2\2\2\u0317\u02eb\3\2\2\2\u0317\u02f5\3\2\2\2\u0317\u02fb"+
		"\3\2\2\2\u0317\u0309\3\2\2\2\u0318+\3\2\2\2\u0319\u031a\7\67\2\2\u031a"+
		"\u031b\7&\2\2\u031b\u031c\7^\2\2\u031c\u0324\78\2\2\u031d\u031e\7\67\2"+
		"\2\u031e\u031f\7&\2\2\u031f\u0320\7^\2\2\u0320\u0321\5<\37\2\u0321\u0322"+
		"\78\2\2\u0322\u0324\3\2\2\2\u0323\u0319\3\2\2\2\u0323\u031d\3\2\2\2\u0324"+
		"-\3\2\2\2\u0325\u0340\5$\23\2\u0326\u0340\5\62\32\2\u0327\u0340\5\66\34"+
		"\2\u0328\u0340\5\20\t\2\u0329\u0340\5\26\f\2\u032a\u0340\5\30\r\2\u032b"+
		"\u0340\5\32\16\2\u032c\u0340\5\34\17\2\u032d\u0340\5\"\22\2\u032e\u0340"+
		"\5\22\n\2\u032f\u0340\5&\24\2\u0330\u0340\5(\25\2\u0331\u0340\5*\26\2"+
		"\u0332\u0340\5,\27\2\u0333\u0340\7\17\2\2\u0334\u0340\7\"\2\2\u0335\u0340"+
		"\7.\2\2\u0336\u0340\7,\2\2\u0337\u0340\7-\2\2\u0338\u0340\7/\2\2\u0339"+
		"\u0340\7\60\2\2\u033a\u0340\7\61\2\2\u033b\u0340\7\62\2\2\u033c\u0340"+
		"\7\63\2\2\u033d\u0340\7\20\2\2\u033e\u0340\7\37\2\2\u033f\u0325\3\2\2"+
		"\2\u033f\u0326\3\2\2\2\u033f\u0327\3\2\2\2\u033f\u0328\3\2\2\2\u033f\u0329"+
		"\3\2\2\2\u033f\u032a\3\2\2\2\u033f\u032b\3\2\2\2\u033f\u032c\3\2\2\2\u033f"+
		"\u032d\3\2\2\2\u033f\u032e\3\2\2\2\u033f\u032f\3\2\2\2\u033f\u0330\3\2"+
		"\2\2\u033f\u0331\3\2\2\2\u033f\u0332\3\2\2\2\u033f\u0333\3\2\2\2\u033f"+
		"\u0334\3\2\2\2\u033f\u0335\3\2\2\2\u033f\u0336\3\2\2\2\u033f\u0337\3\2"+
		"\2\2\u033f\u0338\3\2\2\2\u033f\u0339\3\2\2\2\u033f\u033a\3\2\2\2\u033f"+
		"\u033b\3\2\2\2\u033f\u033c\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2"+
		"\2\2\u0340/\3\2\2\2\u0341\u0342\58\35\2\u0342\u0343\7#\2\2\u0343\u0344"+
		"\58\35\2\u0344\u0349\3\2\2\2\u0345\u0349\5\64\33\2\u0346\u0349\58\35\2"+
		"\u0347\u0349\5\24\13\2\u0348\u0341\3\2\2\2\u0348\u0345\3\2\2\2\u0348\u0346"+
		"\3\2\2\2\u0348\u0347\3\2\2\2\u0349\61\3\2\2\2\u034a\u034b\t\3\2\2\u034b"+
		"\63\3\2\2\2\u034c\u034d\t\3\2\2\u034d\65\3\2\2\2\u034e\u0351\5:\36\2\u034f"+
		"\u0351\7!\2\2\u0350\u034e\3\2\2\2\u0350\u034f\3\2\2\2\u0351\67\3\2\2\2"+
		"\u0352\u035f\5:\36\2\u0353\u035f\7\17\2\2\u0354\u035f\7 \2\2\u0355\u035f"+
		"\7\"\2\2\u0356\u035f\7&\2\2\u0357\u035f\7\'\2\2\u0358\u035f\7(\2\2\u0359"+
		"\u035f\7,\2\2\u035a\u035f\7/\2\2\u035b\u035f\7\66\2\2\u035c\u035f\7\67"+
		"\2\2\u035d\u035f\78\2\2\u035e\u0352\3\2\2\2\u035e\u0353\3\2\2\2\u035e"+
		"\u0354\3\2\2\2\u035e\u0355\3\2\2\2\u035e\u0356\3\2\2\2\u035e\u0357\3\2"+
		"\2\2\u035e\u0358\3\2\2\2\u035e\u0359\3\2\2\2\u035e\u035a\3\2\2\2\u035e"+
		"\u035b\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035d\3\2\2\2\u035f9\3\2\2\2"+
		"\u0360\u037b\5> \2\u0361\u037b\7\3\2\2\u0362\u037b\5D#\2\u0363\u037b\7"+
		"\6\2\2\u0364\u037b\7\b\2\2\u0365\u037b\7\t\2\2\u0366\u037b\7\n\2\2\u0367"+
		"\u037b\7\13\2\2\u0368\u037b\7\f\2\2\u0369\u037b\7\16\2\2\u036a\u037b\7"+
		"\4\2\2\u036b\u037b\7\5\2\2\u036c\u037b\7)\2\2\u036d\u037b\7*\2\2\u036e"+
		"\u037b\7+\2\2\u036f\u037b\7#\2\2\u0370\u037b\79\2\2\u0371\u037b\7:\2\2"+
		"\u0372\u037b\7;\2\2\u0373\u037b\7<\2\2\u0374\u037b\7=\2\2\u0375\u037b"+
		"\7>\2\2\u0376\u037b\7?\2\2\u0377\u037b\7@\2\2\u0378\u037b\7A\2\2\u0379"+
		"\u037b\7\u0080\2\2\u037a\u0360\3\2\2\2\u037a\u0361\3\2\2\2\u037a\u0362"+
		"\3\2\2\2\u037a\u0363\3\2\2\2\u037a\u0364\3\2\2\2\u037a\u0365\3\2\2\2\u037a"+
		"\u0366\3\2\2\2\u037a\u0367\3\2\2\2\u037a\u0368\3\2\2\2\u037a\u0369\3\2"+
		"\2\2\u037a\u036a\3\2\2\2\u037a\u036b\3\2\2\2\u037a\u036c\3\2\2\2\u037a"+
		"\u036d\3\2\2\2\u037a\u036e\3\2\2\2\u037a\u036f\3\2\2\2\u037a\u0370\3\2"+
		"\2\2\u037a\u0371\3\2\2\2\u037a\u0372\3\2\2\2\u037a\u0373\3\2\2\2\u037a"+
		"\u0374\3\2\2\2\u037a\u0375\3\2\2\2\u037a\u0376\3\2\2\2\u037a\u0377\3\2"+
		"\2\2\u037a\u0378\3\2\2\2\u037a\u0379\3\2\2\2\u037b;\3\2\2\2\u037c\u037d"+
		"\5B\"\2\u037d=\3\2\2\2\u037e\u037f\7\r\2\2\u037f\u0380\t\4\2\2\u0380\u0381"+
		"\5@!\2\u0381\u0382\5@!\2\u0382\u0388\3\2\2\2\u0383\u0384\7\r\2\2\u0384"+
		"\u0385\5@!\2\u0385\u0386\5@!\2\u0386\u0388\3\2\2\2\u0387\u037e\3\2\2\2"+
		"\u0387\u0383\3\2\2\2\u0388?\3\2\2\2\u0389\u038a\t\5\2\2\u038aA\3\2\2\2"+
		"\u038b\u038d\5D#\2\u038c\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038c"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038fC\3\2\2\2\u0390\u0391\t\6\2\2\u0391"+
		"E\3\2\2\2\u0392\u0393\5H%\2\u0393G\3\2\2\2\u0394\u039a\t\7\2\2\u0395\u0399"+
		"\7\3\2\2\u0396\u0399\7<\2\2\u0397\u0399\5D#\2\u0398\u0395\3\2\2\2\u0398"+
		"\u0396\3\2\2\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2"+
		"\2\2\u039a\u039b\3\2\2\2\u039bI\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039f"+
		"\5L\'\2\u039e\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1K\3\2\2\2\u03a2\u03a3\n\b\2\2\u03a3M\3\2\2\2\63VZ"+
		"agk\u0085\u008a\u0093\u009d\u00a6\u00b0\u00b9\u00c1\u00c5\u00f0\u00f5"+
		"\u0114\u0128\u0166\u016b\u0189\u01d9\u01e3\u01f0\u01fd\u020b\u0219\u0226"+
		"\u0232\u0240\u0251\u0262\u026e\u0272\u0283\u028c\u02d8\u0317\u0323\u033f"+
		"\u0348\u0350\u035e\u037a\u0387\u038e\u0398\u039a\u03a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}