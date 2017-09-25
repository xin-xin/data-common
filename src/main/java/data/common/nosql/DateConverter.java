package data.common.nosql;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Timestamp> {
	private final SimpleDateFormat sdf = new SimpleDateFormat(
			"EEE MMM d HH:mm:ss Z yyyy");

	public Timestamp convert(String arg0) {
		try {
			return new Timestamp(sdf.parse(arg0).getTime());
		} catch (Exception ex) {
			return null;
		}
	}
}
