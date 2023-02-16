package cn.huangrx.行为型模式.备忘录模式.使用模式;

import java.util.Stack;


/**
 * 快照管理者 --- 对快照进行存储，删除（使用栈的特性）
 * 
 * @author   huangrx
 * @since   2023-02-16 20:20
 */
public class SnapshotHolder {
  private Stack<Snapshot> snapshots = new Stack<>();


  /**
   * 弹出上次的快照
   *
   * @author   huangrx
   * @since   2023-02-16 20:21
   */
  public Snapshot popSnapshot() {
    return snapshots.pop();
  }


  /**
   * 在添加本次数据前，先创建上次的快照
   *
   * @author   huangrx
   * @since   2023-02-16 20:22
   */
  public void pushSnapshot(Snapshot snapshot) {
    snapshots.push(snapshot);
  }
}