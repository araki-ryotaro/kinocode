class Lesson11 {
  public static void main(String[] args) {

    // for文 iが4になるまで繰り返す
    // for(int i = 0; i <= 4; i ++) {
    //   System.out.println(i);
    // }

    // break iが3になった場合繰り返し終了
    // for(int i = 0; i <= 4; i ++) {
    //   if(i==3){
    //     break;
    //   }
    //   System.out.println(i);
    // }

    // continue iが3になったとき3を飛ばして繰り返しを続ける
    // for(int i = 0; i <= 4; i ++) {
    //   if(i==3){
    //     continue;
    //   }
    //   System.out.println(i);
    // }

    // for文のネスト jが2になるとiが1増える、iとjが2になるまで繰り返す
    // for(int i = 0; i <= 2; i ++) {
    //   for(int j = 0; j <= 2; j ++) {
    //     System.out.println( i + "-" + j );
    //   }
    // }

    // sum 2+4+6+8+10=30
    int arr[] = {2,4,6,8,10};
    int sum = 0;

    for( int i = 0; i <= 4; i ++ ) {
      sum += arr[i];
    }
    System.out.println(sum);
  }
}