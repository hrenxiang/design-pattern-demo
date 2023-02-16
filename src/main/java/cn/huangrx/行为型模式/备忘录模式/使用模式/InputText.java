package cn.huangrx.行为型模式.备忘录模式.使用模式;


/**
 * 相当于Originator（发起者），负责创建一个备忘录，并且可以记录恢复自身的内部状态
 * 
 * @author   huangrx
 * @since   2023-02-16 20:17
 */
public class InputText {
  private StringBuilder text = new StringBuilder();

  public String getText() {
    return text.toString();
  }


  /**
   * 输入文本后添加到之前的文本末尾、
   *
   * @author   huangrx
   * @since   2023-02-16 20:18
   */
  public void append(String input) {
    text.append(input);
  }


  /**
   * 发起者可以创建快照
   *
   * @author   huangrx
   * @since   2023-02-16 20:18
   */
  public Snapshot createSnapshot() {
    return new Snapshot(text.toString());
  }


  /**
   * 发起者可以读取快照
   *
   * @author   huangrx
   * @since   2023-02-16 20:18
   */
  public void restoreSnapshot(Snapshot snapshot) {
    this.text.replace(0, this.text.length(), snapshot.getText());
  }
}