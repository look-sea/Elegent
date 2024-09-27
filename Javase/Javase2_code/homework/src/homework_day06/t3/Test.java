package homework_day06.t3;

import java.util.Arrays;

/*编程题【冒泡排序】
        请按以下要求顺序编写程序：
        定义测试类，定义main()方法；
        定义以下数组：int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
        用Arrays类打印此数组的所有元素；
        用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。*/
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 432, 32, 54, 32, 3, 7, 657, 563, 25, 43, 6, 463, 52};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {// 控制轮次
            for (int j = 0; j < arr.length - 1 - i; j++) {// 每轮相邻元素比较的次数
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
