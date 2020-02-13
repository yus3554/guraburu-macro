import java.awt.event.*;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.util.*;

public class GetMousePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            // マウスの座標を取得
            PointerInfo pi = MouseInfo.getPointerInfo();
            Point pt = pi.getLocation();

            // Test.javaに入れやすい形で出力
            System.out.print("{" + pt.getX() + ", " + pt.getY() + "},");

            // 改行で次の座標
            sc.nextLine();
        }
    }
}
