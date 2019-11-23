package house.smart.smarthouse.domain;

import house.smart.smarthouse.service.impl.TempServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class TemperatureChanger {

    @Autowired
    private TempServImpl tempServ;

    @Scheduled(fixedRate = 10000)
    public void scheduleFixedRateTask() {

        tempServ.changeTempInARooms();
    }

}
