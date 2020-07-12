package com.xiaobear.servlet;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaobear
 * @version 1.0
 * @date 2020/6/6 0006 12:04
 */
public class Test {

/*    public static int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        for (int start = 0; start < n - L + 1; ++start) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }*/

    public static int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        if (L == 0) {
            return 0;
        }
        int pn = 0;
        while (pn < n - L + 1){
            while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) {
                ++pn;
            }
            int curr_len = 0;int pL = 0;
            while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)){
                ++pn;
                ++pL;
                ++curr_len;
            }
            if (curr_len == L){
                return pn - L ;
            }
            pn = pn - curr_len + 1;
        }
        return -1;
    }

    public int lengthOfLongestSubstring(String s) {
// 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
