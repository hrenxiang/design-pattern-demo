package cn.huangrx.行为型模式.备忘录模式.未使用模式;

import java.util.Stack;

/**
 * 快照管理者（负责存储）
 *
 * @author huangrx
 * @since 2023/2/16 19:59
 */
public class SnapshotHolder {

    private Stack<InputText> stack = new Stack<>();

    /**
     * 读取
     */
    public InputText popSnapshot() {
        return stack.pop();
    }

    /**
     * 保存
     * @param text
     */
    public void pushSnapshot(InputText text) {
        InputText inputText = new InputText();
        inputText.setText(text.getText());
        stack.push(inputText);
    }

}
