package me.mushen.gungnir.result;

/**
 * @Desc Result的工具类
 * @Author Mushen
 * @Create 2018-06-30
 */
public final class Results {

    /**
     * 校验Result是否成功
     * @param result Result
     * @return
     */
    public static boolean isSucc(Result result) {
        return result != null && result.isSuccess();
    }
}
