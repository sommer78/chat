package edu.sandau.chat.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/***
 * 用户登录方式
 */
@AllArgsConstructor
public enum UserFormTypeEnum {
    /***
     * 邮箱
     */
    EMAIL(0, "email"),
    /***
     * 手机号
     */
    TELEPHONE(1, "telephone"),
    /***
     * 用户名
     */
    NAME(2, "name");

    public final Integer value;
    public final String name;
}
