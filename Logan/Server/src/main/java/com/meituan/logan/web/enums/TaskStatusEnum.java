package com.meituan.logan.web.enums;

import lombok.Getter;

/**
 * ��������:  <p>��־����״̬</p>
 *
 * @version 1.0 2019-10-07
 * @since logan-web 1.0
 */
public enum TaskStatusEnum {

    NORMAL(0, "δ������"), ANALYZED(1, "�Ѿ���������");

    @Getter
    private int status;

    @Getter
    private String desc;

    TaskStatusEnum(int status, String desc) {
        this.desc = desc;
        this.status = status;
    }
}
