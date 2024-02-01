// Generated from G:/My Drive/PhD/Regex Research/RegexAnalyzer/src/parser\BRICS.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BRICSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BRICSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BRICSParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(BRICSParser.RegexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#unionexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionexp(BRICSParser.UnionexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#interexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterexp(BRICSParser.InterexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#concatexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatexp(BRICSParser.ConcatexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#repeatexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatexp(BRICSParser.RepeatexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(BRICSParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#quantifier_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_type(BRICSParser.Quantifier_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#character_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_class(BRICSParser.Character_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#backreference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference(BRICSParser.BackreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#backreference_or_octal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackreference_or_octal(BRICSParser.Backreference_or_octalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(BRICSParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#non_capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_capture(BRICSParser.Non_captureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(BRICSParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(BRICSParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#option_flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_flags(BRICSParser.Option_flagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#option_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_flag(BRICSParser.Option_flagContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#look_around}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLook_around(BRICSParser.Look_aroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#subroutine_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutine_reference(BRICSParser.Subroutine_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(BRICSParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#backtrack_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacktrack_control(BRICSParser.Backtrack_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#newline_convention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline_convention(BRICSParser.Newline_conventionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#callout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout(BRICSParser.CalloutContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(BRICSParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#cc_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_atom(BRICSParser.Cc_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#shared_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_atom(BRICSParser.Shared_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#shared_atom2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_atom2(BRICSParser.Shared_atom2Context ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BRICSParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#cc_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCc_literal(BRICSParser.Cc_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#shared_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShared_literal(BRICSParser.Shared_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(BRICSParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#octal_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_char(BRICSParser.Octal_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#octal_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctal_digit(BRICSParser.Octal_digitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#digits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigits(BRICSParser.DigitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(BRICSParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(BRICSParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#alpha_nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlpha_nums(BRICSParser.Alpha_numsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#non_close_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_close_parens(BRICSParser.Non_close_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link BRICSParser#non_close_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_close_paren(BRICSParser.Non_close_parenContext ctx);
}