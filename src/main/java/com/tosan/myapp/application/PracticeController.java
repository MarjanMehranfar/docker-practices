package com.tosan.myapp.application;

import org.apache.commons.text.CaseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author M.Mehranfar
 * @since 8/8/2022
 */
@RestController
public class PracticeController {

    @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> greeting(String name) {
        if (StringUtils.hasText(name)) {
            name = CaseUtils.toCamelCase(name, true, ' ');
        } else {
            name = "Stranger";
        }
        return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
    }

    @GetMapping(value = "/author", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAuthorName() {
        return new ResponseEntity<>("Marjan Mehranfar", HttpStatus.OK);
    }

}
