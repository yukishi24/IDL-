package com.example.IDL_Allocation_Forming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.IDL_Allocation_Forming.Main.IDL_Allocation_Forming_Main;

/**
 * 本プロジェクトで一番最初によばれるクラス
 * 
 * @author yukishi
 *
 */
@SpringBootApplication
public class ApiApplication {

	/**
	 * メインメソッド
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		// メイン処理のインスタンス
		IDL_Allocation_Forming_Main idl_Allocation_Forming_Main = new IDL_Allocation_Forming_Main();
		// メイン処理
		idl_Allocation_Forming_Main.mainRun();
	}

}
