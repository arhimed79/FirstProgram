package lessons30;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@Slf4j
@ShellComponent
@RequiredArgsConstructor
public class CityInterfaceUser {

    private final CityServis cityServis;

    @ShellMethod(value = "Create city", key = "cc")
    public void createCity(
            @ShellOption({"-c", "--code"}) Integer cityCode,
            @ShellOption({"-n", "--name"}) String cityName,
            @ShellOption({"-ne", "--nameEn"}) String cityNameEn,
            @ShellOption({"-p", "--pop"}) Long population) {
        final CityDTO cityDTO = new CityDTO(cityCode, cityName, cityNameEn, population);
        cityServis.save(cityDTO);
        log.debug("Успешно создан город {}", cityDTO);
    }

    @ShellMethod(value = "Update city", key = "uc")
    public void updateCity(
            @ShellOption({"-c", "--code"}) Integer cityCode,
            @ShellOption({"-n", "--name"}) String cityNameRU,
            @ShellOption({"-ne", "--nameEn"}) String cityNameEn,
            @ShellOption({"-p", "--pop"}) Long population) {
        cityServis.findCity(cityCode).ifPresent(city -> {
            city.setNameRU(cityNameRU);
            city.setNameEN(cityNameEn);
            city.setPopulation(population);
            cityServis.save(city);
            log.debug("Успешно обновлен город {}", city);
        });
    }

    @ShellMethod(value = "Delete city", key = "dc")
    public void deleteCity(
            @ShellOption({"-c", "--code"}) Integer cityCode) {
        cityServis.deleteCity(cityCode);
        log.debug("Успешно удален город с кодом {}", cityCode);
    }

    @ShellMethod(value = "Find city", key = "fc")
    public void findCity(
            @ShellOption({"-c", "--code"}) Integer cityCode) {
        cityServis.findCity(cityCode).ifPresentOrElse(
                city -> log.info("Найденный город {}", city),
                () -> log.warn("Город с кодом {} не найден в БД", cityCode)
        );
    }
}
