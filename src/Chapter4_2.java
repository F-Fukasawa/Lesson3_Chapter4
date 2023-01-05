import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Chapter4_2 {
	public static void main(String[] args) {
		// HashMapを生成する場合(キーがInteger、値がString)
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		// TreeMapを生成する場合(キー、値共にString)
		Map<String, String> map2 = new TreeMap<String, String>();
		
		//要素を追加する
		map1.put(0, "ぶどう");
		map1.put(3,  "もも");
		for (Integer key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}
		
		//登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		System.out.println("\nキー0の値上書き:" + map1.get(0));
		
		//存在しない要素の取得
		System.out.println("\n存在しない要素1のget:" + map1.get(1));	//nullを返す
		
		// キーの存在チェック (trueを返す)
		System.out.println("\nキー存在チェック(0):" + map1.containsKey(0));
		
		// 値の存在チェック (falseを返す)
		System.out.println("\n値存在チェック ぶどう:" + map1.containsValue("ぶどう"));
		
		//要素数の取得
		System.out.println("\n要素数:" + map1.size());
		
		// キーを指定して要素を削除する
		System.out.println("\n↓map一覧表示");
		for (Integer key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}
		
		System.out.println("\nキー0指定削除:" + map1.remove(0));	//戻り値は"ぶどう"
		System.out.println("存在しないキー指定削除:" + map1.remove(1));
		
		System.out.println("\n↓map一覧表示");
		for (Integer key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}
		
		// キーと値を指定して要素を削除する
		System.out.println("3,もも 指定削除:" + map1.remove(3, "もも"));	//戻り値はtrue
		System.out.println("3,なし 指定削除:" + map1.remove(3, "なし"));	//何もしない、戻り値はfalse
		System.out.println("↓map一覧表示");
		for (Integer key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}
	}
}
