
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] num = new Integer[7];
        num[0] = 44;
        num[1] = 68;
        num[2] = 6;
        num[3] = 13;
        num[4] = 26;
        num[5] = 62;
        num[6] = 16;
        for (Integer integer : num) {
            System.out.print(integer+"\t");
        }
        System.out.println("\n-----------华丽的分割线-----------");
        sort(num);

    }
    public static void sort(Integer[] number){
        for (int i = 0;i<number.length;i++){
            //用于交换的中间变量
            int change = 0;
            for (int j =0;j<number.length -1;j++){
                if (number[j]>number[j+1]){
                    change = number[j];
                    number[j] = number[j+1];
                    number[j+1] = change;
                }
                System.out.print(number[j]+"\t");
            }
            System.out.println();
        }
    }
}
