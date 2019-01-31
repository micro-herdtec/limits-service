package ec.gob.mag.limits.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LimitConfiguration {
	private Integer maximumLimit;
	private Integer minimumLimit;
}
