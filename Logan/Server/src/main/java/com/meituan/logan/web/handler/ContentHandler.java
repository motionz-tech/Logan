package com.meituan.logan.web.handler;

/**
 * ��־��ʽ���ӿڣ�ʹ�ÿ�����ʵ�ָ�����־���͵ĸ�ʽ������
 */
public interface ContentHandler {

    String getSimpleContent(String content);

    String getFormatContent(String content);

}
