class Lesson07_01 {
  public static void main(String[] args) {
    // -100～+100
    byte var01 = 1;
    // -3万～+3万
    short var02 = 12345;
    // -20億～+20億
    int var03 = 1234567890;
    // 「京」の桁以上、末尾に[L]又は[l]を記載
    long var04 = 123456789000L;

    System.out.println(var01);
    System.out.println(var02);
    System.out.println(var03);
    System.out.println(var04);
  }
}