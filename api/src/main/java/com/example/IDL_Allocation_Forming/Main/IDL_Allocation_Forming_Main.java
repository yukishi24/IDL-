package com.example.IDL_Allocation_Forming.Main;

import java.io.File;
import java.util.List;

import com.example.IDL_Allocation_Forming.FINAL.SYSTEM_FINAL_ELEMENT;
import com.example.IDL_Allocation_Forming.common.IDL_Allocation_FormingCommon;

/**
 * 処理のメインクラス
 * 
 * @author yukishi
 *
 */
public class IDL_Allocation_Forming_Main {
	/**
	 * フォルダから取得したファイルのlist
	 */
	List<File> fileList;

	/**
	 * デフォルトコンストラクタ<br>
	 * システム上では使用しない
	 */
	public IDL_Allocation_Forming_Main() {
	}

	/**
	 * Apiのメインのメソッド<br>
	 * プロジェクト上は、ApiAppliacationが一番最初によばれるがこちらのクラスに処理を記述していく
	 */
	public void mainRun() {
		// 内部変数宣言
		File folder = new File("");
		// 開始ログ
		IDL_Allocation_FormingCommon.printlog(SYSTEM_FINAL_ELEMENT.START);
		// パス成形
		String subjectPath = IDL_Allocation_FormingCommon.moldPath(folder);
	}
}
