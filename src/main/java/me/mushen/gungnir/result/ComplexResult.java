package me.mushen.gungnir.result;

/**
 * @Desc 集成Result的复合Result
 * @Author Mushen
 * @Create 2019-05-21
 */
public abstract class ComplexResult implements Success {
    /** Result */
    protected Result result;

    protected ComplexResult(Result result) {
        this.result = result;
    }

    /**
     * 获取Result
     * @return
     */
    public Result getResult() {
        return result;
    }

    @Override
    public boolean isSuccess() {
        return result != null && result.isSuccess();
    }

    @Override
    public String toString() {
        return "ComplexResult{" +
                "result=" + result +
                '}';
    }
}
