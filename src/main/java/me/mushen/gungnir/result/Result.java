package me.mushen.gungnir.result;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-06-30
 */
@Getter
@ToString
public class Result {
    // 返回结果码: 成功(1), 失败(0)
    private int code;
    // 具体的错误信息: 如果返回结果为0时, 则该字段不为空
    private List<Failure> failures;

    public Result(int code) {
        this(code, null);
    }

    public Result(int code, List<Failure> failures) {
        this.code = code;
        this.failures = failures;
    }
}
