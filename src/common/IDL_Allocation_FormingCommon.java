package common;

import java.io.File;
import java.nio.file.Path;

public class IDL_Allocation_FormingCommon {

	public static File[] getFiles(Path path) {
		File file = castToFileInstance(path);
		File result[] = file.listFiles();
		
		// log
		for(int i;i<result.length;i++) {
			System.out.println();
		}
		
		return file.listFiles();
	}
	
	/**
	 * 引数をFile型にキャストする処理
	 * @param obj
	 * @return
	 */
	private static File castToFileInstance(Object obj) {
		File result = null;
		result = (File)obj;
		return result;
	}
}
