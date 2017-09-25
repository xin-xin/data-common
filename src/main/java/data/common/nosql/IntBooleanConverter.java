package data.common.nosql;

import org.springframework.core.convert.converter.Converter;

public class IntBooleanConverter implements Converter<Integer, Boolean> {

	public Boolean convert(Integer arg0) {
		return arg0!=0;
	}

}
