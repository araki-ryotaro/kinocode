class Lesson09_01 {
  public static void main(String[] args) {
    int x = 8;
    int y = 8;
    // int x = 8;
    // int y = 12;
    // int z = 20;
    // int x = 8;
    // int y = 3;
    // int x = 10;
    // int y = 2;
    // int z = 10;

    // 足し算
    // System.out.println(x+y);
    // 引き算
    // System.out.println(x-y);
    // 掛け算
    // System.out.println(x*y);
    // 割り算
    // System.out.println(x/y);
    // 余り
    // System.out.println(x%y);

    // 関係演算子
    // x(10)はy(2)より大きいので、true
    // System.out.println(x > y);
    // x(10)はy(2)より小さくはないので、false
    // System.out.println(x < y);

    // x(10)はy(2)以上の数字なので、true
    // System.out.println(x >= y);
    // x(10)はy(2)以下の数字ではないので、false
    // System.out.println(x <= y);
    // x(10)はz(10)以下の数字なので、true
    // System.out.println(x <= z);

    // 等価
    // x(10)はy(2)とは違う数字なので、false
    // System.out.println(x == y);
    // x(10)はy(2)とは違う数字なので、true
    // System.out.println(x != y);

    // 論理演算子
    // x(8)は5以上かつ10以下の数字なので、true
    // System.out.println(x >= 5 && x <= 10);
    // y(3)は5以上かつ10以下の数字ではないので、false
    // System.out.println(y >= 5 && y <= 10);

    // x又はyのどちらかの数字が3であるため、true
    // System.out.println(x == 3 || y == 3);
    // x又はyのどちらの数字も1ではないため、false
    // System.out.println(x == 1 || y == 1);

    // 代入演算子、複合代入演算子
    // 8(x)+10=18
    // System.out.println(x += 10);
    // 20(z)+12(y)=32
    // System.out.println(z += y);

    // インクリメント、デクリメント
    // x(8)に1を足す、x = x+1と同じ
    x++;
    // y(8)に1を引く、y = y-1と同じ
    y--;

    // 8+1=9
    System.out.println(x);
    // 8-1=7
    System.out.println(y);
  }
}