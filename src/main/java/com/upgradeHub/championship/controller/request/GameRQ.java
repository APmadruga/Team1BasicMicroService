package com.upgradeHub.championship.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameRQ {

    @Min(2021)
    @Max(3000)
    private int scheduleYear2021to3000;
    @Min(1)
    @Max(12)
    private int scheduleMonth1to12;
    @Min(1)
    @Max(31)
    private int scheduleDay1to31;
    @Min(0)
    @Max(23)
    private int scheduleHour0to23;

/*
    //INSIDE SERVICES WHEN NEED TO USE
    int year = gameRQ.getScheduleYear2021to3000();
    int month = gameRQ.getScheduleMonth1to12();
    int day = gameRQ.getScheduleDay1to31();
    int hour = gameRQ.getScheduleHour0to23();
    LocalDateTime maintenanceDay = LocalDateTime.of(year, month, day, hour,00,00);
*/
}
