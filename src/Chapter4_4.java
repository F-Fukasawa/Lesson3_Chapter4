import java.util.HashMap;
import java.util.Map;

public class Chapter4_4 {
	public static void main(String[] args) {
		//Mapの場合の拡張for文
		Map<Integer, String> classmates = new HashMap<>();
		classmates.put(1, "青木");
		classmates.put(2, "石坂");
		classmates.put(3, "小野田");
		
		// キーのみ
		for (Integer key : classmates.keySet()) {
		  System.out.println(key + ":" + classmates.get(key)); // HashMapなので順序は不定
		}

		System.out.println("\n");
		// 値のみ
		for (String name : classmates.values()) {
		  System.out.println(name); // HashMapなので順序は不定
		}

		System.out.println("\n");
		// キーと値のペア
		for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
		  System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん"); // HashMapなので順序は不定
		}
	}
}
