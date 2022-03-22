package lessons30;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityServisImpl implements CityServis {

    private final CityJPA cityJPA;

    @Override
    public CityDTO save(CityDTO cityDTO) {
        return cityJPA.save(cityDTO);
    }

    @Override
    public Optional<CityDTO> findCity(Integer code) {
        return cityJPA.findById(code);
    }

    @Override
    public void deleteCity(Integer code) {
        cityJPA.deleteById(code);
    }
}
