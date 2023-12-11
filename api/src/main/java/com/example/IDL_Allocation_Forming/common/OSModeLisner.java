package com.example.IDL_Allocation_Forming.common;

import java.util.InputMismatchException;
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

	/**
	 * ユーザーにOSを尋ね結果を返す処理
	 * 
	 * @return 1 -> windows<br>
	 *         2 -> mac
	 */
	public int userLiten() {
		int userSelectNo = 0;
		userSelectNo = doListen();
		if(userSelectNo == SYSTEM_FINAL_ELEMENT.ERROR_STATUS_NO) {
			doListen();
		}
		if (reListeUser(userSelectNo) == 2) {
			doListen();
		}
		return userSelectNo;
	}

	/**
	 * 選択肢OS表示メソッド
	 */
	public int doListen() {
		System.out.println(SYSTEM_FINAL_ELEMENT.USERLISTEN_MESSAGE);
		System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_OS_MESSAGE_WIN);
		System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_OS_MESSAGE_MAC);
		int userSelectNo = -1;
		try {
			userSelectNo = scanner.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.toString();
			System.out.println(SYSTEM_FINAL_ELEMENT.ERROR_WORD);
			return SYSTEM_FINAL_ELEMENT.ERROR_STATUS_NO;
		} catch (Exception e) {
			// TODO: handle exception
			e.toString();
			return SYSTEM_FINAL_ELEMENT.ERROR_STATUS_NO;
		}
		
		
		
		if (!(chkUserSelectedNo(userSelectNo))) {
			System.out.println(SYSTEM_FINAL_ELEMENT.SELECT_USER_ERROR_NO);
			userLiten();
		}
		return userSelectNo;
	}

	/**
	 * ユーザーが選択した番号のチェック
	 * 
	 * @param no ユーザー選択番号
	 * @return TRUE : エラーなし<br>
	 *         FALSE : エラーあり
	 */
	public boolean chkUserSelectedNo(int no) {
		if (no == WIN || no == MAC) {
			return true;
		}
		return false;
	}

	/**
	 * 再度OSの確認を行う
	 * 
	 * @param no OS番号<br>
	 *           1 : Windows<br>
	 *           2 : Mac
	 * @return 1 : 次の処理へ<br>
	 *         2 : 再度ユーザーへOSの選択を行う
	 */
	public int reListeUser(int no) {
		int answerNo = doReListen(no);
		if (!(answerNo == 1 || answerNo == 2)) {
			System.out.println(SYSTEM_FINAL_ELEMENT.RELESTENMESSAGE);
			doReListen(no);
		}
		return answerNo;
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
		return scanner.nextInt();
	}
}
