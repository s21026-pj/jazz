package pl.pjatk.alepen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.alepen.Car;

@RestController
@RequestMapping("/homework")
public class HomeworkController {
    @GetMapping("/home/{someValue}")
    public ResponseEntity<String> test(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }
    @GetMapping("/home")
    public ResponseEntity<String> test3(@RequestParam String reqParam){
        return ResponseEntity.ok(reqParam);
    }
    @PostMapping("/model")
    public ResponseEntity<Car> test4(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }
    @PutMapping("/model/{someValue}")
    public ResponseEntity<Car> test5(@PathVariable String someValue, @RequestBody Car car){
        car.setName(someValue);
        return ResponseEntity.ok(car);
    }
    @DeleteMapping("/model/{someValue}")
    public ResponseEntity<?> test6(@PathVariable String someValue){
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
