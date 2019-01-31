package ec.gob.mag.limits.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("limits-service")
@Data

public class Configuration {
	private Integer maximum;
	private Integer minimum;
}
