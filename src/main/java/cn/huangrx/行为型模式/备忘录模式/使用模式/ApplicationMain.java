package cn.huangrx.行为型模式.备忘录模式.使用模式;

import java.util.Scanner;


/**
 * 测试
 *
 * @author huangrx
 * @since 2023-02-16 20:16
 */
public class ApplicationMain {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals(":list")) {
                // 直接输出文本中的数据即可
                System.out.println(inputText.toString());
            } else if (input.equals(":undo")) {
                // 如果是撤销操作，那么将上次快照弹出，拿到上次对应的数据
                Snapshot snapshot = snapshotsHolder.popSnapshot();
                // 直接将文本中的数据替换成快照中的即可。
                inputText.restoreSnapshot(snapshot);
            } else {
                // 输入了非查询和撤销的文本后，我们首先创建上次文本的快照，利于后续的恢复
                snapshotsHolder.pushSnapshot(inputText.createSnapshot());
                // 然后再调用append方法，将本次输入的文本追加到文本后。
                inputText.append(input);
            }
        }
    }
}