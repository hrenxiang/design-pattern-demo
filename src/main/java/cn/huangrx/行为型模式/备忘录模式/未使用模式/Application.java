package cn.huangrx.行为型模式.备忘录模式.未使用模式;

import java.util.Scanner;

/**
 * 测试
 *
 * @author huangrx
 * @since 2023/2/16 20:03
 */
public class Application {

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshot = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (":list".equals(str)) {
                System.out.println(inputText.getText());
            } else if (":undo".equals(str)) {
                InputText inputText1 = snapshot.popSnapshot();
                inputText.setText(inputText1.getText());
            } else {
                snapshot.pushSnapshot(inputText);
                inputText.append(str);
            }
        }
    }
}
