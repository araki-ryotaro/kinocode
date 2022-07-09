class Lesson07_04 {
  public static void main(String[] args) {
    int var_a = 10;
    int var_b = 1;
    boolean var_bool;

    // 結果true、10>1という数式になるので正しい
    // var_bool = (var_a > var_b);
    // 結果false、10<1という数式になるので間違い
    var_bool = (var_a < var_b);

    System.out.println(var_bool);
  }
}