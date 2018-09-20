package com.weather.fursa.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

    /**
        Таблица с данными о прогнозе погоды
        Схема таблицы в БД построенная с помощью аннотаций
        @author Fursa Ilya
        @email fursa.ilya@gmail.com
    */

@Entity(tableName = "weather", indices = {@Index(value = {"date"}, unique = true)})
public class Weather {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private Date date;
    private int weatherIconId;
    private double max;
    private double min;
    private double humidity;
    private double pressure;
    private double wind;
    private double degrees;

        /**
         * Weather table fields
         *
         * @param id  row id
         * @param date  date of forecast
         * @param weatherIconId  id of forecast icon
         * @param max  max temperature
         * @param min  min temperature
         * @param humidity  humidity of the day
         * @param pressure  pressure of the day
         * @param wind wind speed
         * @param degrees degrees wind direction
         */

    public Weather(int id, Date date, int weatherIconId, double max, double min, double humidity, double pressure, double wind, double degrees) {
        this.id = id;
        this.date = date;
        this.weatherIconId = weatherIconId;
        this.max = max;
        this.min = min;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.degrees = degrees;
    }

    @Ignore
    public Weather(Date date, int weatherIconId, double max, double min, double humidity, double pressure, double wind, double degrees) {
        this.date = date;
        this.weatherIconId = weatherIconId;
        this.max = max;
        this.min = min;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.degrees = degrees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getWeatherIconId() {
        return weatherIconId;
    }

    public void setWeatherIconId(int weatherIconId) {
        this.weatherIconId = weatherIconId;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }
}
