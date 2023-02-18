package com.example.usermanage1.usercontroller;

import java.time.LocalDate;
// import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;
import java.util.Map;

// import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import com.annimon.tgbotsmodule.analytics.chatbase.GenericResponse;
import com.example.usermanage1.usermodel.UserModel;
// import com.example.usermanage1.userrepository.UserRepo;
import com.example.usermanage1.userservice.UserService;
// import com.smattme.requestvalidator.RequestValidator;

import jakarta.validation.Valid;

// import java.util.*;

@RestController
public class UserContoller {
   @Autowired
   UserService servi;

   @PostMapping("/adduser")

   public ResponseEntity<?> registerUser(@Valid @RequestBody UserModel user) {
      user.setDate(LocalDate.now());
      user.setTime(LocalTime.now());
      UserModel registeredUser = servi.saveUser(user);
      return ResponseEntity.ok(registeredUser);
   }

   @GetMapping("/GetAll")
   public List<UserModel> getAll() {
      return servi.getAll();
   }

   @GetMapping("/user/{id}")

   public UserModel getbyId(@PathVariable int id) {
      return servi.getbyId(id);
   }

   @PutMapping("/users/{id}")
   public void updateUser(@PathVariable int id, @RequestBody UserModel model) {
      servi.updateUser(id, model);
   }

   @DeleteMapping("/delete/{id}")
   public void deleteuser(@PathVariable int id) {
      servi.deleteuser(id);
   }

}
