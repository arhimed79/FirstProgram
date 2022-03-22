package lessons30;

import java.util.Optional;

public interface CityServis {

    CityDTO save(CityDTO cityDTO);
    Optional<CityDTO> findCity(Integer code);
    void deleteCity(Integer code);
}
