package mx.edu.utez.cv_aumg_9b.controller;

@RestController
@RequestMapping("/api/user1")
@CrossOrigin("*")
public class User1Controller {

    @GetMapping("")
    public String getMessage(){
        return "hola desde controller 1";
    }
}
