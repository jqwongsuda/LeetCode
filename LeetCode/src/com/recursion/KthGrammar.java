package com.recursion;

/**
 * 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 *
 * 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
 */
public class KthGrammar {
//    public int kthGrammar(int N, int K) {
//        if(N == 1)
//            return 0;
//        if(N == 2)
//            return K == 1 ? 0 : 1;
//        int tmp = (1 << N - 1) >> 1;
//        if(K <= tmp)
//        {
//            return kthGrammar(N - 1, K);
//        }
//        else
//        {
//            return 1 - kthGrammar(N - 1, (K - tmp));
//        }
//    }

    /**
     * 这个直接用运算符算的，真心看不懂
     * 一般而言，第 K 位的父位应该是第 (K+1) / 2 位。如果父位是 0，那么这一位就是 1 - (K%2)。如果父位是 1，那么这一位就是 K%2。
     * @param N
     * @param K
     * @return
     */
    public int kthGrammar(int N, int K) {
        if (N == 1) return 0;
        return (~K & 1) ^ kthGrammar(N-1, (K+1)/2);
    }
}
