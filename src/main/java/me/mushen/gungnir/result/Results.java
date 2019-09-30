package me.mushen.gungnir.result;

import java.util.Arrays;

/**
 * @Desc Result Utils
 * @Author Mushen
 * @Create 2019-09-29
 */
public abstract class Results {

    /**
     * 获取Result列表中第一个表示失败的Result, 如果为空或者都是成功, 则返回Result.success()
     * @param results
     * @return
     */
    public static Result returnFailure(Result... results) {
        if(results == null || results.length == 0) {
            return Result.success();
        }else {
            return Arrays.stream(results).filter(Result::isFailure).findFirst().orElse(Result.success());
        }
    }
}
