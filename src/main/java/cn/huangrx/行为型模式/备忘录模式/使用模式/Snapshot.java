package cn.huangrx.行为型模式.备忘录模式.使用模式;


/**
 * 快照本身 --- 只存储相应数据，不做任何操作
 *
 * @author   huangrx
 * @since   2023-02-16 20:18
 */
public class Snapshot {
  private String text;

  public Snapshot(String text) {
    this.text = text;
  }

  public String getText() {
    return this.text;
  }
}