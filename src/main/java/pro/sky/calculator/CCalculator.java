package pro.sky.calculator;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CCalculator {
    private final ICalculator service;

    public CCalculator(ICalculator service) {
        this.service = service;
    }

    @GetMapping()
    public String welcomeCalculator() {
        return service.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        Integer result = service.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        Integer result = service.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        Integer result = service.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        Double result = service.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }


    @ExceptionHandler(IllegalArgumentException.class)
    public String divideByZero(IllegalArgumentException e, HttpServletResponse response) {
        response.setStatus(400);
        return e.getMessage();
    }

}
