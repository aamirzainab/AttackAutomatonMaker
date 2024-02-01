// Generated from G:/My Drive/PhD/Regex Research/RegexAnalyzer/src/parser\BRICS.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BRICSParser}.
 */
public interface BRICSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BRICSParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(BRICSParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(BRICSParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#unionexp}.
	 * @param ctx the parse tree
	 */
	void enterUnionexp(BRICSParser.UnionexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#unionexp}.
	 * @param ctx the parse tree
	 */
	void exitUnionexp(BRICSParser.UnionexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#interexp}.
	 * @param ctx the parse tree
	 */
	void enterInterexp(BRICSParser.InterexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#interexp}.
	 * @param ctx the parse tree
	 */
	void exitInterexp(BRICSParser.InterexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#concatexp}.
	 * @param ctx the parse tree
	 */
	void enterConcatexp(BRICSParser.ConcatexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#concatexp}.
	 * @param ctx the parse tree
	 */
	void exitConcatexp(BRICSParser.ConcatexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#repeatexp}.
	 * @param ctx the parse tree
	 */
	void enterRepeatexp(BRICSParser.RepeatexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#repeatexp}.
	 * @param ctx the parse tree
	 */
	void exitRepeatexp(BRICSParser.RepeatexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(BRICSParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(BRICSParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#quantifier_type}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_type(BRICSParser.Quantifier_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#quantifier_type}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_type(BRICSParser.Quantifier_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#character_class}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_class(BRICSParser.Character_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#character_class}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_class(BRICSParser.Character_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#backreference}.
	 * @param ctx the parse tree
	 */
	void enterBackreference(BRICSParser.BackreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#backreference}.
	 * @param ctx the parse tree
	 */
	void exitBackreference(BRICSParser.BackreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 */
	void enterBackreference_or_octal(BRICSParser.Backreference_or_octalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 */
	void exitBackreference_or_octal(BRICSParser.Backreference_or_octalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(BRICSParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(BRICSParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void enterNon_capture(BRICSParser.Non_captureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#non_capture}.
	 * @param ctx the parse tree
	 */
	void exitNon_capture(BRICSParser.Non_captureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(BRICSParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(BRICSParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(BRICSParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(BRICSParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#option_flags}.
	 * @param ctx the parse tree
	 */
	void enterOption_flags(BRICSParser.Option_flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#option_flags}.
	 * @param ctx the parse tree
	 */
	void exitOption_flags(BRICSParser.Option_flagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#option_flag}.
	 * @param ctx the parse tree
	 */
	void enterOption_flag(BRICSParser.Option_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#option_flag}.
	 * @param ctx the parse tree
	 */
	void exitOption_flag(BRICSParser.Option_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#look_around}.
	 * @param ctx the parse tree
	 */
	void enterLook_around(BRICSParser.Look_aroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#look_around}.
	 * @param ctx the parse tree
	 */
	void exitLook_around(BRICSParser.Look_aroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#subroutine_reference}.
	 * @param ctx the parse tree
	 */
	void enterSubroutine_reference(BRICSParser.Subroutine_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#subroutine_reference}.
	 * @param ctx the parse tree
	 */
	void exitSubroutine_reference(BRICSParser.Subroutine_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(BRICSParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(BRICSParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#backtrack_control}.
	 * @param ctx the parse tree
	 */
	void enterBacktrack_control(BRICSParser.Backtrack_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#backtrack_control}.
	 * @param ctx the parse tree
	 */
	void exitBacktrack_control(BRICSParser.Backtrack_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#newline_convention}.
	 * @param ctx the parse tree
	 */
	void enterNewline_convention(BRICSParser.Newline_conventionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#newline_convention}.
	 * @param ctx the parse tree
	 */
	void exitNewline_convention(BRICSParser.Newline_conventionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#callout}.
	 * @param ctx the parse tree
	 */
	void enterCallout(BRICSParser.CalloutContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#callout}.
	 * @param ctx the parse tree
	 */
	void exitCallout(BRICSParser.CalloutContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(BRICSParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(BRICSParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void enterCc_atom(BRICSParser.Cc_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#cc_atom}.
	 * @param ctx the parse tree
	 */
	void exitCc_atom(BRICSParser.Cc_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#shared_atom}.
	 * @param ctx the parse tree
	 */
	void enterShared_atom(BRICSParser.Shared_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#shared_atom}.
	 * @param ctx the parse tree
	 */
	void exitShared_atom(BRICSParser.Shared_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#shared_atom2}.
	 * @param ctx the parse tree
	 */
	void enterShared_atom2(BRICSParser.Shared_atom2Context ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#shared_atom2}.
	 * @param ctx the parse tree
	 */
	void exitShared_atom2(BRICSParser.Shared_atom2Context ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BRICSParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BRICSParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#cc_literal}.
	 * @param ctx the parse tree
	 */
	void enterCc_literal(BRICSParser.Cc_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#cc_literal}.
	 * @param ctx the parse tree
	 */
	void exitCc_literal(BRICSParser.Cc_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#shared_literal}.
	 * @param ctx the parse tree
	 */
	void enterShared_literal(BRICSParser.Shared_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#shared_literal}.
	 * @param ctx the parse tree
	 */
	void exitShared_literal(BRICSParser.Shared_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(BRICSParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(BRICSParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#octal_char}.
	 * @param ctx the parse tree
	 */
	void enterOctal_char(BRICSParser.Octal_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#octal_char}.
	 * @param ctx the parse tree
	 */
	void exitOctal_char(BRICSParser.Octal_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#octal_digit}.
	 * @param ctx the parse tree
	 */
	void enterOctal_digit(BRICSParser.Octal_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#octal_digit}.
	 * @param ctx the parse tree
	 */
	void exitOctal_digit(BRICSParser.Octal_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(BRICSParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(BRICSParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(BRICSParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(BRICSParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(BRICSParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(BRICSParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#alpha_nums}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_nums(BRICSParser.Alpha_numsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#alpha_nums}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_nums(BRICSParser.Alpha_numsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#non_close_parens}.
	 * @param ctx the parse tree
	 */
	void enterNon_close_parens(BRICSParser.Non_close_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#non_close_parens}.
	 * @param ctx the parse tree
	 */
	void exitNon_close_parens(BRICSParser.Non_close_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link BRICSParser#non_close_paren}.
	 * @param ctx the parse tree
	 */
	void enterNon_close_paren(BRICSParser.Non_close_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BRICSParser#non_close_paren}.
	 * @param ctx the parse tree
	 */
	void exitNon_close_paren(BRICSParser.Non_close_parenContext ctx);
}