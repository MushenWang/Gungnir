package me.mushen.gungnir.result;

/**
 * @Desc 表示成功与否的接口
 * @Author Mushen
 * @Create 2019-08-16
 */
public interface Success {
    /**
     * 是否失败
     * @return
     */
    default boolean isFailure() {
        return !isSuccess();
    }

    /**
     * 是否成功
     * @return
     */
    boolean isSuccess();
}
