package me.mushen.gungnir.result;

import java.util.Arrays;
import java.util.List;

/**
 * @Desc
 * @Author Mushen
 * @Create 2018-06-30
 */
public final class Results {
    // Failure Result Code
    private static final int FAIL_CODE = 0;
    // Success Result Code
    private static final int SUCC_CODE = 1;

    // Throwable Failure Code
    private static final int FAIL_THROWABLE_CODE = 999999999;
    // Default Failure Code
    private static final int FAIL_DEFAULT_CODE = 999999000;

    public static boolean isSucc(Result result) {
        return result != null && result.getCode() == SUCC_CODE;
    }

    public static Result success() {
        return new Result(SUCC_CODE);
    }

    public static Result failure() {
        return failure(FAIL_DEFAULT_CODE, "FAIL_DEFAULT_NAME", "FAIL_DEFAULT_DESC");
    }

    public static Result failure(Throwable throwable) {
        return failure(FAIL_THROWABLE_CODE, throwable.getClass().getSimpleName(), throwable.getMessage());
    }

    public static Result failure(int failCode, String failName, String failDesc) {
        return failure(new Failure(failCode, failName, failDesc));
    }

    public static Result failure(Failure... failures) {
        if(failures != null && failures.length > 0) {
            return failure(Arrays.asList(failures));
        }else {
            return failure();
        }
    }

    public static Result failure(List<Failure> failureList) {
        return new Result(FAIL_CODE, failureList);
    }
}
