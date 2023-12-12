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
	Scanner scanner = new Scanner(System.in);
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
		try {
			// ユーザーに尋ねて回答を格納する処理
			this.answer = scanner.nextInt();
		} catch (Exception e) {
			this.answer = SYSTEM_FINAL_ELEMENT.ERROR_STATUS_NO;
			return;
		}
	}

	/**
	 * ユーザーにOSを尋ね結果を返す処理
	 * 
	 * @return 1 -> windows<br>
	 *         2 -> mac
	 */
	public int userLiten() {
		int userSelectNo = 0;
		
		do {
			listenContents();
		} while (doReListen(this.answer));

	}

	/**
	 * ユーザーに聞く内容
	 */
	public void listenContents() {
		int result = 0;
		final int beyondExpectationsNo = 0;// 想定外の値
		final int nonMumeric = -1;// 数値以外の場合の値

		do {
			result = questionOS();
			switch (result) {
			case beyondExpectationsNo:
				System.out.println(SYSTEM_FINAL_ELEMENT.RELESTENMESSAGE);
				break;
			case nonMumeric:
				System.out.println(SYSTEM_FINAL_ELEMENT.OSEXCEPTION_MESSEGE);
				break;
			default:
				break;
			}
		} while (result != 1 || result != 2);
		setAnswer(result);
	}

	/**
	 * 選択肢OS表示メソッド
	 */
	public int questionOS() {

		// 質問文
		System.out.println(SYSTEM_FINAL_ELEMENT.USERLISTEN_MESSAGE);
		System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_OS_MESSAGE_WIN);
		System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_OS_MESSAGE_MAC);

		setAnswerByScanner();

		// ユーザーの答えチェック処理
		chkUserSelectedNo(this.answer);
		return this.answer;
	}

	/**
	 * ユーザーが選択した番号のチェック
	 * 
	 * @param no
	 */
	public void chkUserSelectedNo(int no) {
		boolean result = false;
		if (no == WIN || no == MAC) {
			setAnswer(no);
		}
		result = false;
		if (!result) {
			System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_USER_ERROR_NO);
			setAnswer(0);
		}
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

	}
}
