/**
 * 配列の例
 * 配列、ArrayList、HashMapの定義と基本的な操作方法を示します。
 */
import java.util.ArrayList;  // 動的配列を使うためのクラス
import java.util.HashMap;    // キーと値を管理するマップクラス

public class ArrayExample {
    public static void main(String[] args) {
        // int型の配列を宣言＆要素数3で初期化（初期値は0）
        int[] numbers;
        numbers = new int[3];

        // 配列を宣言と同時に初期化
        int[] scores = {10, 20, 30, 40, 50};

        // String型の配列（文字列の配列）
        String[] names = {"Alice", "Bob", "Charlie"};

        // 配列の要素に値を代入
        numbers[0] = 100;
        numbers[1] = 200;

        // 配列要素の出力
        System.out.println("numbers[0]: " + numbers[0]);  // 100
        System.out.println("scores[2]: " + scores[2]);    // 30
        System.out.println("names[1]: " + names[1]);      // Bob

        // 配列の長さ（要素数）を取得
        System.out.println("scoresの長さ: " + scores.length);  // 5

        // for文でscores配列の要素を順に出力
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }

        // 拡張for文（foreach）でscores配列の要素を出力
        for (int score : scores) {
            System.out.println("score = " + score);
        }

        // names配列を拡張for文で出力
        for (String name : names) {
            System.out.println("name = " + name);
        }

        // 二次元配列（3x3の行列）の定義
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 二次元配列の特定要素の出力（行：1、列：2 → 6）
        System.out.println("matrix[1][2]: " + matrix[1][2]);

        // scores配列の合計と平均を計算
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;

        System.out.println("合計: " + total);
        System.out.println("平均: " + average);

        // ArrayList（文字列型）を作成：可変長のリスト
        ArrayList<String> board = new ArrayList<>();
        board.add("Taro");
        board.add("Jiro");
        board.add("Saburo");

        // ArrayListの要素取得とサイズ取得
        System.out.println("board.get(0): " + board.get(0));  // Taro
        System.out.println("boardのサイズ: " + board.size());  // 3

        // ArrayListの全要素を拡張for文で出力
        for (String name : board) {
            System.out.println("boardの名前: " + name);
        }

        // HashMap（キー：String、値：Integer）の作成
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Taro", 10);  // Taroのスコア10
        map.put("Jiro", 20);  // Jiroのスコア20

        // HashMapから特定キーの値を取得
        System.out.println("Taroのスコア: " + map.get("Taro"));

        // HashMapの要素数を取得
        System.out.println("mapのサイズ: " + map.size());

        // HashMapの全要素を出力（キーを取得し、そのキーに対応する値を取り出す）
        for (String name : map.keySet()) {
            System.out.println(name + " = " + map.get(name));
        }
    }
}