package me.mushen.gungnir.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Desc 集合工具类
 * @Author Mushen
 * @Create 2019-08-16
 */
public abstract class CollectionUtil {

    /**
     * 判断集合是否为空
     * @param coll
     * @return
     */
    public static boolean isEmpty(Collection coll) {
        return coll == null || coll.isEmpty();
    }

    /**
     * 判断集合是否不为空
     * @param coll
     * @return
     */
    public static boolean isNotEmpty(Collection coll) {
        return !isEmpty(coll);
    }

    /**
     * 判断键值对是否为空
     * @param map
     * @return
     */
    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    /**
     * 判断键值对是否为空
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

    /**
     * 返回一个List, 如果给定的集合为null时, 则使用<code>Collections.emptyList()</code>创建一个空List
     * @param coll
     * @param <T>
     * @return
     */
    public static <T> List<T> nullToEmptyList(Collection<T> coll) {
        return coll == null ? Collections.emptyList() : new ArrayList<>(coll);
    }

    /**
     * 返回一个Set, 如果给定的集合为null时, 则使用<code>Collections.emptySet()</code>创建一个空Set
     * @param coll
     * @param <T>
     * @return
     */
    public static <T> Set<T> nullToEmptySet(Collection<T> coll) {
        return coll == null ? Collections.emptySet() : new HashSet<>(coll);
    }

    /**
     * 返回一个Map, 如果给定的集合为null时, 则使用<code>Collections.emptySet()</code>创建一个空Set
     * @param map
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K, V> Map<K, V> nullToEmptyMap(Map<K, V> map) {
        return map == null ? Collections.emptyMap() : map;
    }

    /**
     * 返回一个List, 如果给定集合是空集合, 则创建一个初始容量是16的List
     * @param coll
     * @param <T>
     * @return
     */
    public static <T> List<T> emptyToNewList(Collection<T> coll) {
        return emptyToNewList(coll, 16);
    }

    /**
     * 返回一个List, 如果给定集合是空集合, 则创建一个初始容量是<code>initialCapacity</code>的List
     * @param coll
     * @param initialCapacity
     * @param <T>
     * @return
     */
    public static <T> List<T> emptyToNewList(Collection<T> coll, int initialCapacity) {
        return isEmpty(coll) ? new ArrayList<>(initialCapacity) : new ArrayList<>(coll);
    }
}
