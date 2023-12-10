package com.example.IDL_Allocation_Forming.FINAL;

/**
 * システムに使用する、定数クラス
 * 
 * @author yukishi
 *
 */
public class SYSTEM_FINAL_ELEMENT {
	/**
	 * 処理開始時
	 */
	public static final int  START = 0;
	/**
	 * 処理終了時
	 */
	public static final int END = 1;
	/**
	 * 処理中にエラーが発生した状態
	 */
	public static final int ERROR = 2;
	public static String START_WORD = "処理を開始します。";
	public static String END_WORD = "処理を終了します。(正常終了)";
	public static String ERROR_WORD = "処理を中断いたします。";
	public static String CAST_EXCEPTION = "処理実行中に、型変換に失敗しました。";
	public static String BEFOR = "変換前：　";
	public static String AFTER = "変換後：　";
}
