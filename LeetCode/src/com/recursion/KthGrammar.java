package com.recursion;

public class KthGrammar {
    public int kthGrammar(int N, int K) {
        if(N == 1)
            return 0;
        if(N == 2)
            return K == 1 ? 0 : 1;
        int tmp = (1 << N - 1) >> 1;
        if(K <= tmp)
        {
            return kthGrammar(N - 1, K);
        }
        else
        {
            return 1 - kthGrammar(N - 1, (K - tmp));
        }
    }
}
