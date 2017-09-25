package data.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class JsonUtil {

	private static final Gson mapper = new GsonBuilder().create();

	//private static final ObjectMapper mapper = JsonFactory.create();

	public static <T> T fromJson(String json, Class<T> type) {
		return mapper.fromJson(json, type);
	}

	public static String toJson(Object value) {
		return mapper.toJson(value);
	}

}
