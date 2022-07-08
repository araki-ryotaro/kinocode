class Lesson06_03 {
  public static void main(String[] args) {
    // 変数で使えるのは下記4つのみ
    // アルファベット
    int var = 1;
    // 数字
    int var01 = 2;
    // アンダースコア
    int var_01 = 3;
    // ドルマーク
    int var$01 = 4;
    // 下記は変数では使えない
    // ハイフン
    // int var-01 = 5;
    // 数字から始める変数
    // int 01var = 6;
    // 予約語も変数名にはできない(プログラミング上で役割が決まっている単語)
    // int return = 1;
    // int class = 1;

    int VAR = 1;
    int Var = 2;

    System.out.println(var);
    System.out.println(var01);
    System.out.println(var_01);
    System.out.println(var$01);
    // System.out.println(var-01);
    // System.out.println(01var);

    System.out.println(VAR);
    System.out.println(Var);

    // System.out.println(return);
    // System.out.println(class);
  }
}