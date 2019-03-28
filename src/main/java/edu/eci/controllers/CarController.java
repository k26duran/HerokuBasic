package edu.eci.controllers;

import edu.eci.models.Car;
import edu.eci.services.CarServices;
import edu.eci.services.contracts.ICarServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.UUID;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired ICarServices carService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getCar(){
    	try{
            return new ResponseEntity<>(carService.list(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> createCar(@RequestBody Car car){
    	try{
            return new ResponseEntity<>(carService.create(car), HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> updateCar(@RequestBody Car car){
    	try {
        	carService.update(car);
	        return new ResponseEntity<>(carService.list(),HttpStatus.CREATED);
        }catch(Exception e) {
        	return new ResponseEntity<>(e.getMessage(),HttpStatus.FORBIDDEN);
        }
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> deleteCar(@RequestBody String id){
    	try {
    		
         	carService.delete(id);
 	        return new ResponseEntity<>("Se ha eliminado correctamente",HttpStatus.ACCEPTED);
         }catch(Exception e) {
         	return new ResponseEntity<>(e.getMessage(),HttpStatus.FORBIDDEN);
         }
    }
}
