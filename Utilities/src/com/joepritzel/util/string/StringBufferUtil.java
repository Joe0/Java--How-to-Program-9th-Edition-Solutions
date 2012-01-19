package com.joepritzel.util.string;

/**
 * This class contains helper methods for StringBuffers.
 * 
 * @author Joe Pritzel
 * 
 */
public class StringBufferUtil {
	/**
	 * Abuses pass-by-reference-by-value nature of Java to avoid returning a
	 * type, and causing side-effects.
	 * 
	 * @param sb
	 *            - the StringBuilder to remove the last character from
	 */
	public static void removeLastChar(StringBuilder sb) {
		sb.deleteCharAt(sb.length() - 1);
	}
}
