/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busa;

/**
 *
 * @author pc
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc
 */
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Trips implements Serializable {

    private String source;
    private String distination;

    private String vehicle;
    private String seats;

    public Trips() {
    }

    public Trips(String source, String distination, String vehicle, String seats) {
        this.source = source;
        this.distination = distination;
        this.vehicle = vehicle;

        this.seats = seats;

    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getSeats() {
        return seats;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDistination(String distination) {
        this.distination = distination;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getSource() {
        return source;
    }

    public String getDistination() {
        return distination;
    }

    public String getVehicle() {
        return vehicle;
    }

}
