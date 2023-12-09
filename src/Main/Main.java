package Main;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 当システムのメインクラス
 * 
 * @author yukishi
 *
 */
public class Main {

	/**
	 * 当システムで一番最初に実行されるメソッド
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 内部変数
		final String subjectPath = "../../subject";		// subjectの相対パス
		Path subject = Paths.get(subjectPath);			// subjectのインスタンス
	}
}
