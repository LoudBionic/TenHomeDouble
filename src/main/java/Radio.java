import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int stationNumber;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int quantityStationNumber = 10;


}
