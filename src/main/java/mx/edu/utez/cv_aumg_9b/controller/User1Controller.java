package mx.edu.utez.cv_aumg_9b.controller;

@RestController
@RequestMapping
@CrossOrigin("*")
public class User1Controller {

    @GetMapping("")
    public String getMessage(){
        return "hola desde controller 1";
    }
}
