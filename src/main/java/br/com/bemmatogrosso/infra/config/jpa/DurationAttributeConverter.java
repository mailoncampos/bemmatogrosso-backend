package br.com.bemmatogrosso.infra.config.jpa;

import java.time.Duration;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DurationAttributeConverter implements AttributeConverter<Duration, Duration> {

	@Override
	public Duration convertToDatabaseColumn(Duration duration) {
		return duration;
	}

	@Override
	public Duration convertToEntityAttribute(Duration dbData) {
		return dbData;
	}

}
