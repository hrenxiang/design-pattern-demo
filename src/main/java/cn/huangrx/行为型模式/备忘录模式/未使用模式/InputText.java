package cn.huangrx.行为型模式.备忘录模式.未使用模式;

/**
 * 文本
 *
 * @author huangrx
 * @since 2023/2/16 19:53
 */
public class InputText {
    private StringBuilder text = new StringBuilder();


    /**
     * 将输入的文本添加到之前的文本后面
     *
     * @author   huangrx
     * @since   2023-02-16 19:56
     */
    public void append(String input) {
        text.append(input);
    }

    public String getText() {
        return text.toString();
    }

    public void setText(String text) {
        this.text.replace(0, this.text.length(), text);
    }
}
