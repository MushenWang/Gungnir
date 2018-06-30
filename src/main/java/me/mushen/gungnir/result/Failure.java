package me.mushen.gungnir.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Desc 错误信息
 * @Author Remilia
 * @Create 2018-06-30
 */
@Getter
@ToString
@AllArgsConstructor
public class Failure {
    // 错误码
    private int failCode;
    // 错误名称
    private String failName;
    // 错误描述
    private String failDesc;
}
