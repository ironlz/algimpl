package lz.utils.sort.impl;

/**
 * 排序比较器
 * @author Ironlz
 */
class SortComparator {
    static <T extends Comparable> int compare(T target, T t, boolean isAscend) {
        int i = target.compareTo(t);
        if (!isAscend){
            i *= -1;
        }
        return i;
    }
}
