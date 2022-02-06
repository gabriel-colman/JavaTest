

package com.gabriel.sigabem;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}