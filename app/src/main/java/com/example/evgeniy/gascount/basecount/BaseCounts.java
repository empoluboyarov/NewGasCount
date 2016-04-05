package com.example.evgeniy.gascount.basecount;

/**
 * Created by Evgeniy on 05.04.2016.
 */
public class BaseCounts {
    public static final double PI = Math.PI;
    public static final double REFERENCE_TEMPERATURE = 293.15;// температура приведения в кельвинах
    public static final double REFERENCE_PRESSURE = 1.033224597594;

    // перевод градусов в кельвины
    public static double tempConverter(double temperature){
        return temperature + 273.15;
    }

    //перевод кгс/см.кв в МПа
    public static double presConverter(double pressure){
        return pressure*0.0980665;
    }

    //расчет относительной плотности газа
    public static double relativDensity(double density){
        return density/1.2044;
    }

    // расчет фактической плотности газа при рабочих учловиях


    // расчет коэффициента сжимаемости
    public static double compressibilityFactor(double temperature, double pressure, double density){
        return 1 - ((10.2*presConverter(pressure)-6)*(0.00345*relativDensity(density)-0.000446)+0.015)*
                (1.3-0.0144*(tempConverter(temperature)-283.2));
    }

    // расчет показателя адиабаты
    public static double adiabaticIndex(double temperature, double pressure, double density, double nitrogen){
        return 0.0;
    }

    // расчет скорости звука в газа
    public static double speedOfSound(double temperature, double pressure, double density, double nitrogen){
        return 0.0;
    }

    // расчет геометрического объема газопровода
    public static double volumeOfPipe (double length, double diameter){
        double radius = (diameter/1000)/2;
        return PI*length*Math.pow(radius,2);
    }

    //расчет запаса газа
    public static double supplyOfGas(double temperature, double pressure, double density,double length, double diameter){
        return (volumeOfPipe(length,diameter)*presConverter(pressure)*REFERENCE_TEMPERATURE)/
                (tempConverter(temperature)*compressibilityFactor(temperature,pressure,density)*REFERENCE_PRESSURE);
    }
}
