package com.vanguard.p2p.utils;

import java.util.UUID;

/**
 * IDUtils
 * Created by DaneZhang on 2017/4/30.
 */
public class IDUtils {
    /**
     * 获得32位UUID
     * @return
     */
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
