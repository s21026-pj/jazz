package pl.pjatk.alepen.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.alepen.Car;

@RestController
@RequestMapping("/test")
public class NewController {

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> test(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }
    @GetMapping("/model")
    public ResponseEntity<Car> test2(){
        return ResponseEntity.ok(new Car("VW","Tiguan"));
    }
    @GetMapping("/hello")
    public ResponseEntity<String> test3(@RequestParam String reqParam){
        return ResponseEntity.ok(reqParam);
    }
    @PostMapping("/model")
    public ResponseEntity<Car> test4(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }
}
