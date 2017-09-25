package data.common.nosql;

import org.springframework.core.convert.converter.Converter;

public class BooleanIntConverter implements Converter<Boolean, Integer> {

	public Integer convert(Boolean arg0) {
		if (arg0) {
			return 1;
		}
		return 0;
	}

}
