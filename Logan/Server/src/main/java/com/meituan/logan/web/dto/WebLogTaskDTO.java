package com.meituan.logan.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * ��������:  <p></p>
 *
 * @version 1.0 2019-10-30
 * @since logan-web 1.0
 */
@Data
public class WebLogTaskDTO implements Comparable<WebLogTaskDTO> {
    private long taskId;

    /**
     * �豸��ʾ
     */
    private String deviceId;

    /**
     * ��Դ
     */
    private String webSource;

    /**
     * ������Ϣ
     */
    private String environment;

    private int pageNum;

    @JsonIgnore
    private String content;

    /**
     * ��־�ϱ�ʱ��
     */
    private long addTime = System.currentTimeMillis();

    /**
     * ��־������
     */
    private long logDate;

    /**
     * 0:δ��������1��������
     */
    private int status = 0;

    /**
     * �ͻ����ϱ�Ԫ��Ϣ
     */
    private String customReportInfo;

    /**
     * �㼯���taskIdΪһ��task��
     */
    private String tasks;

    private Date updateTime;

    @Override
    public int compareTo(WebLogTaskDTO o) {
        if (null == o) {
            return 0;
        }
        return this.pageNum - o.getPageNum();
    }
}
