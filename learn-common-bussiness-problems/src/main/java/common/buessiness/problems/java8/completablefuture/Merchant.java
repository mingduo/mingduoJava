package common.buessiness.problems.java8.completablefuture;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Merchant {
    private Long id;
    private Integer averageWaitMinutes;
}
