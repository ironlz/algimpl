package lz.utils.sort.impl;

import java.lang.reflect.Array;

import static lz.utils.sort.impl.SortComparator.compare;

/**
 * 选择排序算法实现
 *      循环从剩余元素中选择最小值插入到当前位置
 */
public class SelectSort {
    /**
     * 选择排序
     * @param array 待排序数组
     * @param isAscend 排序类型，true升序 false降序
     * @param <T> 待排序数组的数据类型
     * @return 排序后的结果，注意该方法为原址排序，排序后会改变输入数组的值的位置。传入null将会获得一个null
     */
    public static <T extends Comparable> T[] selectSort(T[] array, boolean isAscend){
        if (array == null || array.length <= 1) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            T target = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (compare(target, array[j], isAscend) > 0){
                    target = array[j];
                    index = j;
                }
            }
            if (index != i) {
                T temp = array[i];
                array[i] = target;
                array[index] = temp;
            }
        }
        return array;
    }

    /**
     * 非原址选择排序，排序后返回一个新数组
     * @param array 待排序数组
     * @param isAscend 排序类型，true升序 false降序
     * @param <T> 待排序数组的数据类型
     * @return 排序后的结果，注意该方法为原址排序，排序后会改变输入数组的值的位置。传入null将会获得一个null
     */
    public static <T extends Comparable> T[] selectSort2(T[] array, boolean isAscend){
        if (array == null){
            return null;
        }
        T[] temp = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        System.arraycopy(array, 0, temp, 0, array.length);
        return selectSort(temp, isAscend);
    }
}
