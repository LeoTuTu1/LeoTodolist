package br.com.leonardomoura.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping ("/users")
public class UserController {
   
    /*
     * String (texto)
     * Integer (int) números inteiros
     * Double (Double) números  0.0000
     * Float (Float) números 0.000
     * Char (A C)
     * Date (Data)
     * Void
     */
    /*
     * Body
     */
    @PostMapping("/")
      public void create(@RequestBody UserModel userModel) {

         System.out.println(userModel.getUsername());    
      }
}
