package com.meituan.logan.web.enums;

/**
 * ��������:  <p>H5����־�ֶ�ö��</p>
 *
 * @version 1.0 2019-11-01
 * @since logan-web 1.0
 */
public enum WebLogFieldEnum {

    VERSION("v", "���ܰ汾"), LOG("l", "��־��"), IV("iv", "�ͻ���IV"), KEY("k", "�ͻ��˷ǶԳƼ���AES key"), LOG_TYPE(
            "t", "��־����"), CONTENT("c", "��־����"), LOG_TIME("d", "�ͻ��˼�¼��־��ʱ��");

    public String key;
    public String desc;

    WebLogFieldEnum(String key, String desc) {
        this.desc = desc;
        this.key = key;
    }
}
