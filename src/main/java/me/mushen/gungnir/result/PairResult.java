package me.mushen.gungnir.result;

/**
 * @Desc Pair Result
 * @Author Mushen
 * @Create 2019-09-29
 */
public final class PairResult<L, R> extends ComplexResult {
    /** Left Value */
    private L left;

    /** Right Value */
    private R right;

    private PairResult(Result result, L left, R right) {
        super(result);
        this.left = left;
        this.right = right;
    }

    /**
     * Success Pair Result
     * @param left
     * @param right
     * @param <L>
     * @param <R>
     * @return
     */
    public static <L, R> PairResult<L, R> success(L left, R right) {
        return of(Result.success(), left, right);
    }

    /**
     * Failure Pair Result
     * @param result
     * @param <L>
     * @param <R>
     * @return
     */
    public static <L, R> PairResult<L, R> failure(Result result) {
        return of(result, null, null);
    }

    /**
     * Create Pair Result
     * @param result
     * @param left
     * @param right
     * @param <L>
     * @param <R>
     * @return
     */
    public static <L, R> PairResult<L, R> of(Result result, L left, R right) {
        return new PairResult<>(result, left, right);
    }

    /**
     * 获取左边的值
     * @return
     */
    public L getLeft() {
        return left;
    }

    /**
     * 获取右边的值
     * @return
     */
    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return  '{' +
                "result=" + result +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
