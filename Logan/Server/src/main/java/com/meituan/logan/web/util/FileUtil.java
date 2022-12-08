package com.meituan.logan.web.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * ������:�ļ�����������
 * * @since 2019-11-25 17:01
 */
public class FileUtil {

    private static final Logger LOGGER = Logger.getLogger(FileUtil.class);

    public static File createNewFile(String fileName) {
        File file = getFile(fileName);
        if (file == null) {
            return null;
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            LOGGER.error(e);
            return null;
        }
        return file;
    }

    public static File getFile(String fileName) {
        String path = "/logfile" + File.separator;
        File file = new File(path + fileName);
        if (!path.equals(file.getParentFile().getAbsolutePath()+ File.separator)) {
            LOGGER.error(file.getParentFile().getAbsolutePath()+ File.separator);
            return null;
        }
        return file;
    }

    public static String getDownloadUrl(HttpServletRequest request, String fileName) {
        if (StringUtils.isEmpty(fileName) || request == null) {
            return "";
        }
        return "/logan/downing?name=" + fileName;
    }
}

