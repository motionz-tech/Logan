package com.meituan.logan.web.enums;

import com.meituan.logan.web.model.Tuple;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

/**
 * ��������:  <p>�ͻ�����־���ͣ���ʹ�÷������ж���</p>
 *
 * @version 1.0 2019-10-07
 * @since logan-web 1.0
 */
public enum LogTypeEnum {
    UNKNOWN(0, "unknown"), ONE(1, "��־����1"), TWO(2, "��־����2"), THREE(3, "��־����3");

    @Getter
    private int logType;

    @Getter
    private String logDesc;

    LogTypeEnum(int logType, String logDesc) {
        this.logDesc = logDesc;
        this.logType = logType;
    }

    public static LogTypeEnum valueOfLogType(int logType) {
        for (LogTypeEnum en : LogTypeEnum.values()) {
            if (en.getLogType() == logType) {
                return en;
            }
        }
        return UNKNOWN;
    }

    public static List<Tuple<Integer, String>> allLogTypes() {
        List<Tuple<Integer, String>> logTypes = new LinkedList<>();
        for (LogTypeEnum logType : LogTypeEnum.values()) {
            if (logType != UNKNOWN) {
                logTypes.add(Tuple.create(logType.logType, logType.logDesc));
            }
        }
        return logTypes;
    }

    public static boolean contains(int logType) {
        for (LogTypeEnum en : LogTypeEnum.values()) {
            if (en.logType == logType) {
                return true;
            }
        }
        return false;
    }
}
