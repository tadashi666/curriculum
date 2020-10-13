package study;

//②Fruits.javaをインポートしなさい。
import fruits.Fruits;
/**
 * 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
 *
 * 問①〜問③まであります。
 * 全て回答し、課題にある画像と同じ表示になるようにしてください。
 *
 */
public class Study {

    public static void main(String[] args) {

        /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsから呼び出した値を設定してください。
         */
    	String FRUITS_LEMON_04 = "レモン";
    	Integer FRUITS_COUNT_20 = 20;

    	Fruits task = new Fruits();
    	task.printFruits(FRUITS_LEMON_04,FRUITS_COUNT_20);
    }
}