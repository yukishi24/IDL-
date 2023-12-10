package com.example.IDL_Allocation_Forming.common;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.example.IDL_Allocation_Forming.FINAL.SYSTEM_FINAL_ELEMENT;

/**
 * 本プロジェクトの関数クラス
 * 
 * @author yukishi
 *
 */
public class IDL_Allocation_FormingCommon {
	static String start = SYSTEM_FINAL_ELEMENT.START_WORD;
	static String end = SYSTEM_FINAL_ELEMENT.END_WORD;
	static String error = SYSTEM_FINAL_ELEMENT.ERROR_WORD;
	/**
	 * ログメッセージリスト
	 */
	static String[] logMessages = { start, end, error };

	/**
	 * 引数から受け取った、フォルダからファイルを配列として変換する。<br>
	 * 
	 * @param path フォルダのパスを指定したPath変数
	 * @return ファイル(配列)
	 */
	public static File[] getFiles(Path path) {
		File file = castToFileInstance(path);
		File result[] = file.listFiles();

		// log
		for (int i = 0; i < result.length; i++) {
			System.out.println("ファイル" + i + " " + "→" + " " + result[i]);
		}

		return result;
	}

	/**
	 * File型にキャストする。
	 * 
	 * @param obj キャスト前
	 * @return File型
	 */
	public static File castToFileInstance(Path obj) {
		// アップキャスト
		Object tmp = (Object) obj;
		try {
			File result = (File) tmp;
			return result;
		} catch (ClassCastException e) {
			System.out.println(SYSTEM_FINAL_ELEMENT.CAST_EXCEPTION);
			printlog(SYSTEM_FINAL_ELEMENT.ERROR);
			System.out.println(e.toString());
			return null;
		}
	}

	/**
	 * 処理毎にメッセージを発出する処理
	 * 
	 * @param i 画面状態
	 */
	public static void printlog(int i) {
		System.out.println(logMessages[i]);
	}

	/**
	 * 引数のパスをsubjectフォルダのパスへ変換する
	 * 
	 * @param folder
	 * @return subjectフォルダのパス
	 */
	public static String moldPath(File folder) {
		String result = "";
		// 絶対パス
		String completePath = folder.getAbsolutePath();
		// 変換処理
		System.out.println(SYSTEM_FINAL_ELEMENT.BEFOR + completePath);
		String[] tempList = completePath.split("/");
		int forEnd = tempList.length - 1;
		List<String> pathList = new ArrayList();
		for (int i = 0; i < forEnd; i++) {
			pathList.add(tempList[i]);
		}
		pathList.add("subject");
		for(String temp : pathList) {
			result += temp + "/";
		}
		System.out.println(SYSTEM_FINAL_ELEMENT.AFTER + result);
		return result;
	}
}