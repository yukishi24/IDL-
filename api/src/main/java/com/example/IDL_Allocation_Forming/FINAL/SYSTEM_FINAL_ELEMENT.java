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
	/**
	 * 処理開始時のメッセージ
	 */
	public static String START_WORD = "処理を開始します。";
	/**
	 * 処理終了時のメッセージ
	 */
	public static String END_WORD = "処理を終了します。(正常終了)";
	/**
	 * エラー時出力メッセージ
	 */
	public static String ERROR_WORD = "処理を中断いたします。";
	/**
	 * キャスト失敗時出力メッセージ
	 */
	public static String CAST_EXCEPTION = "処理実行中に、型変換に失敗しました。";
	/**
	 * パス変換前メッセージ
	 */
	public static String BEFOR = "変換前：　";
	/**
	 * パス変換後メッセージ
	 */
	public static String AFTER = "変換後：　";
	
	/**
	 * 使用しているOSがMacの場合の切り取り指定文字
	 */
	public static String SPRITMAC = "/";
	/**
	 * 使用しているOSがWindowsの場合の切り取り指定文字
	 */
	public static String SORITWINDOWS = "¥";
	/**
	 * ユーザーにOSを尋ねる文言
	 */
	public static String USERLISTEN_MESSAGE = "使用しているOSを選択してください。";
	/**
	 * windows
	 */
	public static String SELECT_OS_MESSAGE_WIN = "1 : Windows";
	/**
	 * mac
	 */
	public static String SELECT_OS_MESSAGE_MAC = "2 : Mac";
	/**
	 * ユーザーが不正な番号を選択した場合の文言
	 */
	public static String SELECT_USER_ERROR_NO = "選択された番号が正しくありません。\nもう一度選択してください。";
	/**
	 * windows
	 */
	public static String WIN = "Windows";
	/**
	 * Mac
	 */
	public static String MAC = "Mac";
	/**
	 * ユーザーに尋ねる文言		はい
	 */
	public static String RELITEN1 = "1 : はい";
	/**
	 * ユーザーに尋ねる文言		いいえ
	 */
	public static String RELITEN2 = "2 : いいえ";
	public static String RELESTENMESSAGE = RELITEN1 + "、または"+ RELITEN2 + "でお答えください。";
	public static String OSEXCEPTION_MESSEGE = "数値を入力してください。";
	public static int ERROR_STATUS_NO = -1;
}
