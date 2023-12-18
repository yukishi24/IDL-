package com.example.IDL_Allocation_Forming.common;

import java.util.Scanner;

import com.example.IDL_Allocation_Forming.FINAL.SYSTEM_FINAL_ELEMENT;

/**
 * パスを整形するために、OSを設定する
 * 
 * @author yukishi
 *
 */
public class OSModeLisner {
	// スキャナーインスタンス
	Scanner scanner;
	final int WIN = 1;
	final int MAC = 2;
	int answer = 0; // ユーザーのアンサー

	/**
	 * @param answer セットする answer
	 */
	public void setAnswer(int answer) {
		this.answer = answer;
	}

	/**
	 * answerのセッター：(scanner)
	 * 
	 * @param answer セットする answer
	 */
	public void setAnswerByScanner() {
		scanner = new Scanner(System.in);
		try {
			// ユーザーに尋ねて回答を格納する処理
			this.answer = scanner.nextInt();
		} catch (Exception e) {
			this.answer = SYSTEM_FINAL_ELEMENT.ERROR_STATUS_NO;
			return;
		} finally {
			scanner.close();
		}
	}

	/**
	 * ユーザーにOSを尋ね結果を返す処理
	 * 
	 * @return 1 -> windows<br>
	 *         2 -> mac
	 */
	public int userLiten() {
		int resultNo = 0;
		boolean resultBoo = false;

		resultNo = questionOS();
		resultBoo = chkUserAnswer();
		
		System.out.println(this.answer);
		setAnswer(resultNo);
		return resultNo;
	}

	/**
	 * ユーザー入力値チェック<br>
	 * チェック内容<br>
	 * １：ユーザーの入力値が数字以外かのチェック<br>
	 * ２：ユーザーの入力値が1 or 2かどうかのチェック
	 * 
	 * @return TRUE：エラーなし<br>
	 *         FALSE：エラーあり
	 */
	private boolean chkUserAnswer() {
		// 0チェック ※ユーザーが数値以外を入力するとanswerに-1を格納してある。
		if (this.answer == -1) {
			System.out.println(SYSTEM_FINAL_ELEMENT.OSEXCEPTION_MESSEGE);
			return false;
		}
		if (!(this.answer == 1 || this.answer == 2)) {
			System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_USER_ERROR_NO);
			this.answer = 0;
			return false;
		}
		return true;
	}

	/**
	 * ユーザーの使用しているOSを聞く処理<br>
	 * スキャナーで聞いた数値を戻り値として返す。
	 * 
	 * @return ユーザーの回答
	 */
	public int questionOS() {
		// 質問文
		System.out.println(SYSTEM_FINAL_ELEMENT.USERLISTEN_MESSAGE);
		System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_OS_MESSAGE_WIN);
		System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_OS_MESSAGE_MAC);
		setAnswerByScanner();
		return this.answer;
	}

	/**
	 * 確認メッセージ
	 * 
	 * @param no
	 * @return
	 */
	public int doReListen(int no) {
		String OS = "";
		if (no == WIN) {
			OS = SYSTEM_FINAL_ELEMENT.WIN;
		} else {
			OS = SYSTEM_FINAL_ELEMENT.MAC;
		}
		System.out.println("お使いのOSは、" + OS + "でお間違いないですか？");
		System.out.println(SYSTEM_FINAL_ELEMENT.RELITEN1);
		System.out.println(SYSTEM_FINAL_ELEMENT.RELITEN2);
		setAnswerByScanner();
		return this.answer;
	}
}
