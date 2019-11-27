package unit4;

import java.util.Arrays;

/**
 * 最大子数组问题：
 *  对于一个随机数组，求其最大子数组，最大子数组的定义为：该子数组的值的和，在所有的子数组中是最大的。
 *
 *  解决方法有：
 *      1、暴力求解：即尝试所有的组合，并求取结果最大的组合，算法复杂度N2
 *      2、分治法：
 *          （1）将输入数组中分为2
 *          （2）计算左侧最大数组
 *          （3）计算右侧最大数组
 *          （4）计算跨越中间的最大数组
 *          （5）2-4步骤中的最大值
 *          （6）当输入数组长度为1时结束拆分
 */
public class MaxSubArray {
    public static int[] findMaxSubArray(int[] array, int startIndex, int endIndex){
        if (startIndex == endIndex){
            return new int[]{startIndex, endIndex, array[startIndex]};
        }
        int middle = (startIndex + endIndex) / 2;
        int[] leftResult = findMaxSubArray(array, startIndex, middle);
        int[] rightResult = findMaxSubArray(array, middle + 1, endIndex);
        int[] middleResult = findMidMaxSubArray(array, startIndex, middle, endIndex);
        if (leftResult[2] > rightResult[2] && leftResult[2] > middleResult[2]){
            return leftResult;
        }
        if (rightResult[2] > middleResult[2]){
            return rightResult;
        }
        return middleResult;
    }

    private static int[] findMidMaxSubArray(int[] array, int startIndex, int middle, int endIndex) {
        int leftMaxSum = Integer.MIN_VALUE;
        int leftMaxIndex = middle;
        int sum = 0;
        int rightMaxSum = Integer.MIN_VALUE;
        int rightMaxIndex = middle;
        for (int i = middle; i >= startIndex; i--){
            sum += array[i];
            if (sum > leftMaxSum){
                leftMaxSum = sum;
                leftMaxIndex = i;
            }
        }
        sum = 0;
        for (int i = middle + 1; i <= endIndex; i++){
            sum += array[i];
            if (sum > rightMaxSum){
                rightMaxIndex = i;
                rightMaxSum = sum;
            }
        }
        return new int[]{leftMaxIndex, rightMaxIndex, leftMaxSum + rightMaxSum};
    }

    public static void main(String[] args) {
        int[] array = new int[]{13,-3,-25,-20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        int[] maxSubArray = findMaxSubArray(array, 0, array.length - 1);
        System.out.println(Arrays.toString(maxSubArray));
    }
}
