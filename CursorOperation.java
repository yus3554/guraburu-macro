import java.awt.event.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.*;

public class CursorOperation {
    public static void main(String[] args) throws AWTException {

        // 座標配列 {x, y}
        double[][] points = { { 10.0, 100.0 }, { 20.0, 200.0 }, { 30.0, 300.0 }, { 1170.0, 544.0 }, { 510.0, 314.0 },
                { 467.0, 286.0 }, { 617.0, 165.0 }, { 692.0, 357.0 }, { 753.0, 455.0 }, { 662.0, 563.0 },
                { 484.0, 662.0 }, { 202.0, 455.0 }, { 229.0, 419.0 }, { 365.0, 447.0 }, { 560.0, 380.0 },
                { 279.0, 70.0 }, { 363.0, 511.0 }, { 540.0, 467.0 }, { 621.0, 579.0 }, { 120.0, 520.0 },
                { 364.0, 293.0 }, { 508.0, 400.0 }, { 321.0, 504.0 }, { 423.0, 352.0 } };

        // マウスを動かすためのインスタンス
        Robot robot = new Robot();

        // 一連の流れをループする
        for (int i = 0; i < 3; i++) {
            // 座標配列分ループ
            for (int j = 0; j < points.length; j++) {
                // 座標配列から一つずつ取り出し，randomPoint()で-5~5までの値をランダムに足す
                robot.mouseMove((int) points[j][0] + randomPoint(), (int) points[j][1] + randomPoint());
                // 左クリック
                // robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                // 1000ms待つ
                robot.delay(1000);
            }
        }
    }

    // ランダムな-5~5の値を返す
    public static int randomPoint() {
        Random rand = new Random();
        int num = rand.nextInt(10) - 5;
        return num;
    }
}