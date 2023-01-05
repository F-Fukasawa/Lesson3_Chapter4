import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Chapter4_3 {
	public static void main(String[] args) {
		// HashSetを生成する場合
		Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSetを生成する場合
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		// 要素を追加する
		set1.add("スイカ");
		set1.add("メロン");
		System.out.println("↓setの一覧表示");
		for (String s : set1) {
			System.out.println(s);
		}
		
		// 存在チェック (trueを返す)
		System.out.println("\n存在チェック スイカ:" + set1.contains("スイカ"));
		
		// 存在チェック (falseを返す)
		System.out.println("\n存在チェック　なし:" + set1.contains("なし"));
		
		//要素数を取得
		System.out.println("\n要素数:" + set1.size());
		
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		System.out.println("\n要素の削除 スイカ:" + set1.remove("スイカ"));
		System.out.println("要素の削除 なし:" + set1.remove("なし"));
		System.out.println("↓setの一覧表示");
		for (String s : set1) {
			System.out.println(s);
		}
	}
}
