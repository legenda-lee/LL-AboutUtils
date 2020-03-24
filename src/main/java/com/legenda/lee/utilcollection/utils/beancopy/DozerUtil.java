package com.legenda.lee.utilcollection.utils.beancopy;



import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

public class DozerUtil {

    private static Mapper mapper = new DozerBeanMapper();

    public static <T, V> V cover(T t, Class<V> v) {
        if (t == null) return null;
        return mapper.map(t, v);
    }

    @SuppressWarnings("unchecked")
    public static <T, V> V cover(T t, V v) {
        return (V) cover(t, v.getClass());
    }

    public static <T, V> List<V> coverList(List<T> t, Class<V> v) {
        if (t == null) return null;
        List<V> list = new ArrayList<V>();
        for (T temp : t) {
            list.add((V) cover(temp, v));
        }
        return list;
    }

    public static void setMapper(Mapper mapper1) {
        mapper = mapper1;
    }

}
