package data.common.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import data.common.util.JsonUtil;

public class ConfigUtil {
	public static Configuration loadConfig(String file) throws IOException {
		return JsonUtil.fromJson(FileUtils.readFileToString(new File(file)),
				Configuration.class);
	}

	public static Configuration loadConfig(InputStream is) throws IOException {
		StringWriter writer = new StringWriter();
		IOUtils.copy(is, writer, "UTF-8");
		return JsonUtil.fromJson(writer.toString(), Configuration.class);
	}
}
