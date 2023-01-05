import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Chapter4_1 {
	public static void main(String[] args) {
		//ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();
		
		//LinkedListを生成する場合
		List<Integer> list2 = new LinkedList<Integer>();
	
		//要素を追加する
		list1.add("りんご");
		list1.add("みかん");
		
		//位置を指定して要素を追加する
		list1.add(1, "バナナ");
		
		// コレクションの要素数より大きい位置を指定すると実行時エラー
		//list1.add(5, "ドリアン");
		
		for (String s : list1) {
			System.out.println(s);
		}
		
		//要素を取得する
		String item = list1.get(0);
		System.out.println("get(0)：" + item);
		
		//存在チェック (trueを返す)
		System.out.println("contains(バナナ) trueの場合：" + list1.contains("バナナ"));
		
		//存在チェック (falseを返す)
		System.out.println("contains(なし) falseの場合：" + list1.contains("なし"));
		
		//要素数の取得
		System.out.println("size()：" + list1.size());
		
		//要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		System.out.println("remove(バナナ)：" + list1.remove("バナナ"));	//戻り値はtrue
		System.out.println("remove(なし)：" + list1.remove("なし"));		//何もしな、戻り値はfalse
		for (String s : list1) {
			System.out.println(s);
		}
		
		//位置を指定して要素を削除する
		System.out.println("位置指定remove：" + list1.remove(0));	//戻り値はりんご
		//list1.remove(5);	//コレクションの要素より大きい位置を指定すると実行エラー
		for (String s : list1) {
			System.out.println(s);
		}
	}
}
