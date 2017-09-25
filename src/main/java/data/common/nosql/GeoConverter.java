package data.common.nosql;

import org.springframework.core.convert.converter.Converter;

import data.common.domain.nosql.Coordinate;
import data.common.util.JsonUtil;

public class GeoConverter implements Converter<Coordinate, String> {
	public String convert(Coordinate value) {
		return JsonUtil.toJson(value);
	}
}
